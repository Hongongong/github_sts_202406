package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GithubProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubProjectApplication.class, args);
		
		System.out.println("깃헙 연결 테스트");
	}

}
