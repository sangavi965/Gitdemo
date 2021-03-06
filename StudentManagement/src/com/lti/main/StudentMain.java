package com.lti.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.lti.dao.InMemoryStudentDaoImpl;
import com.lti.dao.PersistentStudentDaoImpl;
import com.lti.dao.StudentDao;
import com.lti.model.Course;
import com.lti.model.Courses;
import com.lti.model.Student;

public class StudentMain {
//create studetndao interface and link it with inmemeorystudentdaoimpl
	//static StudentDao studentDao = new InMemoryStudentDaoImpl();
	 static StudentDao studentDao = new PersistentStudentDaoImpl();
		
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("1.Add a student \n" + "2.Update\n" + "3.Remove\n" + "4.Search\n" + "5.View all students"
					+ "\n 6.enroll\n 7.view all enrollments");
			int ch = sc.nextInt();
			int id;
			String name;
			String date;
			DateTimeFormatter formatter;
			LocalDate dateOfBirth;
			Student student;
			switch (ch) {

			case 1:
				//System.out.println("enter id,name and dob");
				//id = sc.nextInt();
				name = sc.next();
				date = sc.next();
				formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dateOfBirth = LocalDate.parse(date, formatter);

				//student = new Student(id, name, dateOfBirth);
				student=new Student();
				student.setName(name);
				boolean result = studentDao.addStudent(student);
				if (result) {
					System.out.println("Congrats, ur reg is confirmed");
				} else {
					System.out.println("Sry, registration failed");
				}

				break;
			case 2:
				System.out.println("enter id,name and dob");
				id = sc.nextInt();
				name = sc.next();
				date = sc.next();
				formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dateOfBirth = LocalDate.parse(date, formatter);

				student = new Student(id, name, dateOfBirth);
				studentDao.updateStudent(student);
				break;
			// ---or
//				System.out.println("Enter id of student to be updated");
//				int id2=sc.nextInt();
//				if(studentDao.findAStudent(id2)==null)
//				{
//					System.out.println("No such student found.");
//				}
//				else
//				{
//					 System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
//			            int id1=sc.nextInt();
//			            String name1=sc.next();
//			            String date1=sc.next();
//			            DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			            LocalDate dateOfBirth1=LocalDate.parse(date1, formatter1);
//						
//			            Student student1=new Student(id1,name1,dateOfBirth1);
//			            studentDao.updateStudent(student1);
//			            System.out.println("Student updated successfully");
//			            
//					
//				}				
//				break;
			case 3:
//				System.out.println("enter student id to be removed");
//				id = sc.nextInt();
//				studentDao.removeStudent(id);
				System.out.println("Enter id of student to be removed");
				int id3 = sc.nextInt();
				if (studentDao.findAStudent(id3) == null) {
					System.out.println("No such student found.");
				} else {
					studentDao.removeStudent(id3);
					System.out.println("Student removed successfully");
				}

				break;
			// break;
			case 4:
				System.out.println("enter student id");
				id = sc.nextInt();
				student = studentDao.findAStudent(id);
				if (student != null) {
					System.out.println("details of the student are:\n");
					System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth());
				} else {
					System.out.println("student not found");
				}
				break;

			case 5:
				List<Student> students = studentDao.viewAllStudents();
				if (students.isEmpty()) {
					System.out.println("no student found");
				} else {

					for (Student st : students) {
						System.out.println(st.getId() + " " + st.getName() + " " + st.getDateOfBirth());
					}
				}
				break;
			case 6:
				System.out.println("enter student id and course id:");
				int studentId = sc.nextInt();
				int courseId = sc.nextInt();
				studentDao.enroll(studentId, courseId);
				break;
			case 7:
				Set<Entry<Student, Course>> enrollments = studentDao.viewEnrollments();
				Iterator<Entry<Student, Course>> allEnrollments = enrollments.iterator();
				while (allEnrollments.hasNext()) {
					Entry<Student, Course> enrollment = allEnrollments.next();
					Student st = enrollment.getKey();
					Course cs = enrollment.getValue();
					System.out.println(st.getId() + " " + st.getName() + " " + st.getDateOfBirth());

				}
				break;
			default:
				flag = false;
				break;
			}

		} while (flag);
	}

}
