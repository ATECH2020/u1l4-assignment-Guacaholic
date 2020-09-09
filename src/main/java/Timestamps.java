import java.util.Scanner;
 
class Timestamps {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int hours1 = scanner.nextInt();
       int minutes1 = scanner.nextInt();
       int seconds1 = scanner.nextInt();
       int hours2 = scanner.nextInt();
       int minutes2 = scanner.nextInt();
       int seconds2 = scanner.nextInt();
       int secHour1, secHour2;
       int secMin1, secMin2;
 
 
       /*
        *  your code goes here
        */
        secMin1 = minutes1 * 60;
        secMin2 = minutes2 * 60;
        secHour1 = hours1 * 3600;
        secHour2 = hours2 * 3600;
 
        int deltaHour = secHour2 - secHour1;
        int deltaMin = secMin2 - secMin1;
        int delta = seconds2 - seconds1;
        int totalSec = deltaHour + deltaMin + delta;
        System.out.print(totalSec);
 
       // closing the scanner object
       scanner.close();
   }
}
