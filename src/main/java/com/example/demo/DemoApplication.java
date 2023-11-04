package com.example.demo;

import com.example.demo.other.DatabaseChecker;
import com.example.demo.other.TestEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		DatabaseChecker checker = context.getBean(DatabaseChecker.class);
		checker.saveEntity(new TestEntity(1, "Hello, world!"));
	}

}
