package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Customer;
import com.sujata.bean.CustomerList;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "customer",fallbackMethod = "getCustomerListFallBack")
	public CustomerList getCustomerList(String custId) {
		return restTemplate.getForObject("http://customer-service/customers/"+custId, CustomerList.class);
	}
	
	public CustomerList getCustomerListFallBack(String custId,Exception e) {
		List<Customer> customers=new ArrayList<>();
		customers.add(new Customer(101, custId, 1, "Dummy Type", 0));
		return new CustomerList(customers);
	}

}
