package com.servo.mavenproject;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	private Processor processor;
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void details() {
		System.out.println("16gb Ram, 500 GB Storage");
		processor.process();
	}
}
