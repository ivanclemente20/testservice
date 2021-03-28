package com.example.myfirstwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstwebservice.service.GreetingService;

@RestController
@RequestMapping("/api")


public class GreetingRest {
	@Autowired
	GreetingService service;
	
	@Value("${custom.config.key}")
	float key;

	
	@GetMapping("/greet")
	public String greetByPassingParam(@RequestParam int i, @RequestParam int v, @RequestParam int a, @RequestParam int n) {		
		return service.viewGreeting((i + v + a + n)*key);
	}
	

}
