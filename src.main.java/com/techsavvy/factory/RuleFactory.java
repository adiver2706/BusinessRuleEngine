package com.techsavvy.factory;

import java.util.ArrayList;
import java.util.List;

import com.techsavvy.rules.ActivateMembership;
import com.techsavvy.rules.AddVideo;
import com.techsavvy.rules.Email;
import com.techsavvy.rules.IRules;
import com.techsavvy.rules.Payment;
import com.techsavvy.rules.RoyaltyDepartmentSlip;
import com.techsavvy.rules.ShippingSlip;
import com.techsavvy.rules.UpgradeMembership;

public class RuleFactory {
	IRules rule;
	public IRules getRule(String ruleType) {
		switch(ruleType) {
		case "activateMembership":
			rule = new ActivateMembership();
			break;

		case "addVideo":
			rule = new AddVideo();
			break;

		case "email":
			rule = new Email();
			break;

		case "payments":
			rule = new Payment();
			break;

		case "royaltyDepartmentSlip":
			rule = new RoyaltyDepartmentSlip();
			break;

		case "shippingSlip":
			rule = new ShippingSlip();
			break;

		case "upgradeMembership":
			rule = new UpgradeMembership();
			break;

		default:
			new IllegalArgumentException("Please Enter a Valid Choice");
		}

		return rule;

	}

	public ArrayList<IRules> getRules(List<String> ruleTypes) {
		ArrayList<IRules> ruleList= new ArrayList<IRules>();
		for(int i=0; i<ruleTypes.size(); i++) {
			IRules tempRule = getRule(ruleTypes.get(i));
			ruleList.add(tempRule);
	}
		return ruleList;
}



}
