package com.lti.exception;

public class NegativeAgeException extends Exception{
	int message;

//public NegativeAgeException(int message) {
//	super();
//	this.message = message;
//}  or line 10 to 12
	public NegativeAgeException(String message) {
		super(message);

	}

	public NegativeAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NegativeAgeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NegativeAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NegativeAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
