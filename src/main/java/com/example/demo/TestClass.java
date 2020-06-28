package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {

	@GetMapping("/new")
	public String hello()
	{
		return "HI ITZ ME RIA";
	}
}
