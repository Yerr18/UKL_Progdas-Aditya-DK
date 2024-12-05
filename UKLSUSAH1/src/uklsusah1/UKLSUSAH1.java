/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsusah1;
import java.util.Scanner;
/**
 *
 * @author aditya
 */
public class UKLSUSAH1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] kehadiran = inputData(scanner, jumlahSiswa);
        Rekap(kehadiran);
    }

    
    public static int[] inputData(Scanner scanner, int jumlahSiswa) {
        int[] kehadiran = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
        }

        return kehadiran;
    }

    public static void Rekap(int[] kehadiran) {
        int totalHari = 0;
        int jumlahSiswa = kehadiran.length;

        for (int hadir : kehadiran) {
            totalHari += hadir;
        }

        double rataRata = (double) totalHari / jumlahSiswa;
        
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }

        System.out.printf("\nRata-rata kehadiran siswa: %.2f hari\n", rataRata);

        System.out.println("\nKESIMPULAN");
        
        System.out.println("\nSiswa dengan kehadiran di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRata) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
        
        System.out.println("\nSiswa dengan kehadiran di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRata) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
    }
}