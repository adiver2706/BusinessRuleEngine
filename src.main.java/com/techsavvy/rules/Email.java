package com.techsavvy.rules;

public class Email implements IRules {

	@Override
	public void applyRules() {
		System.out.println("Email sent to the recipient informing the upgradation of Membership");

	}

}
