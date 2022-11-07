package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck extends Bird implements BirdSound {
	
	Logger logger = LoggerFactory.getLogger(Duck.class);
	
	@Override
	public void sound() {
		logger.debug("Quack, quack");
	}
	
	void swim() {
		logger.debug("Duck can swim");
	}
	
}

