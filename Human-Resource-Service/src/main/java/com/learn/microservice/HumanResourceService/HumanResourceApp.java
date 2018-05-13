package com.learn.microservice.HumanResourceService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HumanResourceApp {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourceApp.class, args);
	}
}
