package week3.day1;

/**
 * Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

==================================================
 */

public class StudentsAssignment4 {

	public void getStudentInfo(int studentId) {
		System.out.println("Student ID is "+studentId);
	}
	
	public void getStudentInfo(int studentId,String studentName) {
		System.out.println("Student ID is "+studentId);
		System.out.println("Student name is "+studentName);
	}
	
	public void getStudentInfo(String email,long phoneNum) {
		System.out.println("Student email is "+email);
		System.out.println("Student phone number is "+phoneNum);
	}
	
	public static void main(String[] args) {
		StudentsAssignment4 st=new StudentsAssignment4();
		st.getStudentInfo(11);
		st.getStudentInfo(11, "Sankar");
		st.getStudentInfo("Sankar@gmail.com",8923475869L);
	}
	
}
