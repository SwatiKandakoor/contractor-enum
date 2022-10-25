package com.xworkz.copy.type;

import com.xworkz.copy.Names;

public class Saloon {
	public double price;
	public int oneDayCustmers;
	public int workers=4;
	public Names name=Names.FACIALS;
	public static String shopName;

	public Saloon(double price) {
		this.price = price;
	}

	public void setOneDayCustmers(int oneDayCustmers) {
		this.oneDayCustmers = oneDayCustmers;
	}

	static {
		Saloon.shopName = "Green Trends";
	}

	public void display() {
		System.out.println("price :" +this.price);
		System.out.println("OneDayCustmers :" +this.oneDayCustmers);
		System.out.println("workers :" +this.workers);
		System.out.println("Names :" + this.name);
		System.out.println("Shop name :" + Saloon.shopName);
	}
}
