package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Lamp;

public class LampRunner {

	public static void main(String[] args) {

		Lamp lamp = new Lamp("yellow");
		lamp.shows();
		System.out.println("--------------");
		lamp.setHigth(10);
		lamp.shows();
	}

}