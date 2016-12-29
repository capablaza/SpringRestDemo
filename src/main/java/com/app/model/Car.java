package com.app.model;

public class Car {

	private String color;
	private String carNumber;
	
	public Car(String color, String carNumber) {
		super();
		this.color = color;
		this.carNumber = carNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
}
