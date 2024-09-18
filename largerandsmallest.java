package Basics;

import java.util.Arrays;
import java.util.Scanner;
public class largerandsmallest {
	public static void largeAndSmall(int[] arr) {
		
		Arrays.sort(arr);
		
		long minimum = 0;
		for(int i=0; i<4; i++) {
			minimum += arr[i];
		}
		
		long maximum =0;
		for(int i=1; i<5; i++) {
			maximum += arr[i];
		}
		System.out.println(minimum);
		System.out.println(maximum);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i]=scan.nextInt();
		}
		
		largeAndSmall(arr);
	}

}
