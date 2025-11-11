package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {
 // Assignment5 = Collections
//Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data. 
//Now, CreateMap<String, List<Map<String, String>>> to store all the data and 
//Print the data from Product details > Supplier Name > Office Depot  from the  Map<String, List<Map<String, String>>>	
	
	public static void main(String[] args) {
	
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		
		Map<String, String> Student1 = new HashMap<String, String>();
		Student1.put("Name", "Jhon Doe");
		Student1.put("Age", "20");
		Student1.put("Gender", "Male");
		Student1.put("Roll Number", "S12345");
		Student1.put("Grade", "A");
		Student1.put("Major", "Computer Science");
		Student1.put("GPA", "3.8");
		Student1.put("Email", "john@example.com");
		Student1.put("Contact Number", "9999997777");
		Student1.put("Address", "123 Elm St");
		System.out.println("Student 1 details : " + Student1);
		
		Map<String, String> Student2 = new HashMap<String, String>();
		Student2.put("Name", "Jane Smith");
		Student2.put("Age", "21");
		Student2.put("Gender", "Female");
		Student2.put("Roll Number", "S12346");
		Student2.put("Grade", "B");
		Student2.put("Major", "Mathematics");
		Student2.put("GPA", "3.5");
		Student2.put("Email", "jane@example.com");
		Student2.put("Contact Number", "9876665666");
		Student2.put("Address", "456 Oak St");
		System.out.println("Student 2 details : " + Student2);
		
		Map<String, String> Student3 = new HashMap<String, String>();
		Student3.put("Name", "Mike Brown");
		Student3.put("Age", "22");
		Student3.put("Gender", "Male");
		Student3.put("Roll Number", "S12347");
		Student3.put("Grade", "A");
		Student3.put("Major", "Physics");
		Student3.put("GPA", "3.9");
		Student3.put("Email", "mike@example.com");
		Student3.put("Contact Number", "8787876546");
		Student3.put("Address", "789 Pine St");
		System.out.println("Student 3 details :" + Student3);
		
		List<Map<String, String>> studentlist = new ArrayList<Map<String, String>>();
		studentlist.add(Student1);
		studentlist.add(Student2);
		studentlist.add(Student3);
		System.out.println("Student details : " + studentlist);
		
		Map<String, String> Employee1 = new HashMap<String, String>();
		Employee1.put("Employee ID", "E001");
		Employee1.put("Name", "Alice Green");
		Employee1.put("Age", "30");
		Employee1.put("Gender", "Female");
		Employee1.put("Department", "Engineering");
		Employee1.put("Position", "Software Engineer");
		Employee1.put("Salary", "75,000");
		Employee1.put("Email", "alice@example.com");
		Employee1.put("Contact Number", "9876543213");
		System.out.println("Employee 1 details : " + Employee1);
		
		Map<String, String> Employee2 = new HashMap<String, String>();
		Employee2.put("Employee ID", "E002");
		Employee2.put("Name", "Bob Johnson");
		Employee2.put("Age", "35");
		Employee2.put("Gender", "Male");
		Employee2.put("Department", "Marketing");
		Employee2.put("Position", "Marketing Manager");
		Employee2.put("Salary", "85,000");
		Employee2.put("Email", "bob@example.com");
		Employee2.put("Contact Number", "9876543214");
		System.out.println("Employee 2 details : " + Employee2);

		Map<String, String> Employee3 = new HashMap<String, String>();
		Employee3.put("Employee ID", "E003");
		Employee3.put("Name", "Carol White");
		Employee3.put("Age", "28");
		Employee3.put("Gender", "Female");
		Employee3.put("Department", "Sales");
		Employee3.put("Position", "Sales Executive");
		Employee3.put("Salary", "65,000");
		Employee3.put("Email", "carol@example.com");
		Employee3.put("Contact Number", "9876543215");
		System.out.println("Employee 3 details : " + Employee3);
		
		List<Map<String, String>> employeelist = new ArrayList<Map<String, String>>();
		employeelist.add(Employee1);
		employeelist.add(Employee2);
		employeelist.add(Employee3);
		System.out.println("Employee details : " + employeelist);
		
		Map<String, String> Product1 = new HashMap<String, String>();
		Product1.put("Product ID", "P001");
		Product1.put("Name", "Laptop");
		Product1.put("Category", "Electronics");
		Product1.put("Price", "$1,200");
		Product1.put("Stock Quantity", "50");
		Product1.put("Supplier", "Tech Supplies");
		Product1.put("Warranty", "2 years");
		Product1.put("Rating", "4.5");
		Product1.put("Manufacturing Date", "15-01-2023");
		Product1.put("Expiry Date", "15-01-2025");
		System.out.println("Product 1 details : " + Product1);
		
		Map<String, String> Product2 = new HashMap<String, String>();
		Product2.put("Product ID", "P002");
		Product2.put("Name", "Desk Chair");
		Product2.put("Category", "Furniture");
		Product2.put("Price", "$150");
		Product2.put("Stock Quantity", "200");
		Product2.put("Supplier", "Office Depot");
		Product2.put("Warranty", "1 year");
		Product2.put("Rating", "4");
		Product2.put("Manufacturing Date", "10-02-2023");
		Product2.put("Expiry Date", "N/A");
		System.out.println("Product 2 details : " + Product2);
		
		Map<String, String> Product3 = new HashMap<String, String>();
		Product3.put("Product ID", "P003");
		Product3.put("Name", "Coffee Maker");
		Product3.put("Category", "Kitchen");
		Product3.put("Price", "$75");
		Product3.put("Stock Quantity", "100");
		Product3.put("Supplier", "KitchenWorld");
		Product3.put("Warranty", "6 months");
		Product3.put("Rating", "4.2");
		Product3.put("Manufacturing Date", "20-03-2023");
		Product3.put("Expiry Date", "20-03-2024");
		System.out.println("Product 3 details : " + Product3);
		
		List<Map<String, String>> productlist = new ArrayList<Map<String, String>>();
		productlist.add(Product1);
		productlist.add(Product2);
		productlist.add(Product3);
		System.out.println("Product details : " + productlist);
		
		data.put("Student Data", studentlist);
		data.put("Employee Data", employeelist);
		data.put("Product Data", productlist);
		
		System.out.println("Supplier Name of 2nd row of ProductData: "+ data.get("Product Data").get(1).get("Supplier"));
		
		System.out.println("Student Name of 3rd row of Student Data: "+ data.get("Student Data").get(2).get("Name"));
		
		

	}

}
