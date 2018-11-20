package com.project.microservices.limitsservice.bean;

public class limitConfig {

	private int minimum;
	private int maximum;
	
	public limitConfig() {
	}
	
	
	public limitConfig(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}


	public int getMinimum() {
		return minimum;
	}


	public int getMaximum() {
		return maximum;
	}
	
	
}
