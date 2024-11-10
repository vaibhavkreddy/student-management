package com.spring;

import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
	
	public String print() {
		System.out.println("Hello");
		return "Hello";
	}

}
