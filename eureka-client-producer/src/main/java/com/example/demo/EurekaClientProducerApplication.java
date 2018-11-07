package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.*")
public class EurekaClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProducerApplication.class, args);
	}
}
