package com.methodoverlaoding;

public class overload {
	public static void demo(int a) {
		System.out.println(a);
	}
	public static void demo(double b) {
		System.out.println(b);
	}
	public static void demo(int d,String c) {
		System.out.println(d+" "+c);
	}
	public static void main(String[] args) {
		demo(15);
		demo(55.55);
		demo(15, "java");
	}

}
