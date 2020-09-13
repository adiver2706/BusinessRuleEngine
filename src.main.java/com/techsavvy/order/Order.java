package com.techsavvy.order;

import java.util.ArrayList;
import java.util.List;

import com.techsavvy.factory.ProductFactory;
import com.techsavvy.products.IProduct;

public class Order {
	List<IProduct> products = new ArrayList<IProduct>();
	ProductFactory productFactory = new ProductFactory();
	
	public void processOrderPayment(){
		for(int i=0; i<products.size();i++) {
			IProduct product = products.get(i);
			product.processPayment();
		}
	}
	
	public void addProduct(String productType){
  
		IProduct product = productFactory.getProduct(productType);
		products.add(product);
		processOrderPayment();
	}

}
