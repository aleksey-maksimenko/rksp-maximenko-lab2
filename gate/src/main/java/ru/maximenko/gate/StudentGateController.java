package ru.maximenko.gate;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.maximenko.data.api.StudentGateApi;
import ru.maximenko.data.model.StudentGateCreateRequest;
import ru.maximenko.data.model.StudentGateResponse;
import ru.maximenko.gate.client.api.StudentDataApi;
import ru.maximenko.gate.client.model.StudentDataCreateRequest;
import ru.maximenko.gate.client.model.StudentDataResponse;

@RestController
@RequiredArgsConstructor
public class StudentGateController implements StudentGateApi {

    private final StudentDataApi studentsFeignClient;
    /**
     * Проксирует создание студента во внутренний DATA-SERVICE.
     * Получает запрос от клиента, преобразует модель и перенаправляет.
     */
    @Override
    public ResponseEntity<StudentGateResponse> createStudent(StudentGateCreateRequest request) {
        StudentDataCreateRequest dataRequest = new StudentDataCreateRequest();
        dataRequest.setFullName(request.getFullName());
        dataRequest.setPassport(request.getPassport());

        StudentDataResponse dataResponse = studentsFeignClient.createStudentDataInData(dataRequest);

        StudentGateResponse gateResponse = new StudentGateResponse();
        gateResponse.setId(dataResponse.getId());
        gateResponse.setFullName(dataResponse.getFullName());
        gateResponse.setPassport(dataResponse.getPassport());

        return ResponseEntity.status(201).body(gateResponse);
    }

    @Override
    public ResponseEntity<StudentGateResponse> getStudentById(Long studentId) {
        // Вызываем Feign клиент для получения студента из data-service
        StudentDataResponse dataResponse = studentsFeignClient.getStudentDataByIdFromData(studentId);

        // Преобразуем ответ из data-service в формат gate-service
        StudentGateResponse gateResponse = new StudentGateResponse();
        gateResponse.setId(dataResponse.getId());
        gateResponse.setFullName(dataResponse.getFullName());
        gateResponse.setPassport(dataResponse.getPassport());

        return ResponseEntity.ok(gateResponse);
    }
}

