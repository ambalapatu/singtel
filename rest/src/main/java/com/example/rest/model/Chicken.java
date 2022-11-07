package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chicken extends Bird implements BirdSound  {
	
	Logger logger = LoggerFactory.getLogger(Chicken.class);
	
	@Override
	public void sound() {
		logger.debug("Cluck, cluck");
	}
	
	void fly() {
		logger.debug("Chicken cannot fly");
	}

}

