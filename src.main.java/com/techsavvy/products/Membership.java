package com.techsavvy.products;

import java.util.ArrayList;
import java.util.List;

import com.techsavvy.rules.IRules;

public class Membership implements IProduct {
	List<IRules> rules = new ArrayList<IRules>();

	public List<IRules> getRules() {
		return rules;
	}

	public void setRules(List<IRules> rules) {
		this.rules = rules;
	}

	@Override
	public void processPayment() {
		rules = getRules();
		for(int i=0; i<rules.size();i++) {
			IRules rule = rules.get(i);
			rule.applyRules();
		}
	}
}
