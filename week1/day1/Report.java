package week1.day1;

public class Report {

	public static void main(String[] args) {
     
		System.out.println("Student Report :");
		
		Student std = new Student();
	    
		String str =(std.student_Name = "Afshan");
	    System.out.println("student_Name = "+ str);
	   
	    String roll =(std.roll_Number = "S18402");
		System.out.println("roll_Number  = "+ roll);
		 
		String clg =(std.college_Name = "SRM University");
		System.out.println("college_Name = "+ clg);
		 
		int mark =(std.mark_Scored = 600);
		System.out.println("mark_Scored  = "+ mark);
		 
		float gpa =(std.cgpa = 7.63f);
		System.out.println("     CGPA    = "+ gpa);
		
		
	}

}
