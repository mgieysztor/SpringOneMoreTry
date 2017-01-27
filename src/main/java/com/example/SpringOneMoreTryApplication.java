package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOneMoreTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOneMoreTryApplication.class,args);
		MyAwesomeController myAwesomeController = new MyAwesomeController();

	}
}
