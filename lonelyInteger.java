package Basics;

import java.util.Scanner;

public class lonelyInteger{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int unique = 0;
		for(int i=0; i<n; i++) {
			int num = scan.nextInt();
			unique ^= num;
			
			
		}
		System.out.println(unique);
		
		scan.close();
	}
}