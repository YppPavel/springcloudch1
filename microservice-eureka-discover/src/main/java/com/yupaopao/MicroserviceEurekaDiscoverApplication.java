package com.yupaopao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaDiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaDiscoverApplication.class, args);
	}
}
