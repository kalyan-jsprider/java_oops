package com.abstaction;

abstract interface amazon {
	public abstract void watch();

}
class webseries implements amazon{
public void watch()
{
	System.out.println();
}
}
class livestrem implements amazon{
public void watch()
{
	System.out.println();
}
}
class single {
	static void spa(amazon s) {
	s.watch();
	}
}
class demo{
public static void main(String[] args) {
	webseries x=new webseries();
	livestrem y=new livestrem();
	single.spa(y);
	single.spa(x);
}
}