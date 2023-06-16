package com.tys.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api")
public class DockerApplication {

	@GetMapping("/name")
	public String myName() {
		return "My name is Docker Container";
	}

	// system port number : 10.10.50.1
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
