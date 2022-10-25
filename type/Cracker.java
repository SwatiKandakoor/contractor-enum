package com.xworkz.copy.type;

import com.xworkz.copy.constant.CrackerNames;

public class Cracker {

	public double price;
	public String type;
	public boolean pollution = true;
	public int size;
	public static int expiredDate;
	public CrackerNames name = CrackerNames.LAXMI;

	public Cracker(double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	static {
		expiredDate = 9;

	}

	public void display() {
		System.out.println("Price :" + this.price);
		System.out.println("CrackerSounds :" + this.type);
		System.out.println("Pollution :" + this.pollution);
		System.out.println("Size :" + this.size);
		System.out.println("ExpiredDate :" + Cracker.expiredDate);
		System.out.println("CrackerName :" + this.name);
	}
}
