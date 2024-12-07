package com.servo.mavenproject;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;

	public String getBrand() {
		return brand;
	}

	//Setter Injection
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	
}
