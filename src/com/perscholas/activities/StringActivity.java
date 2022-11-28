package com.perscholas.activities;

public class StringActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lenthDemo();
		isEmptyExample();
		stringTrimExample();
	}
	
	public static void lenthDemo() {
	        String str1 = "Java";
	        String str2 = "";

	        System.out.println(str1.length());  // 4
	        System.out.println(str2.length());  // 0
	        System.out.println("Java".length());  // 4
	        System.out.println("Java\n".length()); // 5
	        System.out.println("Learn Java".length()); // 10
	}
	
	public static void isEmptyExample() {
		String str1 = "";
		String str2 = "  ";
		String str3 = "		";
		String str4 = "hello";
		System.out.println(str1.isEmpty()); //t
		System.out.println(str2.isEmpty()); //f
		System.out.println(str3.isEmpty()); //f
		System.out.println(str4.isEmpty()); //f 
	}
	
	public static void stringTrimExample() {
		String s1="  hello   "; 
		String str2 = "  ";
		String str3 = "		";
		System.out.println(s1+"how are you");        // without trim() 
		System.out.println(s1.trim()+" how are you"); // with trim() 
		System.out.println(str2.trim() +"how are you"); //
		System.out.println(str3.trim() +"how are you"); //t
	}
	

}
