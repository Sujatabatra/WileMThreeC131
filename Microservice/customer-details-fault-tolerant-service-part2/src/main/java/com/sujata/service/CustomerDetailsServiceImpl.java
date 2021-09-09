package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Customer;
import com.sujata.bean.CustomerDetails;
import com.sujata.bean.CustomerDetailsList;
import com.sujata.bean.CustomerList;
import com.sujata.bean.Share;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ShareService shareService;
	
	@Override
//	@CircuitBreaker(name = "customerDetails",fallbackMethod = "getCustomerDetailsByIdFallBack")
	public CustomerDetailsList getCustomerDetailsById(String custId) {
		
		List<CustomerDetails> customerDetailsCollection=new ArrayList<>();
		
//		CustomerList customerList=restTemplate.getForObject("http://customer-service/customers/"+custId, CustomerList.class);
		CustomerList customerList=customerService.getCustomerList(custId);
		
		for(Customer customer:customerList.getCustomers()) {
			
//			Share share=restTemplate.getForObject("http://share-service/shares/"+customer.getShareId(), Share.class);
			Share share=shareService.getShareDetails(customer.getShareId());

			CustomerDetails customerDetails=new CustomerDetails(customer.getCustomerId(), share.getShareName(), 
					customer.getQuantity(), share.getMarketPrice(), 
					customer.getQuantity()*share.getMarketPrice(), customer.getShareType());
		
			customerDetailsCollection.add(customerDetails);
		}
		
		CustomerDetailsList customerDetailsList=new CustomerDetailsList(customerDetailsCollection);
		
		return customerDetailsList;
	}

//	@CircuitBreaker(name = "customer",fallbackMethod = "getCustomerListFallBack")
//	public CustomerList getCustomerList(String custId) {
//		return restTemplate.getForObject("http://customer-service/customers/"+custId, CustomerList.class);
//	}
//	
//	public CustomerList getCutomerListFallBack(Exception e) {
//		List<Customer> customers=new ArrayList<>();
//		customers.add(new Customer(101, "Dummy Customer", 1, "Dummy Type", 0));
//		return new CustomerList(customers);
//	}
	
//	@CircuitBreaker(name = "share",fallbackMethod = "getShareDetailsFallBack")
//	public Share getShareDetails(int shareId) {
//		return restTemplate.getForObject("http://share-service/shares/"+shareId, Share.class);
//	}
//	
//	public Share getShareDetailsFallBack(Exception e) {
//		return new Share(0, "Dummy Share", 0);
//	}
//	public CustomerDetailsList getCustomerDetailsByIdFallBack(Exception e) {
//		List<CustomerDetails> customers=new ArrayList<>();
//		customers.add(new CustomerDetails(null, null, 0, 0, 0, null));
//		return new CustomerDetailsList(customers);
//	}

}
