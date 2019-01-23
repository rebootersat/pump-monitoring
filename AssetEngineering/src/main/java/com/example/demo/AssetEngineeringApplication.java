package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AssetEngineeringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetEngineeringApplication.class, args);
	}

}

