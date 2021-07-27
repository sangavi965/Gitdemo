package com.lti.model;

public class Course {
	private int cid;
	private String cname;
	private int duration;
	private double fees;

	public Course(int cid, String cname, int duration, double fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	protected void setCid(int cid) {
		this.cid = cid;
	}

	protected String getCname() {
		return cname;
	}

	protected void setCname(String cname) {
		this.cname = cname;
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

	public void calculateMonthlyFee() {
		System.out.println("Monthly fee:" + (fees / duration));
	}
}
