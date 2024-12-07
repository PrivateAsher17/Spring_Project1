package com.servo.mavenproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediatek")
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
