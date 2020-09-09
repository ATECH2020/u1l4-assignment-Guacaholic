import java.util.Scanner;
 
class AnalogClock {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int ang = scanner.nextInt();
       int hour;
       int degrees;
       int time;
 
       /*
        *  your code goes here
        */
       hour = ang / 30;
       degrees = ang - (hour * 30);
       time = degrees * 2;
       System.out.print(time);
 
 
       // closing the scanner object
       scanner.close();
   }
}
