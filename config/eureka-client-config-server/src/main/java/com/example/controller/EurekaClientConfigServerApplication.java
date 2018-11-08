package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(scanBasePackages="com.*")
@EnableConfigServer
@EnableDiscoveryClient
public class EurekaClientConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConfigServerApplication.class, args);
	}
}
