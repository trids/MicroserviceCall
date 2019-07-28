package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"com.learn.controller","com.learn.service",
		"com.learn.repository","com.learn.entity","com.learn.model"})
public class LoginSignApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSignApplication.class, args);
	}

}
