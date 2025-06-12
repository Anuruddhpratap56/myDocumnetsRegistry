package com.mydocs.eureka.mydocsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MydocsregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydocsregistryApplication.class, args);
	}

}
