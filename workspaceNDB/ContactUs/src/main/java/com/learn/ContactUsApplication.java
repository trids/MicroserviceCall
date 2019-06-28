package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"com.learn.cuController","com.learn.cuService",
		"com.learn.cuRepo","com.learn.cuEntity"})
public class ContactUsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactUsApplication.class, args);
	}

}
