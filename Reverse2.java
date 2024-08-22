package daily_problem_solving_DSA_array;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String String = sc.nextLine() ;
		System.out.println("Entered String: " + String);
		
		//String str = "123";

		System.out.println(reverse(String));
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		 
		System.out.println("reversed String:");
		 return out.toString();
	}

}