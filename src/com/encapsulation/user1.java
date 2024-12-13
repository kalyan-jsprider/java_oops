package com.encapsulation;

public class user1 {
	public static void main(String[] args) {
		bank x=new bank();
		int y=x.username();
		System.out.println(y);
		x.setpin(32165);
		int z=x.username();
		System.out.println(z);
	}

}
