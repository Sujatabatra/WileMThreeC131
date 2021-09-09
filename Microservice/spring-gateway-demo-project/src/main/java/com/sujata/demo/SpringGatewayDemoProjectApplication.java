package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringGatewayDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayDemoProjectApplication.class, args);
	}

}
