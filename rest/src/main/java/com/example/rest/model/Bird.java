package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bird extends Animal {
	
	Logger logger = LoggerFactory.getLogger(Bird.class);
	
	void fly() { 
		 logger.debug("A butterfly can fly"); 
	}
	 
	void sound() {
		logger.debug("A butterfly does not make a sound");
	}
	
}

