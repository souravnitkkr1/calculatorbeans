package com.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		while(true)
		{
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("5 for modulus");
			int ch=sc.nextInt();
			System.out.println("Enter 1st number");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			if(ch==1)
			{
				Operator operatorObj = (Operator) context.getBean("a");
				int sum=operatorObj.operation(a, b);
				System.out.println("Sum= "+sum);
			}
			else if(ch==2)
			{
				Operator operatorObj = (Operator) context.getBean("b");
				int dif=operatorObj.operation(a, b);
				System.out.println("Difference= "+dif);
			}
			else if(ch==3)
			{
				Operator operatorObj = (Operator) context.getBean("c");
				int mul=operatorObj.operation(a, b);
				System.out.println("Multiplication= "+mul);
			}
			else if(ch==4)
			{
				Operator operatorObj = (Operator) context.getBean("d");
				int div=operatorObj.operation(a, b);
				System.out.println("Division= "+div);
			}
			else if(ch==5)
			{
				Operator operatorObj = (Operator) context.getBean("e");
				int mod=operatorObj.operation(a, b);
				System.out.println("Modulus= "+mod);
			}
			else
			{
				break;
			}
		}
	}
}
