package com.thread;

import java.util.Iterator;



public class demo {
	public static void main(String[] args){ 
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
