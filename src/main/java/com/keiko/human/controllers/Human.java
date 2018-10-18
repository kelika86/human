package com.keiko.human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/your_server")
public class Human {
	@RequestMapping("")
	public String index(@RequestParam(value="name", required=false) String first_name) {
		if(first_name==null) {
			return "Hello Human! Welcome to Spring Boot!" ;
		}else {
			return "Hello " + first_name +"! Welcome to Sprint Boot!";
		}
	}
	
	
}
