package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.**")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.*")
public class EurekaClientConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumerFeignApplication.class, args);
	}
}
