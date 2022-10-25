package com.xworkz.copy.type;

import com.xworkz.copy.constant.LampNames;

public class Lamp {
	public String color;
	public int hight;
	public int width = 3;
	public LampNames name = LampNames.OIL_LAMP;
	public static String material;

	public Lamp(String color) {
		this.color = color;
	}

	public void setHigth(int hight) {
		this.hight = hight;

	}

	static {
		material = "Metal";
	}

	public void shows() {
		System.out.println("Color :" + this.color);
		System.out.println("Hight :" + this.hight);
		System.out.println("width :" + this.width);
		System.out.println("LampNames :" + this.name);
		System.out.println("Material :" + Lamp.material);

	}

}
