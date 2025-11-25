package ru.maximenko.gate.client.api;

import ru.maximenko.gate.client.ApiClient;
import ru.maximenko.gate.client.EncodingUtils;
import ru.maximenko.gate.client.model.ApiResponse;

import ru.maximenko.gate.client.model.StudentDataCreateRequest;
import ru.maximenko.gate.client.model.StudentDataResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-25T14:18:53.127313800+03:00[Europe/Moscow]", comments = "Generator version: 7.15.0")
public interface StudentDataApi extends ApiClient.Api {


  /**
   * Создать студента в БД
   * Создает запись о студенте в базе данных.
   * @param studentDataCreateRequest  (required)
   * @return StudentDataResponse
   */
  @RequestLine("POST /students")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StudentDataResponse createStudentDataInData(@jakarta.annotation.Nonnull StudentDataCreateRequest studentDataCreateRequest);

  /**
   * Создать студента в БД
   * Similar to <code>createStudentDataInData</code> but it also returns the http response headers .
   * Создает запись о студенте в базе данных.
   * @param studentDataCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /students")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StudentDataResponse> createStudentDataInDataWithHttpInfo(@jakarta.annotation.Nonnull StudentDataCreateRequest studentDataCreateRequest);



  /**
   * Получить данные студента из БД
   * Возвращает информацию о студенте по идентификатору.
   * @param id Идентификатор студента (required)
   * @return StudentDataResponse
   */
  @RequestLine("GET /students/{id}")
  @Headers({
    "Accept: application/json",
  })
  StudentDataResponse getStudentDataByIdFromData(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * Получить данные студента из БД
   * Similar to <code>getStudentDataByIdFromData</code> but it also returns the http response headers .
   * Возвращает информацию о студенте по идентификатору.
   * @param id Идентификатор студента (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /students/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StudentDataResponse> getStudentDataByIdFromDataWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);


}
