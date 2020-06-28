package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	
	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	         return application.sources(DemoApplication .class);
	    }


	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(DemoApplication.class, args);
	}

}
