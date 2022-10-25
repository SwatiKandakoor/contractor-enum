package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Shirt;

public class ShirtRunner {
	public static void main(String[] args) {
		Shirt shirt = new Shirt('M');
		shirt.display();
		System.out.println("--------------------");
		shirt.setPrice(500);

		shirt.display();

	}
}