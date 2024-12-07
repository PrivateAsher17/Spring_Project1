package com.servo.mavenproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // This is to set Priority
public class Mediatek implements Processor{

	@Override
	public void process() {
		System.out.println("2nd Best CPU");
		
	}
	
}
