package com.lti.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="sangavi";//this will get allocated in string pool 
		String b="sangavi";// if two name is same it refers  to same string pool memory
		String c=new String("sangavi");// if string is assigned using new class will get stored in heap memory
		String d=new String("sangavi");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(b));
		System.out.println(c==d);
		

	}

}
