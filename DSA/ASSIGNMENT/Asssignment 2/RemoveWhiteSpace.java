package assignment_2.org;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

		System.out.println("Enter a string:"); // Prompt the user for input
		String input = sc.nextLine();

		String result = input.replaceAll("\\s", ""); // Remove all whitespace characters from the input string

		System.out.println(result); // Output the result

		sc.close(); // Close the scanner
	}
}
