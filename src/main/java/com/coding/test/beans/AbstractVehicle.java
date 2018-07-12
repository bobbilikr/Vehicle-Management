package com.coding.test.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public abstract class AbstractVehicle {

	private int id;

	private double price;

	private int manfacturedyear;

	private int speed;

	private String model;

	private String type;

	abstract protected int calculateprice();


}