package com.xworkz.copy.type;

import com.xworkz.copy.constant.ShirtBrands;

public class Shirt {
	public ShirtBrands brand=ShirtBrands.ARROW;
	public char size;
	public double price;
	public int length=42;
	public static String gender;
	
	public Shirt(char size) {
		this.size=size;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	static {
		Shirt.gender="Womens";
	}
	public void display() {
		System.out.println("Shirt Brand :"+brand);
		System.out.println("size :"+size);
		System.out.println("price :"+price);
		System.out.println("length :"+length);
		System.out.println("Gender :"+gender);
	}

}
