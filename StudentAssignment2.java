package week3.day1;


//import week3.day1.org.department.Department;

public class StudentAssignment2 extends DepartmentAssignment2{

	public String studentName() {
		return "Sankar";
	}
	
	public String studentDepartment() {
		return "IT";
	}
	
	public int studentId() {
		return 11;
	}

	public static void main(String[] args) {
		StudentAssignment2 st=new StudentAssignment2();
		
		System.out.println("College Name: "+st.collegeName());
		System.out.println("College code: "+st.collegeCode());
		System.out.println("College Rank: "+st.collegeRank());
		
		System.out.println("Department Name: "+st.deptName());
		
		System.out.println("Student Name: "+st.studentName());
		System.out.println("Student Department: "+st.studentDepartment());
		System.out.println("Student ID: "+st.studentId());
	}
	
}
