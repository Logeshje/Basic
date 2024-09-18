package Basics;
import java.util.Scanner;

public class averageOFTwoNumbers {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the 1st digit: ");
		 long a = scan.nextLong();
		 
		 System.out.println("Enter the 2nd digit: ");
		 long b = scan.nextLong();
		 
		 long average = a + (b-a)/2;
		 
		 System.out.println(average);
		 
	}

}
