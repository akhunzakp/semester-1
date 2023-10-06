package jobsheet6;

import java.util.Scanner;

public class Selection2Exp126{

    public static void main (String[] args) {
      int year;
      Scanner input26 = new Scanner(System.in);
      System.out.println("Input year = ");
      year = input26.nextInt();

        if(year%4 == 0)
            if(year%100 != 0){
                System.out.println("Leap year");
            }else 
                if(year%400 != 0){
                System.out.println("Leap year");
            }else {
                System.out.println("Not a leap year");
         }else {
            System.out.println("Not a leap year");
        }
    }
}

