package com.springcore;



public class Operator 
{
	private IOP obj;
	public Operator(IOP obj)
	{
		this.obj=obj;
	}
	int operation(int a,int b)
	{
		return obj.operationab(a,b);
	}
}
