package com.techcarver.root;

public class Engine {

	private int horsePower;
	private String fuelType;

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	void startEngine() {
		System.out.println("engine starting...");
	}
}


