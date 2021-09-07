package com.sujata.service;

import java.util.List;

import com.sujata.bean.Customer;

public interface CustomerService {

	List<Customer> getCustomersByCustomerId(String custId);
}
