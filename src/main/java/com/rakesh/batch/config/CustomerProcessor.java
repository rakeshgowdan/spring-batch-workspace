package com.rakesh.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.rakesh.batch.entities.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		
		return item;
		
	}

}
