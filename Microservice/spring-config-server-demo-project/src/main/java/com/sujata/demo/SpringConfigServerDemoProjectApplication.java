package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerDemoProjectApplication.class, args);
	}

}
