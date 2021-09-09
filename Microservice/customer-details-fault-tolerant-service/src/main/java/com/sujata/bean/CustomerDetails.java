package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerDetails {

	private String customerId;
	private String shareName;
	private int quantity;
	private double unitPrice;
	private double totalValuation;
	private String shareType;
}

