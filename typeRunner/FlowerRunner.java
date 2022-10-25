package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		Flower flower = new Flower("Red");
		flower.shows();
		System.out.println("---------------------");
		flower.setPrice(200);
		flower.weigth = 1;
		flower.shows();
	}

}
