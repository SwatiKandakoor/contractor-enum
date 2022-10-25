package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Lamp;
import com.xworkz.copy.type.Saloon;

public class SaloonRunner {
	public static void main(String[] args) {
		Saloon saloon = new Saloon(500);
		saloon.display();
		System.out.println("---------------");
		saloon.setOneDayCustmers(25);
		saloon.display();
	}
}