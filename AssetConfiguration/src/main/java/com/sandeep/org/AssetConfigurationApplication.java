package com.sandeep.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AssetConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetConfigurationApplication.class, args);
	}

}

