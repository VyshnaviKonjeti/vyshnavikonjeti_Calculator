package com.Epam.app;

import java.io.Serializable;

public class Operation {
	public static double getResult(double number1,double number2,String Operator)
	{
		Calculation arr[] = {new Additon(),new Subtraction(), new Division(),new Multiplication() };
		String op[] = {"+", "-", "/", "*"};
		int result = 0;
		for(int i =0;i<4;i++)
		{
			if(Operator.equals(op[i]))
			{
				result = i;
				break;
			}
		}
		return arr[result].Compute(number1,number2);
		
	}

}
