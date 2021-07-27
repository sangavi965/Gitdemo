package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain {
	static int res = 0;
	static int[] arr = new int[] { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {
		int num1, num2, pos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Begin");
		System.out.println("enter the number:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(divide(num1, num2));
		System.out.println("enter the position");
		pos = sc.nextInt();
		//System.out.println(getElement(pos));
		int value=getElement(pos);
		if(value!=0) {
			System.out.println(value);
		}
		System.out.println("main ends");
	}

	public static int divide(int num1, int num2) {
		try {
			res = num1 / num2;
	}
		//catch (Exception e) { //if u know what type of exception is that, 
//			//then u can give the exact name eg. arithmeticException
//			System.out.println("Can't divide by zero.");
		//}
		catch(Throwable e) {
			System.out.println("cant divide by zero");
			System.out.println(e.getMessage());
		}
		return res;
	}

	public static int getElement(int index) {
		try {
			res=arr[index];
		
	}catch(Exception e) {
		System.out.println("Position not found");
	}
		return res;
	}
	//this getElement exception can be also
//	public static int getElement(int index) {
	// int res=0;
//		try {
//			res=arr[index];
//		
//	}catch(Exception e) {
//		System.out.println("Position not found");
//	}
//		return res;
//	}
	
	}
