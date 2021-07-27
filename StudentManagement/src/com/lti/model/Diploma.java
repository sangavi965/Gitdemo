package com.lti.model;

public class Diploma extends Courses {

	private Type type;

	public Diploma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diploma(int id, String name, int duration, double fees,Type type) {
		super(id, name, duration, fees);
		this.type=type;
		// TODO Auto-generated constructor stub
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	public void calculateMonthlyFee() {
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		super.calculateMontlyFee();
		
		// if professional then 10% is charged
		// if academic then 5% is charged
		if (type.name().equals("professional")) {
			System.out.println("Total fees:" + (super.getFees() * 1.1));
		} else {
			System.out.println("Total fees:" + (super.getFees() * 1.05));
		}
	}


	
	

}
