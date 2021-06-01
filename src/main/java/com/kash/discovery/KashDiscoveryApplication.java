package com.kash.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KashDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KashDiscoveryApplication.class, args);
	}

}
