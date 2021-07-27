package com.lti.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;

public class Info {

	public static void display(Student student) {
		// System.out.println(student.getId()+" "+student.getName()+"
		// "+student.getDateOfBirth()+" "+student.getCollegeName());
		System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth() + " "
				+ Student.getCollegeName() + " " + Arrays.toString(student.getPhoneNumbers()));

	}

	public static void display(Student[] students) {
		/*
		 * for(int i=0;i<students.length;i++) { display(student[i]); }
		 */
		// enhanced for/ extended for

		for (Student st : students) {
			display(st);
		}
	}

	public static void display(List<Student> students) // we can pass any tipe of list in the display
	{
		// list is an interface
//		for(Student st:students) {
//			display(st);
//		}
		// --
//		Iterator<Student> studs = students.iterator();
//		while (studs.hasNext()) {
//			Student st = studs.next();
//			display(st);
//		}
//		// --
//		System.out.println("---------------------");
//		ListIterator<Student> studs1 = students.listIterator();
//		while (studs1.hasPrevious()) {
//			Student st1 = studs1.previous();
//			display(st1);
//		}
		// or
		ListIterator<Student> studs1 = students.listIterator();
		while (studs1.hasNext()) {
			Student st = studs1.next();
			display(st);
		}
		System.out.println("---------------------");
		while (studs1.hasPrevious()) {
			Student st1 = studs1.previous();
			display(st1);

		}
	}
	public static void displayCourse(Course course) {
		course.calculateMonthlyFee();
	}
//	public void displayDiplomaCourse(DiplomaCourse diplomaCourse) {
//		diplomaCourse.calculateMonthlyFee();
//	}
}
