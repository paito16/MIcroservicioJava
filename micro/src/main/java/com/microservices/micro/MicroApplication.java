package com.microservices.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class MicroApplication {

	@GetMapping("/dobby")
	public String getMessage(){
		return "Mi primer microservicio";
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroApplication.class, args);
	}

}
