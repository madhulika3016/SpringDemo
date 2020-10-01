package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=  SpringApplication.run(FirstProjApplication.class, args);
		System.out.println("Welcome to Boot....");
		
		
		  Student s=ctx.getBean(Student.class); 
		  System.out.println(s.hashCode());
		  s.show();
			/*
			 * Student s1=ctx.getBean(Student.class); System.out.println(s1.hashCode());
			 * s1.show();
			 */		 
	 
	}

}
