package com.javaprojects.springbootjavaazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJavaAzureDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Congrats!! your application is deployed in Azure Platfrom";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJavaAzureDemoApplication.class, args);
	}

}
