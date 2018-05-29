package com.hdfc.loans.carloans;

public class FirstClass 
{	
	int a=10,b=20,result=0;
	public void addition() 
	{
		result=a+b;
		System.out.println("addition of a&b are:"+result);
	}
	

	public static void main(String[] args)
	{
		System.out.println("hi welcome to selinum sessions");
		FirstClass obj=new FirstClass();
		obj.addition();
		
		FirstClass obj1=new FirstClass();
		obj1.addition();
	}
}