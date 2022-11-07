package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fish extends Swim { 
	
	Logger logger = LoggerFactory.getLogger(Fish.class);
	
	void sing(){
		logger.debug("Fishes don’t sing");
	}
	
	void walk(){
		logger.debug("Fishes don’t walk");
	}
	
}
