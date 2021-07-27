package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		// int[] num = null;
		int[] num = { 1, 2, 3 };
		int[] num1 = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(num[0]);// exception ocurred here
			System.out.println(num1[1]);
			//int n = 10 / 0;
			int nu=10/1;
		} catch (NullPointerException e) {

			// e.printStackTrace();
			System.out.println("Array is not initialised");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + "posiiton is not available");
		} // 2nd catch is for the line 12
//		catch (Exception e) {
//			System.out.println("error in line 13 is" + e.getMessage());
//		}
		finally {
			System.out.println("Finally eexecuted");
		}// even if no exception occurs, finally will work  execute
		int age=0;
		System.out.println("enter ur age");
		age=new Scanner(System.in).nextInt();
		
		if(age<0) {
			try {
				throw new NegativeAgeException("age cant be -ve");
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("u r "+age+" yrs old");
		}
		
		
		System.out.println("main ends");
	}

}
