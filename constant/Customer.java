package com.xworkz.copy.constant;

public enum Customer {
	
	NAVEEN(8073982483l,"Navven"),SWATI(9980361822l,"Swati"),SAHANA(7019336631l,"Sahana");
	
	public long number;
	public String name;
	
	private Customer(long no,String type) {
		this.number=no;
		this.name=type;
		
	}

}
