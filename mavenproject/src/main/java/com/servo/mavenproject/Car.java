package com.servo.mavenproject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("chal rha hai...");
	}
}
