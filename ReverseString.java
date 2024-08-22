package daily_problem_solving_DSA_array;

import java.util.Scanner;

public class ReverseString {

	static Scanner scanner = new Scanner(System.in);
	static String reverse = "";

	public static void main(String[] args) {

		System.out.println("Enter the Name to be reversed:");
		String name = scanner.nextLine();

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse += name.charAt(i);

			// System.out.println(name.charAt(i));

		}

		System.out.println("reversed String is:" + reverse);

	}

}
