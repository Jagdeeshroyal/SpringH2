package com.example.springH2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping(value = "/")
	public String helloMethod() {		
		return "Jagadeesh Royal Started on Oct-03-2022";
	}
}
