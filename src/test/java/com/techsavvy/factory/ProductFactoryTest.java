package com.techsavvy.factory;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.techsavvy.utility.PropertiesReader;

public class ProductFactoryTest {
	
	@InjectMocks
	ProductFactory productFactory;
	
	@Mock
	PropertiesReader getMapping;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getProductTest() {
		List<String> stringRules = new ArrayList<String>();
		stringRules.add("royaltyDepartmentSlip");
		stringRules.add("payments");
		Mockito.when(getMapping.loadProperties("book")).thenReturn(stringRules);
		productFactory.getProduct("book");
		
		
	}
}
