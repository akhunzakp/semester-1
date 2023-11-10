package exam;

import java.util.Scanner;

public class Question1{
    public static void main (String[] args) {
        int time;
        Scanner input26 = new Scanner(System.in);
        System.out.println("Input Problem Solving Time =    minutes ");
        time = input26.nextInt();

        if(time <= 180 ){
            System.out.println("Memenuhi Syarat");
            }else {
            System.out.println("Tidak Memenuhi");
            }
        int Language;
        System.out.println("Input Knowledge Language Programs =   Programs");
        Language = input26.nextInt();

        if(Language <= 3){
            System.out.println("Memenuhi Syarat");
            }else {
            System.out.println("Tidak Memenuhi");
            }
        int experience;
        System.out.println("Input Work Experience =   mounth");
        experience = input26.nextInt();

        if(experience <= 12 ){
            System.out.println("Memenuhi Syarat");
            }else {
            System.out.println("Tidak Memenuhi");
            }

        int Interview;
        System.out.println("interview Skor <80 = Tidak Memenuhi");
        System.out.println("Input Interview Skor = ");
        Interview = input26.nextInt();

        if(Interview <= 80 ){
            System.out.println("Memenuhi Syarat");
            }else {
            System.out.println("Tidak Memenuhi");
            }

        int Graduated;
        System.out.println("Graduated Code");
        System.out.println("S1 = 100");
        System.out.println("D4 = 75");
        System.out.println("D2 = 50");
        System.out.println("D1 = 35");
        System.out.println("Input Graduated Code = ");
        Graduated = input26.nextInt();

        if(Interview <= 50 ){
            System.out.println("Memenuhi Syarat");
            }else {
            System.out.println("Tidak Memenuhi");
            }
        int From;
        System.out.println("Graduated Code");
        System.out.println("Teknik Informatika");
        System.out.println("Ilmu Komputer");
        System.out.println("Rekayasa Perangkat Lunak");
        System.out.println("Sistem Informasi");
        System.out.println("Except that you can write 10 ");
        System.out.println("Input Graduated your Graduated code = ");
        From = input26.nextInt();

        if(From < 10 ){
            System.out.println("Memenuhi Syarat");
            }else {
            System.out.println("Tidak Memenuhi");
        

       }

    }
}

