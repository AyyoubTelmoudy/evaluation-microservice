package com.emsi.pfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EvaluationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluationMicroserviceApplication.class, args);
	}

}
