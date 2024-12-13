package com.collection;

import java.util.PriorityQueue;

public class pol {
	public static void main(String[] args) {
		PriorityQueue x1= new PriorityQueue();
		x1.add(100);
		x1.add(33);
		x1.add(10);
		x1.add(5);
		System.out.println(x1.poll());
		System.out.println(x1);
	}

}
