/**
 * Converts time inputed in hours, minutes and seconds to the equivalent number
 * of seconds
 * 
 * For CS121 Module 2 lab part 2
 * 
 * @author Sean Drake
 */


import java.util.Scanner;


 //Takes time in hours, minutes, seconds as an input.  Converts to time in seconds
 
public class HMSConverter {

    public static void main(String[] args){

    

        int hours;
        int minutes;
        int seconds;
        int sumSeconds;

        final int SEC_PER_MIN = 60;
        final int SEC_PER_HOUR = 60 * SEC_PER_MIN;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        hours = scan.nextInt();

        System.out.print("Enter the number of minutes: ");
        minutes = scan.nextInt();

        System.out.print("Enter the number of seconds: ");
        seconds = scan.nextInt();

        scan.close();

        sumSeconds = hours * SEC_PER_HOUR + minutes * SEC_PER_MIN + seconds;

        System.out.println("\nTotal seconds: " + sumSeconds);


    }

    
}
