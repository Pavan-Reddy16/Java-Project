package com.example.firstproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class firstprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(firstprojectApplication.class, args);

		System.out.println("Hello World");
	}
}
