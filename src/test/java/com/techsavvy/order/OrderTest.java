package com.techsavvy.order;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import com.techsavvy.factory.ProductFactory;
import com.techsavvy.products.IProduct;
import com.techsavvy.rules.IRules;

public class OrderTest {
	List<IRules> rules = new ArrayList<IRules>();
	@InjectMocks
	Order order;

	@Mock
	ProductFactory productFactory;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}


	@Test
	public void addProductTest() {
		Mockito.when(productFactory.getProduct("book")).thenReturn(new IProduct() {

			@Override
			public void setRules(List<IRules> rules) {
			}

			@Override
			public void processPayment() {
			}

			@Override
			public List<IRules> getRules() {
				// TODO Auto-generated method stub
				return rules;
			}
		});
		ReflectionTestUtils.setField(order, "productFactory",new ProductFactory());


		order.addProduct("book");
	}
}
