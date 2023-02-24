package com.example.devopstool.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class index {

	@RequestMapping("/welcome")
	public String welcome(HttpSession session) {
    	
		return "Hello";
    }
	
	@GetMapping("/AWS")
	public String HelloAWS()
	{
		return "Hello AWS Application";
	}
}
