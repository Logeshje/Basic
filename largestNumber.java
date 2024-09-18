package Basics;
import java.util.Scanner;

public class largestNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the 1st digit: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the 1st digit: ");
		int b = scan.nextInt();
		
		System.out.println("Enter the 1st digit: ");
		int c = scan.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a);
		}
		if(b>a && b>c) {
			System.out.println(b);
		}
		if(c>a && c>b) {
			System.out.println(c);
		}	
	}
	

}
