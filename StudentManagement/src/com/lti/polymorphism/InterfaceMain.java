package com.lti.polymorphism;

import java.util.Scanner;

public class InterfaceMain {

	public static void main(String[] args) {
		System.out.println("1.ICICI \n 2.SBI \n select ur card:");
		int ch = new Scanner(System.in).nextInt();

		ATM atm = null;
		if (ch == 1) {
			atm = new IciciAtm();
		}
		if (ch == 2) {
			atm = new SBIAtm();
		}
		atm.withdraw(5000);
		atm.checkbalance();
	}

}
