package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("git 真厉害");
		System.out.println(args);
		SpringApplication.run(DemoApplication.class, args);
	}
}
