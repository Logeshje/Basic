package Basics;
import java.util.Scanner;

public class trianglefibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for the Fibonacci triangle: ");
        int terms = scan.nextInt();
        
        int totalTerms = terms * (terms + 1) / 2; // Calculate total Fibonacci numbers needed
        
        int[] fibseq = new int[totalTerms];
        
        // Base cases for Fibonacci
        if (totalTerms > 0) fibseq[0] = 0;
        if (totalTerms > 1) fibseq[1] = 1;
        
        // Generate the Fibonacci sequence
        for (int i = 2; i < totalTerms; i++) {
            fibseq[i] = fibseq[i - 1] + fibseq[i - 2];
        }
        
        int index = 0;
        // Print the Fibonacci numbers in a triangular format
        for (int i = 1; i <= terms; i++) { // Rows
            for (int j = 0; j < i; j++) { // Elements in each row
                System.out.print(fibseq[index] + " ");
                index++;
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scan.close();
    }
}
