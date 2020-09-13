package com.techsavvy.rules;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class EmailTest {
	@InjectMocks
	Email email;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void applyRulesTest() {
		email.applyRules();
	}

}
