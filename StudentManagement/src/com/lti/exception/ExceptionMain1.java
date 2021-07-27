package com.lti.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main begins");
fileRead("d:\\copytest.txt");
System.out.println("main ends");
	}
	// line 9 to 13 can be implemented as also line15 to 22
//	public static void main(String[] args)  {
//		System.out.println("main begins");
//	try {
//fileRead("d:\\copytest");
//}catch(Exception e){ 
//	System.out.println("file not found");}
	//System.out.println("main ends");
//	}
	//---------------
public static void fileRead(String fileName) /*throws IOException */
{ //FileNotFoundException can be also used
	//FileReader reader=new FileReader(fileName);
	FileReader reader=null;
	try {
		reader=new FileReader(fileName);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	char[] ch=new char[100];
	try {
		reader.read(ch);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(ch);
}
}
