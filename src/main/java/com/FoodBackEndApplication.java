package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan

public class FoodBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodBackEndApplication.class, args);
		System.out.println("App running on port 9090");
	}

}
