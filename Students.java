package org.student;

public class Students {

	private void getStudentInfo(int sId) {
			System.out.println("Student Id: "+ sId);

	}
	private void getStudentInfo(int sId,String sName) {
		
		System.out.println("Student Id: "+ sId + "Student Name: "+ sName);
	}
	private void getStudentInfo(String sMail,long sContact ) {
		System.out.println("Student Mail: "+ sMail + "Student Contact: "+ sContact);

	}	
	public static void main(String[] args) {
		Students std1 = new Students();
		std1.getStudentInfo(45201);
		std1.getStudentInfo(45201, "Anu");
		std1.getStudentInfo("xyz@gmail.com", 456120300);
	}
}