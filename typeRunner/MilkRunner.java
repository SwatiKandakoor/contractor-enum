package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Milk;

public class MilkRunner {
	public static void main(String[] args) {
		Milk milk = new Milk("Almond Milk");
		milk.display();
		System.out.println("------------------");
		milk.setPrice(100);
		milk.quntity = 2;
		milk.display();

	}

}
