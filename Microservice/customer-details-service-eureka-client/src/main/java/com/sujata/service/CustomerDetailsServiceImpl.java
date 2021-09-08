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

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public CustomerDetailsList getCustomerDetailsById(String custId) {
		
		List<CustomerDetails> customerDetailsCollection=new ArrayList<>();
		
		CustomerList customerList=restTemplate.getForObject("http://customer-service/customers/"+custId, CustomerList.class);
		
		for(Customer customer:customerList.getCustomers()) {
			
			Share share=restTemplate.getForObject("http://share-service/shares/"+customer.getShareId(), Share.class);
			
			CustomerDetails customerDetails=new CustomerDetails(customer.getCustomerId(), share.getShareName(), 
					customer.getQuantity(), share.getMarketPrice(), 
					customer.getQuantity()*share.getMarketPrice(), customer.getShareType());
		
			customerDetailsCollection.add(customerDetails);
		}
		
		CustomerDetailsList customerDetailsList=new CustomerDetailsList(customerDetailsCollection);
		
		return customerDetailsList;
	}

}
