package com.Epam.app;
import java.util.Scanner;
public class Main 
{
    public static void main( String[] args )
    {
        double number1,number2;
        String Operator;
        Scanner sc = new Scanner(System.in);
        while(true)
        {   
        	System.out.println("Enter two numbers and operator in the format number1 opearator number2");
        	number1 = sc.nextDouble();
        	Operator = sc.next();
        	number2 = sc.nextDouble();
        	double c = Operation.getResult(number1,number2,Operator);
        	System.out.println(number1+" "+Operator+" "+number2+" = "+ c);
        	System.out.println("Do You want to Continue(Yes/No)");
        	if(sc.next().equals("no") || sc.next().equals("No") )
        	{   
        		System.out.println("Program terminated");
        		break;
        	}
        }
        sc.close();
        }
}
