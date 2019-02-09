package com.sandeep.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories("com.sandeep.org.asset.configure.repository")
@ComponentScan(basePackages = { "com.sandeep.org.asset.configure.service", "com.sandeep.org.asset.configure.repository",
		"com.sandeep.org.asset.configure.controller" })
@EntityScan(basePackages = { "com.sandeep.org.asset.configure.models" })
public class AssetConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetConfigurationApplication.class, args);
	}

}
