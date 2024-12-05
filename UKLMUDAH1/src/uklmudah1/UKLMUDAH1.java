/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklmudah1;

import java.util.Scanner;

/**
 *
 * @author aditya
 */
public class UKLMUDAH1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String member;
        double total;
        double diskon = 0;
        double totalpembayaran = 0;

        System.out.println("Masukkan total belanja Anda (Rp): ");
        total = input.nextDouble();
        input.nextLine();

        System.out.print("Apakah punya kartu member? punya/tidak: ");
        member = input.nextLine();

        if (member.equalsIgnoreCase("punya")) {
            if (total >= 100000 && total <= 200000) {
                diskon = 0.10;
            } else if (total > 200000) {
                diskon = 0.20;
            } else {
                System.out.println("Anda tidak mendapatkan diskon.");
            }
        } else {
            System.out.println("Anda tidak memiliki kartu member.");
        }

        totalpembayaran = total - (total * diskon);

        System.out.println("Total belanja Anda: Rp" + total);
        System.out.println("Diskon yang diberikan: " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayar: Rp" + totalpembayaran);
    }
}