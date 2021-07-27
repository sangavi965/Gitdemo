package com.lti.lambda;
interface AddCalc{
	void sum(int num1,int num2);
}
class AddCalcImpl implements AddCalc{

	@Override
	public void sum(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Sum="+(num1+num2));
		
	}
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddCalc addCalc=new AddCalcImpl();
		addCalc.sum(9, 9);

	}

}
