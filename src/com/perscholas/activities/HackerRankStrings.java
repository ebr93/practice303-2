package com.perscholas.activities;

import java.util.Scanner;

public class HackerRankStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stringsIntroduction(sc);
        
	}
	
	public static void stringsIntroduction(Scanner sc) {
		/*
		 This exercise is to test your understanding of Java Strings. A sample String declaration:

		String myString = "Hello World!"
		The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
		
		Given two strings of lowercase English letters,  and , perform the following operations:
		
		Sum the lengths of  and .
		Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
		Capitalize the first letter in  and  and print them on a single line, separated by a space.
		Input Format
		
		The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
		
		Output Format
		
		There are three lines of output:
		For the first line, sum the lengths of  and .
		For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
		For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
		
		Sample Input 0
		
		hello
		java
		Sample Output 0
		
		9
		No
		Hello Java
		 */
		
       String A= sc.next();
       String B= sc.next();
       /* Enter your code here. Print output to STDOUT. */
       // gives me the length of all characters
       int sum = A.length() + B.length();
       
       // get first letter of word
       char wordA = A.charAt(0);
       char wordB = B.charAt(0);
       // compare with numeric value of first character their alphabetical placement
       String aGreater = Character.getNumericValue(wordA) > Character.getNumericValue(wordB)
       		? "Yes" : "No";
       
       // modify the words to capitalize and make a new String; 
       String upperA = A.substring(0, 1).toUpperCase() + A.substring(1);
       String upperB = B.substring(0, 1).toUpperCase() + B.substring(1);
       String sentence = upperA + " " + upperB;
       
       System.out.println(sum);
       System.out.println(aGreater);
       System.out.println(sentence);
       
       sc.close();
	}

}
