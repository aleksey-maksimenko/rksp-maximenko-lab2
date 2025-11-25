package ru.maximenko.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "ru.maximenko.gate.client.api")
public class GateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateApplication.class, args);
	}

}
