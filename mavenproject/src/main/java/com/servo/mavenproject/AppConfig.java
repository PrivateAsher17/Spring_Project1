package com.servo.mavenproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Samsung getDetails() {
		return new Samsung();
	}
	@Bean
	public Processor getProcess() {
		return new Snapdragon();
	}
}
