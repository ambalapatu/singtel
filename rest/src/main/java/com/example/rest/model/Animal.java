package com.example.rest.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
	
	Logger logger = LoggerFactory.getLogger(Animal.class);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private String name;

	private String fly;

	private String walk;

	private String sing;

	private String swim;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

	public String getSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}

	public String getSwim() {
		return swim;
	}

	public void setSwim(String swim) {
		this.swim = swim;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	void walk(){
		logger.debug("I am walking");
	}

	
}
