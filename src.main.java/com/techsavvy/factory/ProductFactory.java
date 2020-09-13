package com.techsavvy.factory;

import java.util.ArrayList;
import java.util.List;

import com.techsavvy.products.Book;
import com.techsavvy.products.IProduct;
import com.techsavvy.products.Membership;
import com.techsavvy.products.PhysicalProduct;
import com.techsavvy.products.Upgrade;
import com.techsavvy.products.Video;
import com.techsavvy.rules.IRules;
import com.techsavvy.utility.PropertiesReader;

public class ProductFactory {
	IProduct product;
	RuleFactory ruleFactory = new RuleFactory();
	PropertiesReader getMapping = new PropertiesReader();
	List<String> stringRules = new ArrayList<String>();
	List<IRules> rules = new ArrayList<IRules>();
	public IProduct getProduct(String productType) {
		switch(productType) {
		case "book":
			product = new Book();
			stringRules = getMapping.loadProperties("book");
			break;
		
		case "physicalProduct":
			product = new PhysicalProduct();
			stringRules = getMapping.loadProperties("physicalProduct");
		break;
		
		case "membership":
			product = new Membership();
			stringRules = getMapping.loadProperties("membership");
			break;
		
		case "upgrade":
			product = new Upgrade();
			stringRules = getMapping.loadProperties("upgrade");
			break;
		
		case "video":
			product = new Video();
			stringRules = getMapping.loadProperties("video");
			break;
			
		default:
			throw new IllegalArgumentException("Please Enter a Valid Choice");
				
		}
		ArrayList<IRules> ruleList = ruleFactory.getRules(stringRules);
		product.setRules(ruleList);
		
		return product;
	}

}
