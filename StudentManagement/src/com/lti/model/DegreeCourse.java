package com.lti.model;

public class DegreeCourse extends Course {
	DegreeLevel degreeLevel;
	boolean isPlacementAvailable;

	public DegreeCourse() {
		super(); // calls the default constructor of the parent(Course) class
		// TODO Auto-generated constructor stub
	}

	public DegreeCourse(int cid, String cname, int duration, double fees, DegreeLevel degreeLevel,
			boolean isPlacementAvailable) {
		super(cid, cname, duration, fees);
		// class the parameterized constructor of the super class
		this.degreeLevel = degreeLevel;
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}

	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public void calculateMonthlyFee() {
		System.out.println(super.getCid()+" "+super.getCname()+" "+super.getDuration());
		super.calculateMonthlyFee(); // reused the base class method by super keyword
		// if placement service is availbe, charge 10% of total fees as placement fee
		if(isPlacementAvailable) {
		System.out.println("The total fees" + (super.getFees() * 0.1));
		System.out.println("in addition to monthly fee, u need to pay"+(super.getFees()*0.1)+" as placemnet fee.");;
	}else {
		System.out.println("The total fees" + (super.getFees()));

	}
		System.out.println("Total Fees: "+(super.getFees()*0.1));
}
}
