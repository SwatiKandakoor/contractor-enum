package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		Mango mango = new Mango(2);
		mango.display();
		System.out.println("-------------------");
		mango.setPrice(200);
		mango.display();
		mango.displayTotalPrice();

	}

}
