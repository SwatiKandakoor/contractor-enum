package com.xworkz.copy.type;

import com.xworkz.copy.constant.SweetColors;

public class Sweet {
	public int quntity;// const
	public String name;// method
	public double price = 40d;// literal
	public String shape;// ref
	public SweetColors color = SweetColors.YELLOW;// enum
	public static String shopName;// static block

	public Sweet(int quntity) {
		this.quntity = quntity;
	}

	public void displayTotalPrice() {
		double total = quntity * this.price;
		System.out.println("Total price of the sweets = " + total);
	}

	public void setName(String name) {
		this.name = name;

	}

	static {
		shopName = "Mahalakshmi Sweets";

	}

	public void display() {
		System.out.println("quntity :" + this.quntity);
		System.out.println("name :" + this.name);
		System.out.println("price :" + this.price);
		System.out.println("shape :" + this.shape);
		System.out.println("SweetColors :" + this.color);
		System.out.println("ShopName :" + Sweet.shopName);
	}

}
