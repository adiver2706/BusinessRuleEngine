package com.techsavvy.factory;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class RuleFactoryTest {
	@InjectMocks
	RuleFactory ruleFactory;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getRulesTest() {
		List<String> stringRules = new ArrayList<String>();
		stringRules.add("royaltyDepartmentSlip");
		stringRules.add("payments");
		ruleFactory.getRules(stringRules);
		
	}

}
