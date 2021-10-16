package firstTest;

import java.util.Scanner;



public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cal = new calculator();
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("take numbers for calculation");
		
		System.out.println("enter number 1:");
		double a = scan.nextDouble();
		
		System.out.println("enter number 2:");
		double b = scan.nextDouble();
		
		cal.Addition(a,b);
		cal.Subtraction(a,b);
		cal.Multiplication(a,b);
		cal.Division(a,b);
		
	}
	void Addition(double a, double b)
	{
		System.out.println("addition result:" +(a+b));
	}

	void Subtraction(double a, double b)
	{
		System.out.println("subtraction result:" +(a-b));
	}

	void Multiplication(double a, double b)
	{
		System.out.println("multiplicatin result:" +(a*b));
	}

	void Division(double a, double b)
	{
		System.out.println("Division result:" +(a/b));
	}

}
	 