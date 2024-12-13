package com.encapsulation;

public class users {
	public static void main(String[] args) {
		flipkart x=new flipkart();
		int y=x.username();
		System.out.println(y);
		x.setPin(55555);
		int m=x.username();
		System.out.println(m);
	}

}
