package com.techsavvy.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertiesReader {
	String[] rules;
	public List<String> loadProperties(String productName) {
		
		try(FileReader reader = new FileReader("resources/ProductRuleMapping.properties") ) {
			Properties properties = new Properties();
			properties.load(reader);
			rules = properties.getProperty(productName).split(",");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList(rules);
	}
}
