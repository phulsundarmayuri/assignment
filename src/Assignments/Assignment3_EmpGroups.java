package Assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		Assignment3_Employees empdata = new Assignment3_Employees();
		
		String EmpNames[] = {empdata.empName1, empdata.empName2, empdata.empName3};
		
		int EmpIds[] = {empdata.empId1, empdata.empId2,empdata.empId3};
		
		System.out.println("Employee Name : " + EmpNames[0] + "," + " Employee ID : " + EmpIds[0] );
		
		System.out.println("Employee Name : " + EmpNames[1] + "," + " Employee ID : " + EmpIds[1] );
		
		System.out.println("Employee Name : " + EmpNames[2] + "," + " Employee ID : " + EmpIds[2] );
		
	}

}
