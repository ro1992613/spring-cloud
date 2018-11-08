package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages="com.*")
@EnableEurekaClient
public class EurekaClientConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConfigClientApplication.class, args);
	}
}
