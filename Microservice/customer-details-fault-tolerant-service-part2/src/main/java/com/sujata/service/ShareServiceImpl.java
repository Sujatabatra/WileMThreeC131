package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Share;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "share",fallbackMethod = "getShareDetailsFallBack")
	public Share getShareDetails(int shareId) {
		return restTemplate.getForObject("http://share-service/shares/"+shareId, Share.class);
	}
	
	public Share getShareDetailsFallBack(int shareId,Exception e) {
		return new Share(shareId, "Dummy Share", 0);
	}

}
