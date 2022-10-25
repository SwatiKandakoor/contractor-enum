package com.xworkz.copy.type;

import com.xworkz.copy.constant.Brand;
import com.xworkz.copy.constant.Customer;
import com.xworkz.copy.constant.Files;

public class Phone {

	public String type;
	public double price;
	public Brand brand = Brand.APPLE;
	public Files files = Files.DOWNLOAD;
	public Customer cust = Customer.NAVEEN;
	public int[] phoneRAM;

	public Phone(String type, double price, Brand brand, Files files, int[] phoneRAM, Customer cust) {
		this.type = type;
		this.price = price;
		this.brand = brand;
		this.files = files;
		this.cust = cust;
		this.phoneRAM = phoneRAM;
	}

	public void display() {
		System.out.println("Type :" + this.type);
		System.out.println("Price :" + this.price);
		System.out.println("Brand :" + this.brand);
		System.out.println("Files :" + this.files);
		System.out.println("Customer :" + this.cust);
		System.out.println("PhoneRAM :" + this.phoneRAM);

	}

}
