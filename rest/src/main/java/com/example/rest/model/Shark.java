package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shark extends Fish{
	
	Logger logger = LoggerFactory.getLogger(Shark.class);
	
	void sharkFishCharacter(){
		logger.debug("Sharks are large and grey");
		logger.debug("Sharks eat other fish");
	}

}
