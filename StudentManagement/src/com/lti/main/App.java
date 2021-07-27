package com.lti.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.DegreeCourse;
import com.lti.model.DegreeLevel;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;
import com.lti.model.Type;

public class App {

	public static void main(String[] args) {
		// scenario2();
//		System.out.println("scenario1");
//		scenario1();
//		System.out.println("scenario2");
//		scenario2();
//      System.out.println("scenario3");
//		scenario3();
//		System.out.println("scenario4");
//		scenario4();
		scenario9();
	}

	public static void scenario1() {
		Student student = new Student();
		String[] student2phoneNumbers = { "9848484", "78747473" };
		String[] student3phoneNumbers = { "8877655", "46464646" };
		Student student2 = new Student(101, "John", LocalDate.now(), student2phoneNumbers);
		Student student3 = new Student(102, "Mark", LocalDate.of(2003, 12, 31), student3phoneNumbers);

		Info info = new Info();
		info.display(student2);
		info.display(student3);
	}

	public static void scenario2() {
		// int[] num=new int[10];
		Student[] students = new Student[3];
		String[] student1phoneNumbers = { "8877655", "46464646" };
		String[] student2phoneNumbers = { "9848484", "78747473" };
		String[] student3phoneNumbers = { "7765566", "78765776" };

		students[0] = new Student(101, "John", LocalDate.now(), student1phoneNumbers);
		students[1] = new Student(102, "Mark", LocalDate.now(), student2phoneNumbers);
		students[2] = new Student(103, "Bob", LocalDate.now(), student3phoneNumbers);

		Info info = new Info();
		info.display(students);

	}

	public static void scenario3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of students:");
		int noOfStudents = sc.nextInt();

		Student[] students = new Student[noOfStudents];
		// noOfStudents=400;
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
			int id = sc.nextInt();
			String name = sc.next();
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);

			students[i] = new Student(id, name, dateOfBirth);
		}

		Info.display(students);
	}

	public static void scenario4() {
		List<Student> students = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		// collection is used, so we can add any number of records untill we need to end
		// it by pressing 0
		do {
			System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
			int id = sc.nextInt();
			String name = sc.next();
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);

			// storing student object in collection
			students.add(new Student(id, name, dateOfBirth));
			System.out.println("Press 0 to stop? and other than 0 to continue");
			int num = sc.nextInt();
			if (num == 0)
				break;
		} while (true);

		Info.display(students);
	}
public static void scenario9() {
	System.out.println("DegreeCourse");
	DegreeCourse degreeCourse=new DegreeCourse(101,"BTech",96,10000,DegreeLevel.Bachelors,true);
	Info.displayCourse(degreeCourse);
	System.out.println("---------");
	System.out.println("DiplomaCourse");
	DiplomaCourse diplomaCourse=new DiplomaCourse(102,"CA",23,19000,Type.Academic);
	Info.displayCourse(diplomaCourse);
}
}
