package com.collection;

import java.util.ArrayList;

public class demo5 {
public static void main(String[] args) {
	ArrayList x1=new ArrayList();
    x1.add("kolkata");
    x1.add(54698);
    x1.add(32.23);
ArrayList x2 =  new ArrayList();
x2.add("bangalore");
x2.add(546955);
x2.add(32.23);

    x1.removeAll(x2);
    System.out.println(x1);
    System.out.println(x2);
}
}
