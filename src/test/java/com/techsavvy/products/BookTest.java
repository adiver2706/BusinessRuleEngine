package com.techsavvy.products;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import com.techsavvy.rules.IRules;

public class BookTest {
	
	@InjectMocks
	Book book;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void processPayment() {
		List<IRules> rules = new ArrayList<IRules>();
		rules.add(new IRules() {
			
			@Override
			public void applyRules() {
				System.out.println("Apply the rules accordingly");
				
			}
		});
		ReflectionTestUtils.setField(book, "rules",rules);
		book.processPayment();
		
		
	}

}
