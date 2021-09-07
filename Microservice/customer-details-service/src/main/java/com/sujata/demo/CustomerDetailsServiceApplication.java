package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class CustomerDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDetailsServiceApplication.class, args);
	}
	
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
