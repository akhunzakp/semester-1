package jobsheet5;

import java.util.Scanner;

public class Selection226 {
        public static void main(String [] args){
            Scanner input26 = new Scanner(System.in);

            System.out.print("Nilai uas : ");
            float finalExam = input26.nextFloat();
            System.out.print("Nilai uts :");
            float midExam = input26.nextFloat();
            System.out.print("Nilai kuis :");
            float quiz = input26.nextFloat();
            System.out.print("Nilai tugas :");
            float assigment = input26.nextFloat();

            float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assigment * 0.2F);

            String message = total < 65 ? "Retake" : "Pass";
            
            System.out.println("FInal Grade = " + total + " and the decission is " + message);


        }


}
