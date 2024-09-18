package Basics;
import java.util.Scanner;

public class plusMinusRatio {

    public static void plusAndMinus(int[] arr) {
        int n = arr.length;
        int positiveValue = 0;
        int negativeValue = 0;
        int zeroValue = 0;

        // Count positive, negative, and zero values
        for (int num : arr) {
            if (num > 0) {
                positiveValue++;
            } else if (num < 0) {
                negativeValue++;
            } else {
                zeroValue++;
            }
        }

        // Calculate the ratios
        double positiveCount = (double) positiveValue / n;
        double negativeCount = (double) negativeValue / n;
        double zeroCount = (double) zeroValue / n;

        // Print the ratios with six decimal places
        System.out.printf("%.6f%n", positiveCount);
        System.out.printf("%.6f%n", negativeCount);
        System.out.printf("%.6f%n", zeroCount);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get the size of the array
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        
        // Initialize the array with the specified size
        int[] arr = new int[size];
        
        // Get the array elements from the user
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Call the method with the input array
        plusAndMinus(arr);
        
        // Close the scanner
        scan.close();
    }
}
