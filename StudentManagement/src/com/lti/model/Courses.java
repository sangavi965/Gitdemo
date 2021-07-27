package com.lti.model;

public class Courses {
	private int id;
	private String name;
	private int duration;
	private double fees;

	// constructor
	public Courses(int id, String name, int duration, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}

	protected Courses() {

	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getDuration() {
		return duration;
	}

	protected void setDuration(int duration) {
		this.duration = duration;
	}

	protected double getFees() {
		return fees;
	}

	protected void setFees(double fees) {
		this.fees = fees;
	}
    public void calculateMontlyFee() {
    	System.out.println(fees/duration);
    }
	// getter and setter

}
