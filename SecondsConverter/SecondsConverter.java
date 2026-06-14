
/**
 *  The program takes time in seconds as an input and converts to time in hours, minutes, seconds
 * 
 *  For CS121 module 2 lab part 2
 *  @author Sean Drake
 */

import java.util.Scanner;

public class SecondsConverter {

    
     //Calculates time in hours,min,sec based on an user inputed number of seconds
     public static void main(String[] args){

        int hours;
        int minutes;
        int seconds;

        final int SEC_PER_MIN = 60;
        final int SEC_PER_HOUR = 60 * SEC_PER_MIN;

        int inputSeconds;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        inputSeconds = scan.nextInt();
        scan.close();

        hours = inputSeconds / SEC_PER_HOUR;

        inputSeconds -= hours * SEC_PER_HOUR;

        minutes = inputSeconds / SEC_PER_MIN;

        inputSeconds -= minutes * SEC_PER_MIN;

        seconds = inputSeconds;

        System.out.println("\nHours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    

    }
    
}