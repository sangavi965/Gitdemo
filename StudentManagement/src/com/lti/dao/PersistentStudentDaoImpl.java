package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Courses;
import com.lti.model.Student;

public class PersistentStudentDaoImpl implements StudentDao {
	Connection conn;
	String sql;
	PreparedStatement stmt;
	public PersistentStudentDaoImpl() {
		conn=ConnectionFactory.getConnection();
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		sql="insert into student values(seq_student.nextval,?,?)";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,student.getName());
			stmt.setDate(2,Date.valueOf(student.getDateOfBirth()));
			//converted java.time.LocalDate(java8) to java.sql.Date(old)
			int rec=stmt.executeUpdate();
			if(rec>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student findAStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course findACourse(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> viewAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
