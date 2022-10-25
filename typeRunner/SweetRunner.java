package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		Sweet sweet = new Sweet(50);

		sweet.display();
		System.out.println("==================");
		sweet.shape = "Square";
		sweet.setName("Mysore Pack");

		sweet.display();
		sweet.displayTotalPrice();
	}

}
