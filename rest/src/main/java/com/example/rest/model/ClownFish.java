package com.example.rest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClownFish extends Fish{
	
	Logger logger = LoggerFactory.getLogger(ClownFish.class);
	
	void clownFish(){
		logger.debug("Clownfish are small and colourful (orange)");
		logger.debug("Clownfish make jokes");
	}

}
