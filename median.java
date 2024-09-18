package Basics;
import java.util.Arrays;
import java.util.Scanner;

public class median {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = scan.nextInt();
		
		}
		
		Arrays.sort(arr);
		int median = arr[arr.length/2];
		System.out.println(median);
	}

}
