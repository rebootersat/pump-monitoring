package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories("com.sandeep.org.asset.engg.repository")
@ComponentScan(basePackages = { "com.sandeep.org.asset.engg.repository",
								"com.sandeep.org.asset.engg.services",
								"com.sandeep.org.asset.engg.controller" 
							  })
@EntityScan("com.sandeep.org.asset.engg.models")
public class AssetEngineeringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetEngineeringApplication.class, args);
	}

}
