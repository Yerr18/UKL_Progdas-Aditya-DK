/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsedang3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author aditya
 */
public class UKLSEDANG3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;
        
        System.out.println("Selamat datang di kuis Matematika");
        System.out.println("Berikut soal kuis matematikanya :");
        
        while (running) {
            int bil1 = random.nextInt(10) + 1; 
            int bil2 = random.nextInt(10) + 1; 
            char operator;
            int hasilBenar = 0;

            switch (random.nextInt(3)) {
                case 0:
                    operator = '*';
                    hasilBenar = bil1 * bil2;
                    break;
                case 1:
                   operator = '/';
                   hasilBenar = bil1 * bil2;
                    break;
                   
                default:
                    operator = '+';
                    hasilBenar = bil1 + bil2;
                    break;
            }

            System.out.print(bil1 + " " + operator + " " + bil2 + " = ");
            int jawaban = scanner.nextInt();

            if (jawaban == hasilBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + hasilBenar);
            }

            scanner.nextLine(); 
            System.out.print("Apakah Anda ingin melanjutkan kuis? (iya/tidak): ");
            String lanjut = scanner.nextLine().toLowerCase();

            if (lanjut.equals("tidak")) {
                running = false;
                System.out.println(" Kuis selesaii, Terima kasih sudah menjawab kuis.");
            }
        }
        scanner.close();
}
}
