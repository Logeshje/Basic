package Basics;
import java.util.Scanner;
public class primeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		for(int i = 2; i<Math.sqrt(num); i++) {
			if(num % i == 0) {
				System.out.println("it is not a prime");
			}
			else {
				System.out.println("it is a prime");
			}
		}
	}

}
