package com.example.springH2;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String helloMethod() {		
		return "Jagadeesh Royal Started on Oct-03-2022";
	}
}
