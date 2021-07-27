package com.lti.lambda;

import java.util.Scanner;

interface AddCalc {//if interface has one method called SAM interface
	void sum(int num1, int num2);

}
interface Shape{
	void area();
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		//--lambda expression----
		AddCalc addCalc=(int num1,int num2)->
				{
			System.out.println("Sum= "+(num1+num2));
				};
				addCalc.sum(10,20);
				
				//lambda function for circle
				Shape circle=()->{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter radius:");
					double radius=sc.nextDouble();
					System.out.println("Area of circle:"+ (3.14*radius*radius));
				};
				circle.area();
				
				//lambda function for rectangle
				Shape rectangle=()->{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter length and breadth:");
					double len=sc.nextDouble();
					double bdh=sc.nextDouble();
					System.out.println("Area of the rectangle: "+ (len*bdh));
				}; rectangle.area();
	} 

}