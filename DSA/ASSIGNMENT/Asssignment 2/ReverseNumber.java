package assignment_2.org;

import java.util.Scanner;

public class ReverseNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		String str = sc.nextLine();
		String rev_str = "";
		if(str.charAt(0) == '-')
		{
			rev_str += "-";
			str = str.substring(1);
		}
		for(int i=str.length()-1; i>=0; i--) {
			rev_str += str.charAt(i);
		}
		System.out.println("Reverse number is: "+rev_str);
		sc.close();
	}

}
