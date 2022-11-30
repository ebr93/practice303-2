package com.perscholas.activities;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		problemOne();
		problemTwo();
		problemThree();
		problemFour();
		problemFive(sc);
		problemSix(sc);
		problemSeven(sc);
	}
	/*
	 *  1.Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to 
		print out “Less than 10” if x is less than 10. Change x to equal 15, and notice the result (console should not display anything).
	 */
	public static void problemOne() {
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		}
		x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		}
	}
	
	/*
	 * 2. Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else statement that prints out “Less 
	 * than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
	 */
	public static void problemTwo() {
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		} 
		if (x > 10) {
			System.out.println("Greater than 8");
		}
		
		x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		} 
		if (x > 10) {
			System.out.println("Greater than 10");
		}
	}
	
	/*
	 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if 
	 * statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 
	 * but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
	 */
	public static void problemThree() {
		int x = 15;
		
		if (x < 10) System.out.println("Less than 10");
		else if (x > 10 && x < 20) System.out.println("Between 10 and 20");  
		else if (x >= 20) System.out.println("Greater than or equal to 20");
		
		x = 50;
		if (x < 10) System.out.println("Less than 10");
		else if (x > 10 && x < 20) System.out.println("Between 10 and 20");  
		else if (x >= 20) System.out.println("Greater than or equal to 20");
	}
	
	/*
	 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement 
	 * that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is 
	 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
	 */
	public static void problemFour() {
		int x = 15;
		if (x < 10 || x > 20) System.out.println("Out of range");
		else if (x >= 10 && x <= 20) System.out.println("Out of range");
		
		x = 5;
		if (x < 10 || x > 20) System.out.println("Out of range");
		else if (x >= 10 && x <= 20) System.out.println("Out of range");
	}
	
	/*
	 * 5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
	 * 	A: 90-100
		B: 80-89
		C: 70-79
		D: 60-69
		F: <60
	 */
	public static void problemFive(Scanner sc) {
		int n = sc.nextInt();
		if (n <= 100 && n >= 90) System.out.println("A");
		else if (n <= 89 && n >= 80) System.out.println("B");
		else if (n <= 79 && n >= 70) System.out.println("C");
		else if (n <= 69 && n >= 60) System.out.println("D");
		else if (n <= 59 && n >= 0) System.out.println("F");
		else if (n > 100 || n < 0) System.out.println("Score out of range");
	}
	
	/*
	 * 6. Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out
	 *  the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include
	 *  “break” statements in each of your cases.
	 */
	
	public static void problemSix(Scanner sc) {
		int x = sc.nextInt();
		switch (x) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Out of range"); break;
		}
	}
	
	
	/*
	 * 7. Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
		The U.S. federal personal income tax is calculated based on the filing status and taxable income. 
		There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household. 
		The tax rates for 2009 are shown below.
	 */
	public static void problemSeven(Scanner sc) {
		System.out.println("Type your Taxable Income: ");
		int income = Integer.valueOf(sc.nextLine());
		System.out.println("Type your filing status: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.");
		String status = sc.nextLine();
		
		// marginal tax is applied as income increases, 
		int tax = 0;
		double taxCollected = 0;

		if (status.equals("Single") && income >= 0 && income <= 8350) {
			taxCollected = income * 0.1;
			tax = 10;
		} else if (status.equals("Married Filing Jointly") && income >= 0 && income <= 16700) {
			taxCollected = income * 0.1;
			tax = 10;
		} else if (status.equals("Married Filing Separately") && income >= 0 && income <= 8350) {
			taxCollected = income * 0.1;
			tax = 10;
		}  else if (status.equals("Head of Household") &&  income >= 0 && income <= 11950) {
			taxCollected = income * 0.1;
			tax = 10;
		}
		
		if (status.equals("Single") && income >= 8351 && income <= 33950) {
			taxCollected = income * 0.15;
			tax = 15;
		} else if (status.equals("Married Filing Jointly") && income >= 16701 && income <= 67900) {
			taxCollected = income * 0.15;
			tax = 15;
		} else if (status.equals("Married Filing Separately") && income >= 8351 && income <= 33950) {
			taxCollected = income * 0.15;
			tax = 15;
		}  else if (status.equals("Head of Household") && income >= 11951 && income <= 45500) {
			taxCollected = income * 0.15;
			tax = 15;
		}
		
		if (status.equals("Single") && income >= 33951 && income <= 82250) {
			taxCollected = income * 0.25;
			tax = 25;
		} else if (status.equals("Married Filing Jointly") && income >= 67901 && income <= 137050) {
			taxCollected = income * 0.25;
			tax = 25;
		} else if (status.equals("Married Filing Separately") && income >= 33951 && income <= 68525) {
			taxCollected = income * 0.25;
			tax = 25;
		}  else if (status.equals("Head of Household") && income >= 45501 && income <= 117450) {
			taxCollected = income * 0.25;
			tax = 25;
		}
		
		if (status.equals("Single") && income >= 82251 && income <= 171550) {
			taxCollected = income * 0.28;
			tax = 28;
		} else if (status.equals("Married Filing Jointly") && income >= 137051 && income <= 208850) {
			taxCollected = income * 0.28;
			tax = 28;
		} else if (status.equals("Married Filing Separately") && income >= 68526 && income <= 104425) {
			taxCollected = income * 0.28;
			tax = 28;
		}  else if (status.equals("Head of Household") && income >= 117451 && income <= 190200) {
			taxCollected = income * 0.28;
			tax = 28;
		}
		
		if (status.equals("Single") && income >= 171551 && income <= 372950) {
			taxCollected = income * 0.33;
			tax = 33;
		} else if (status.equals("Married Filing Jointly") && income >= 208851 && income <= 372950) {
			taxCollected = income * 0.33;
			tax = 33;
		} else if (status.equals("Married Filing Separately") && income >= 104426 && income <= 186475) {
			taxCollected = income * 0.33;
			tax = 33;
		}  else if (status.equals("Head of Household") && income >= 190201 && income <= 372950) {
			taxCollected = income * 0.33;
			tax = 33;
		}
		
		if (status.equals("Single") && income >= 372951) {
			taxCollected = income * 0.35;
			tax = 35;
		} else if (status.equals("Married Filing Jointly") && income >= 372951) {
			taxCollected = income * 0.35;
			tax = 35;
		} else if (status.equals("Married Filing Separately") && income >= 186476) {
			taxCollected = income * 0.35;
			tax = 35;
		}  else if (status.equals("Head of Household") && income >= 372951) {
			taxCollected = income * 0.35;
			tax = 35;
		}
		
		System.out.println("Tax Rate= " + tax + "%\n" + "Tax Owed: $" + taxCollected);
	}

} 
