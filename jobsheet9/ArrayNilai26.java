package jobsheet9;

import java.util.Scanner;

public class ArrayNilai26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");

        int jumlahMhs = input26.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        double totallulus = 0;
        double totaltidaklulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke- "+(i+1)+" : ");
            nilaiMhs[i] = input26.nextInt();
        
            if (nilaiMhs[i] > 70) {
                totallulus =+ nilaiMhs[i];
                jumlahLulus++;
            }else 
                totaltidaklulus += nilaiMhs[i];
                jumlahTidakLulus++;
        }
        double rata2lulus = totallulus/jumlahLulus;
        double rata2tidaklulus = totaltidaklulus/jumlahTidakLulus;

        System.out.println("Rata-rata nilai lulus = "+ rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ rata2tidaklulus);
    }
}

  