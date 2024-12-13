package com.polymorphism;
class amazonpay 
{
	 void payment()
	{
		 System.out.println("payment pending");
	}
}
	class recharge extends amazonpay
	{
         void payment()
		{
		 System.out.println("payment succesfully");
		 }
	}
	class bills extends amazonpay
	{
		void payment()
		{
		System.out.println("payment succesfully");
		}
	}
	class amazon
	{
		static void spa(amazonpay x)
		{
		  x.payment();
		}
	}
    class RTP
    {
	public static void main(String[] args) 
	{
		recharge m=new recharge();
		   bills n=new bills();
			amazon.spa(m);
		    amazon.spa(n);

		          
	}
	}
