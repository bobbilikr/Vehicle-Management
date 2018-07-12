package com.coding.test.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public abstract class AbstractVehicle {

	private int id;

	private double price;

	private int manfacturedyear;

	private int speed;

	private String model;

	private String type;

	abstract public double calculatePrice(String type);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getManfacturedyear() {
		return manfacturedyear;
	}

	public void setManfacturedyear(int manfacturedyear) {
		this.manfacturedyear = manfacturedyear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
