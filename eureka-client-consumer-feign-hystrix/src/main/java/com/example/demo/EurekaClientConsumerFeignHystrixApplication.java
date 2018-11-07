package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients(basePackages = "com.**")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.*")
public class EurekaClientConsumerFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumerFeignHystrixApplication.class, args);
	}
}
