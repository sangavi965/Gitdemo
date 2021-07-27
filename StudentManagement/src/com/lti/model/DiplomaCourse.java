package com.lti.model;

public class DiplomaCourse extends Course {
	private Type type;

	public DiplomaCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiplomaCourse(int cid, String cname, int duration, double fees,Type type) {
		super(cid, cname, duration, fees);
		// TODO Auto-generated constructor stub
		this.type = type;

	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void calculateMonthlyFee() {
		super.calculateMonthlyFee();
		// if professional then 10% is charged
		// if academic then 5% is charged
		if (type.name().equals("Professional")) {
			System.out.println("Total fees:" + (super.getFees() * 1.1));
		} else {
			System.out.println("Total fees:" + (super.getFees() * 1.05));
		}
	}
}
