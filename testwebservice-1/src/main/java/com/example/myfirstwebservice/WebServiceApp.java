package com.example.myfirstwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApp {
	public static void main(String[] args) {
		System.out.println("Running...");
		SpringApplication.run(WebServiceApp.class, args);
	}

}
