package com.xworkz.copy.type;

import com.xworkz.copy.constant.MangoTypes;

public class Mango {
	public MangoTypes type = MangoTypes.TOTAPURI;
	public int quntity;
	public double price;
	public static String color;

	public Mango(int quntity) {
		this.quntity = quntity;

	}

	public void displayTotalPrice() {
		double total = this.price * quntity;
		System.out.println("total price of Totapuri Mango = " + total);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	static {
		Mango.color = "Yellow";
	}

	public void display() {
		System.out.println("Mango Types Name : " + type);
		System.out.println("quntity :" + quntity);
		System.out.println("price :" + price);
		System.out.println("Mango color :" + Mango.color);
	}
}
