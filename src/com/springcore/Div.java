package com.springcore;

public class Div implements IOP {

	@Override
	public int operationab(int a, int b) 
	{
		if(b==0)
			return 0;
		return a/b;
	}

}
