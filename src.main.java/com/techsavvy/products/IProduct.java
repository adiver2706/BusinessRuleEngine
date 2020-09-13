package com.techsavvy.products;

import java.util.List;

import com.techsavvy.rules.IRules;

public interface IProduct {
	void setRules(List<IRules> rules);
	List<IRules> getRules();
	void processPayment();

}
