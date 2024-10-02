package assignment_2.org;

import java.util.Scanner;

public class WordReverse {

		    public static void printReverse(String word)
	{
		String[] words = word.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first word");
		String s1 = sc.nextLine();
		printReverse(s1);
		sc.close();
	}

	}
