package com.kpispring.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello from main!");
	}
}
