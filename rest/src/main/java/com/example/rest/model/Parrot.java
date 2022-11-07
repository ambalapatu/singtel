package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parrot extends Bird {
 
	Logger logger = LoggerFactory.getLogger(Parrot.class);
	
	public void sound(String sing) {
		logger.debug(sing);
	}
	
	void fly() {
		logger.debug("Chicken cannot fly");
	}
	
}

