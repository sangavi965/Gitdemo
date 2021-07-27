package com.lti.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		// int[] num = null;
		int[] num = { 1, 2, 3 };
		int[] num1 = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(num[0]);// exception ocurred here
			System.out.println(num1[1]);
			int n = 10 / 0;
			// in the abve line, java throws exce and u catch it in catch blk
		} catch (NullPointerException e) {

			// e.printStackTrace();
			System.out.println("Array is not initialised");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + "posiiton is not available");
		} // 2nd catch is for the line 12
		catch (Exception e) {
			System.out.println("error in line 13 is" + e.getMessage());
		} catch (Throwable e) {
			// simply
		}
		System.out.println("main ends");
	}

}
