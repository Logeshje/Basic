package Basics;

import java.util.Scanner;

public class twentyFour {
    public static String timeConversion(String s) {
        // Extract the AM/PM part
        String period = s.substring(s.length() - 2);
        
        // Extract the hour, minutes, and seconds part
        String[] timeParts = s.substring(0, s.length() - 2).split(":");
        int hour = Integer.parseInt(timeParts[0]);
        String minutes = timeParts[1];
        String seconds = timeParts[2];

        // Convert hour based on AM/PM
        if (period.equalsIgnoreCase("AM")) {
            // If it's 12 AM, change hour to 0
            if (hour == 12) {
                hour = 0;
            }
        } else if (period.equalsIgnoreCase("PM")) {
            // If it's PM and not 12 PM, add 12 to convert to 24-hour format
            if (hour != 12) {
                hour += 12;
            }
        }

        // Format the hour to always be two digits
        return String.format("%02d:%s:%s", hour, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();  // Trim any extra spaces
        String result = timeConversion(input);
        System.out.println(result);
        scan.close();  // Close the scanner to avoid resource leaks
    }
}
