package Basics;
import java.util.Scanner;

public class binaryToDecimal{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the decimal Number: ");
		
		int decimalNumber = scan.nextInt();
		
		String binaryNumber = "";
		
		if(decimalNumber==0) {
			binaryNumber ="0";
		}
		
		else {
			while(decimalNumber>0) {
				
				int Remainder = decimalNumber % 2;
				binaryNumber = Remainder + binaryNumber;
				decimalNumber = decimalNumber/2;
				
			}
		}
		System.out.println(binaryNumber);
	}
}