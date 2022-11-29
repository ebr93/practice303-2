package com.perscholas.activities;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		problemTwo();
		problemThree();
		problemFour(sc);
		problemFour(sc);
		problemFour(sc);
		problemFour(sc);

	}
	
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
	
	public static void problemFour(Scanner sc) {
		int n = sc.nextInt();
		if (n <= 100 && n >= 90) System.out.println("A");
		else if (n <= 89 && n >= 80) System.out.println("B");
		else if (n <= 79 && n >= 70) System.out.println("C");
		else if (n <= 69 && n >= 60) System.out.println("D");
		else if (n <= 59 && n >= 0) System.out.println("F");
	}

}
