package com.xworkz.copy.type;

import com.xworkz.copy.constant.MilkProducts;

public class Milk {
	public MilkProducts products=MilkProducts.BUTTER;
	public static String brand;
	public String name;
	public double price;
	public int quntity;
	public boolean milkIsHealthy = true;

	public Milk(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	static {
		Milk.brand = "Nandini";
	}

	public void display() {
		System.out.println("Milk Products :" + products);
		System.out.println("Brand :" + Milk.brand);
		System.out.println("Milk name :" + name);
		System.out.println("Milk price :" + price);
		System.out.println("Milk quntity :" + quntity);
		System.out.println("Milk is healthy :" + milkIsHealthy);
	}

}
