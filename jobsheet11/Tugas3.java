package jobsheet11;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // left triangle pattern from input user
    System.out.print("Masukkan angka : ");
    int number = input.nextInt();

    for (int i = 0; i <number; i++) {
        for (int j = 2 * (number - i); j >= 0; j--){
            System.out.print(" ");
        }
        System.out.println();
    }
}
}

