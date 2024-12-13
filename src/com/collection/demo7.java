package com.collection;

import java.util.ArrayList;

public class demo7 {
public static void main(String[] args) {
	ArrayList x=new ArrayList();
	x.add("bangalore");
	x.add(99);
	x.add('a');
	x.add(62.28);
	x.add("kolkata");
	x.add(2, "delhi");
	System.out.println(x);
}
}
