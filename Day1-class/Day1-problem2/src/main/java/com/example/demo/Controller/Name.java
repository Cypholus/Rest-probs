package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
private String var="Project";

@GetMapping("NAME")


	public String display() {
	return "Welcome to this "+var;
		
	}

}
