package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class HelloApplication {
	
	@RequestMapping("/")
	String home() {
        return "Hello Azar1!";
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
