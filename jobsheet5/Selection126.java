package jobsheet5;

import java.util.Scanner;

public class Selection126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        //System.out.print("input a number = ");
        //int number = input26.nextInt();
        //if(number%2 == 0){
            //System.out.println(number+" is an even number!");
        //}else{
            //System.out.println(number+" is an odd number!");
        //}

        System.out.print("input a number = ");
        int number = input26.nextInt();
        String output = (number%2 == 0) ? number+" is an even number!" : number+" is an odd number!";
        System.out.println(output);

        }
    }
