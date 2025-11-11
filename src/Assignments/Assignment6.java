package Assignments;

public class Assignment6 {
    //Assignmet6 = Arrays/Data types/Operators
	
	public static void main(String[] args) {
		
		String studentName[] = {"Suresh","Mahesh","Naresh"};
		int marks[] = {75, 80, 82};
		
		
		int updatedmarks[] = new int[3];
		updatedmarks[0] = marks[0]+ 10;
		updatedmarks[1] = marks[1]+ 10;
		updatedmarks[2] = marks[2]+ 10;
		
		double avarge = (updatedmarks[0] + updatedmarks[1] + updatedmarks[2]) / 3.0;
		
		System.out.println("Updated Marks: ");
		System.out.println(studentName[0] + " : " +updatedmarks[0]);
		System.out.println(studentName[1] + " : " + updatedmarks[1]);
		System.out.println(studentName[2] + " : " +updatedmarks[2]);
		System.out.println("Avarge Marks : " + avarge);
		 

	}

}
