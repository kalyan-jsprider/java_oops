package com.collection;

import java.util.ArrayList;

public class demo1 {
public static void main(String[] args) {
	ArrayList m=new ArrayList();
	          m.add("bangalore");
	          m.add('a');
	          m.add(55);
	          ArrayList m2=new ArrayList();
	                    m2.add("delhi");
	                    m2.add(55);
	                    m2.add('a');
	                    System.out.println(m);
	                    m.addAll(m2);
	                    System.out.println(m);
}
}
