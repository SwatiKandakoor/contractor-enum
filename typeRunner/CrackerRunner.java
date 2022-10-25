package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		Cracker cracker = new Cracker(500);

		cracker.display();
		System.out.println("===============================");
		cracker.setType("Daba-daba-Daba");
		cracker.size = 20;
		cracker.display();

	}

}
