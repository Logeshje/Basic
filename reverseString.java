package Basics;

import java.util.Scanner;
public class reverseString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		
		StringBuilder str = new StringBuilder(input);
		str.reverse();
		
		System.out.println(str.toString());
		
		
		
		
	}

}
