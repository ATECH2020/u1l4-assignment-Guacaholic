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
        if(cA % 2 == 0)
        {
         cA = cA / 2;
        }else
        {
         cA = cA + 1;
         cA = cA / 2;
        }
         if(cB % 2 == 0)
        {
         cB = cB / 2;
        }else
        {
         cB = cB + 1;
         cB = cB / 2;
        }
        if(cC % 2 == 0)
        {
         cC = cC / 2;
        }else
        {
         cC = cC + 1;
         cC = cC / 2;
        }
        stu = cA + cB + cC;
        int desk = stu;
        System.out.print(desk);
 
 
       // closing the scanner object
       scanner.close();
   }
}
