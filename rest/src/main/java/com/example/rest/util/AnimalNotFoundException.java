package com.example.rest.util;

public class AnimalNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnimalNotFoundException(Long id) {
        super("Animal id not found : " + id);
    }

}
