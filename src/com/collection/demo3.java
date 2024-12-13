package com.collection;

import java.util.ArrayList;

public class demo3 {
	public static void main(String[] args) {
		ArrayList x1=new ArrayList();
		          x1.add("kolkata");
		          x1.add(54698);
		          x1.add(32.23);
		ArrayList x2=new ArrayList();
		          x2.add("bangalore");
		          x2.add(23);
		          x2.add(2.3);
		          
		          System.out.println(x1);
		          x1.addAll(2, x2);
		          System.out.println(x1);

	}

}
