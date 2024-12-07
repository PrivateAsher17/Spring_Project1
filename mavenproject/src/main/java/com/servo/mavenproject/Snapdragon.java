package com.servo.mavenproject;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	@Override
	public void process() {
		System.out.println("World's Best Processor...");

	}

}
