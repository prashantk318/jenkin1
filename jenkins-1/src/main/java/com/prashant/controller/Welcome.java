package com.prashant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.model.Springboot;

@RestController
@RequestMapping("/")
public class Welcome {
	
	@RequestMapping("/hello")
	public Springboot hello() {
		
		return new Springboot("hello World");
		
	}

}
