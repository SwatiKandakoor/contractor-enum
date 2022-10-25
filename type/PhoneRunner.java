package com.xworkz.copy.type;

import com.xworkz.copy.constant.Brand;
import com.xworkz.copy.constant.Customer;
import com.xworkz.copy.constant.Files;

public class PhoneRunner {

	public static void main(String[] args) {

		int[] phoneRAM = { 4, 8, 64, 128 };

		Phone phone = new Phone("Screen Touch", 20000d, Brand.APPLE, Files.DOWNLOAD, phoneRAM, Customer.NAVEEN);
		System.out.println(phone.phoneRAM);
		phone.display();

	}

}
