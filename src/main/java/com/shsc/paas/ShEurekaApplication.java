package com.shsc.paas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ShEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShEurekaApplication.class, args);
	}
}
