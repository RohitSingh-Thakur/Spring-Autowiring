package com.techcarver.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier(value = "petrolObject")
	private Engine engine;

	public void start() {
		engine.startEngine();
		System.out.println("Hours Power : " + engine.getHorsePower());
		System.out.println("Fule Tyle: " + engine.getFuelType());
	}
}


