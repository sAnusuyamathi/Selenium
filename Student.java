package org.student;

import org.department.Department;

public class Student extends Department {
//	studentName(),studentDept(),studentId()
	private void studentName() {
		System.out.println("Student Name: Anu");

	}
	public void studentDept() {
		System.out.println("Student Department: Information Technology");

	}
	void studentId() {
		System.out.println("Student ID: 45201");

	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
	}
}
