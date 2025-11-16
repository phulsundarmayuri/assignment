package Assignments;

public class Assignment7 {
    // Assignment7 - conditional statement
	
	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditscore = 720;
		double  income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		
		// checking 1st condition: If the credit score is above 750, the loan is automatically approved.
		if (creditscore > 750) {
		System.out.println(customerName + "is eligible to get the loan");
		}
		
		// checking 2nd condition: If the credit score is between 650 and 750, additional checks are performed.	
		 if (creditscore > 650 && creditscore < 750 ) {
			 
			// System.out.println("Additional checks are performed");
			 
			 if (income == 50000 ) {
				 
				 //System.out.println("loan to be considered");
				 
				 if (isEmployed == true) {
					 
					 //System.out.println("system checking the debt-to-income (DTI) ratio.");
					 
					 if (debtToIncomeRatio == 40.0) {
						 System.out.println(customerName + "is eligible to get the loan"); 
					 }
					 else {
						 System.out.println(customerName + "is not eligible to get the loan"); 
					 }
					 
				 }
				 else {
					 System.out.println(customerName + "is not eligible to get the loan");
				 }
			 }
			 else {
				 System.out.println(customerName + "is not eligible to get the loan");
			 }
		}
		
		// checking 3rd condition: If the credit score is below 650, the loan is denied.	
		 if (creditscore < 650) {
				System.out.println(customerName + "is not eligible to get the loan");
				} 
		

	}

}
