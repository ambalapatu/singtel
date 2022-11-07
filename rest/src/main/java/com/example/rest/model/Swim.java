package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swim extends Animal {
	
	Logger logger = LoggerFactory.getLogger(Swim.class);
	
	void swim(){
		logger.debug("Fishes can swim");
	}
	
}
