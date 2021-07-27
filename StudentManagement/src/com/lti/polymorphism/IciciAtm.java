package com.lti.polymorphism;

public class IciciAtm implements ATM {
	private double balance = 10000;
	private double amount;

	@Override
	public void withdraw(double amount) {
		this.amount=amount;
		System.out.println("amount withdrawn from ICICI:" + amount);
	}

	@Override
	public double checkbalance() {
		// TODO Auto-generated method stub
		return balance - amount;
	}

}
