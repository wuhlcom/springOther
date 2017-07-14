package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Autowired
	void setEnvironment(Environment env) {
		System.out.println("my-config.appName from env: " + env.getProperty("my-config.appName"));
	}
}
