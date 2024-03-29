package com.spring.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

	@SpringBootApplication
public class AuthenticationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationAppApplication.class, args);	
	}

}
