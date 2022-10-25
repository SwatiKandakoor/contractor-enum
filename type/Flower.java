package com.xworkz.copy.type;

import com.xworkz.copy.constant.FlowerNames;

public class Flower {

	public String color;
	public double price;
	public int weigth;
	public static int noOfPetals;
	public FlowerNames name = FlowerNames.HIBISCUS;

	public Flower(String color) {
		this.color = color;

	}

	public void setPrice(double price) {
		this.price = price;

	}

	static {
		noOfPetals = 5;
	}

	public void shows() {
		System.out.println("Color :" + this.color);
		System.out.println("Price :" + this.price);
		System.out.println("Weigth :" + this.weigth);
		System.out.println("No of Petals :" + Flower.noOfPetals);
		System.out.println("Flower name :" + this.name);
	}

}
