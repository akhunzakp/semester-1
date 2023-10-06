package jobsheet3;

import java.util.Scanner;

public class Bank26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int init_sav_mount, sav_period;
        double final_save, interesrt, interesrt_persen = 0.02;

        System.out.println("save mount");
        init_sav_mount=sc.nextInt();
        System.out.println("save period");
        sav_period=sc.nextInt();
        interesrt = init_sav_mount*interesrt_persen*sav_period;
        final_save= interesrt+ init_sav_mount;
        System.out.println("INTEREST"+ interesrt);
        System.out.println("final save" + final_save);

    }
    
}