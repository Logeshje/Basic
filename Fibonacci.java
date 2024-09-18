package Basics;
import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the terms");
		int terms = scan.nextInt();
		
		int[] fibsq = new int[terms];
		
	    if(terms>0) fibsq[0] = 0;
	    if(terms>1) fibsq[1] = 1;
	    
	    for(int i = 2; i<terms; i++) {
	    	fibsq[i] = fibsq[i-1] + fibsq[i-2];
	    }
	    
	    for(int i=0; i<terms; i++) {
	    	System.out.print(fibsq[i]+" ");
	    }
		
	}
	
}