import java.util.Scanner;
 
class StudentDesks {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int cA = scanner.nextInt();
       int cB = scanner.nextInt();
       int cC = scanner.nextInt();
       int stu;
 
      
 
       /*
        *  your code goes here
        */
        stu = cA + cB + cC;
        if(stu % 2 == 0)
        {
         stu = stu / 2;
        }else if (stu % 2 != 0)
        {
         stu = stu + 1;
         stu = stu / 2;
        }
        int desk = stu;
        System.out.print(desk);
 
 
       // closing the scanner object
       scanner.close();
   }
}
