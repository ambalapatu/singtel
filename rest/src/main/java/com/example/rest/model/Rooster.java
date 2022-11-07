package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rooster extends Bird implements BirdSound {
	
	Logger logger = LoggerFactory.getLogger(Rooster.class);
 
	@Override
	public void sound() {
		logger.debug("Cock-a-doodle-doo");
	}
	
	void fly() {
		logger.debug("Chicken cannot fly");
	}

	
}

