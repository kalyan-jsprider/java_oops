package com.collection;

import java.util.LinkedList;

public class linkpol {
	public static void main(String[] args) {
		LinkedList x1= new LinkedList();
		x1.add(50);
        x1.add(null);
        x1.add(33.33);
        x1.add(5);
        System.out.println(x1.poll());
	}

}
