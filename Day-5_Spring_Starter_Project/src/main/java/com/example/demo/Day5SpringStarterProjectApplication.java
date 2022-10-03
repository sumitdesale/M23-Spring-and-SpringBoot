package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.springmvc.Student;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Day5SpringStarterProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Day5SpringStarterProjectApplication.class, args);
	//	System.out.println("hello");
		
		//Student s=new Student();
		ConfigurableApplicationContext c=SpringApplication.run(Day5SpringStarterProjectApplication.class, args);

		Student s=c.getBean(Student.class);
		s.display();
	}

}
