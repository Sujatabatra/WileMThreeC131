package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Customer;

import com.sujata.persistence.CustomerDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class CustomerServiceApplication/* implements CommandLineRunner*/ {

//	@Autowired
//	private CustomerDao customerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		customerDao.save(new Customer(1,"C001",1,"Intraday",5));
//		customerDao.save(new Customer(2,"C001",2,"CNC",3));
//		customerDao.save(new Customer(3,"C001",4,"Intraday",15));
//		customerDao.save(new Customer(4,"C002",3,"CNC",10));
//		customerDao.save(new Customer(5,"C002",5,"Intraday",20));
//		customerDao.save(new Customer(6,"C002",1,"CNC",5));
//		customerDao.save(new Customer(7,"C003",4,"Intraday",40));
//		customerDao.save(new Customer(8,"C003",5,"Intraday",4));
//		customerDao.save(new Customer(9,"C004",2,"CNC",80));
//		customerDao.save(new Customer(10,"C005",3,"Intraday",20));
//		
//	}

}
