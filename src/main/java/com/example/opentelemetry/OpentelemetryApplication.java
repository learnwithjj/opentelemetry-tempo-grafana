package com.example.opentelemetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpentelemetryApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpentelemetryApplication.class, args);
	}


	@GetMapping
	public String hello(){
		return "Hello world";
	}
}
