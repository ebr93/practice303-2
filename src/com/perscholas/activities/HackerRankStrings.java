package com.perscholas.activities;

import java.util.Scanner;

public class HackerRankStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// stringsIntroduction(sc);
		String s = "welcometojava";
		
		substringComparisons(s, 3);
        
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
	
	public static void substring(Scanner in) {
		/*
		 * Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

		Input Format
		
		The first line contains a single string denoting .
		The second line contains two space-separated integers denoting the respective values of  and .
		
		Constraints
		
		String  consists of English alphabetic letters (i.e., ) only.
		Output Format
		
		Print the substring in the inclusive range from  to .
		
		Sample Input
		
		Helloworld
		3 7
		Sample Output
		
		lowo
		 */
		
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String output = S.substring(start, end);
        System.out.println(output);
	}
	
	public static String substringComparisons(String s, int k) {
		/*
		 * We define the following terms:

			Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
			For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
			
			A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
			Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
			
			Function Description
			
			Complete the getSmallestAndLargest function in the editor below.
			
			getSmallestAndLargest has the following parameters:
			
			string s: a string
			int k: the length of the substrings to find
			Returns
			
			string: the string ' + "\n" + ' where and are the two substrings
			Input Format
			
			The first line contains a string denoting .
			The second line contains an integer denoting .
			
			Constraints
			
			 consists of English alphabetic letters only (i.e., [a-zA-Z]).
			Sample Input 0
			
			welcometojava
			3
			Sample Output 0
			
			ava
			wel
		 
		**************SOLVED THIS WITH ARRAYLIST, BUT WAS NOT ACCEPTABLE BY HACKER RANK**********
        String smallest = "";
        String largest = "";
        ArrayList<String> list = new ArrayList<String>();
        
        // Complete the function
        for (int i = 0; i < s.length(); i++) {
        	if (k + i > s.length()) break;
        	list.add(s.substring(i, k + i));
        }
        
        System.out.println(list);
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        smallest = list.get(0);
        largest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
        	int sm = Character.getNumericValue(smallest.charAt(0));
        	int lg = Character.getNumericValue(largest.charAt(0));
        	if (sm > Character.getNumericValue((list.get(i)).charAt(0))) {
        		smallest = list.get(i);
            // 'largest' must be the lexicographically largest substring of length 'k'
        	} else if (lg < Character.getNumericValue((list.get(i)).charAt(0))) {
        		largest = list.get(i);
        	}
        }
        */
		// SOLUTION ACCEPTABLE BY HACKER RANK USED String[] instead
        String smallest = "";
        String largest = "";
        String[] list = new String[s.length()];
        
        // Complete the function
        for (int i = 0; i < s.length(); i++) {
            if (k + i > s.length()) break;
            list[i] = s.substring(i, k + i);
        }
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        smallest = list[0];
        largest = list[0];

        for (int ind = 0; ind < list.length; ind++) {
            if (list[ind] == null) break;
            String iVariable = list[ind];
            if (smallest.compareTo(list[ind]) > 0) {
                smallest = iVariable;
            // 'largest' must be the lexicographically largest substring of length 'k'
            } else if (largest.compareTo(iVariable) < 0) {
                largest = iVariable;
            }
        }
        
        return smallest + "\n" + largest;
		
	}
	
	public static void stringReverse() {
		
	}
	
	public static void stringTokens() {
		
	}

}
