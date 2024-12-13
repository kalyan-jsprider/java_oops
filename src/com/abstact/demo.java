package com.abstact;

abstract class demo
{
	abstract void un();
	abstract void psw();
}
	class sample extends demo
	{
		void un()
		{
			System.out.println("kalyan");
		}
		void psw()
		{
		System.out.println(123);
		}
		
	}
	class main
	{
		public static void main(String[] args)
		{
			sample x= new sample();
			       x.un();
			       x.psw();
		}
	}


