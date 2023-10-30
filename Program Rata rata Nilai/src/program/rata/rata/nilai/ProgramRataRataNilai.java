/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.rata.rata.nilai;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        // Mendeklarasikan array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[n];

        // Menerima input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Mencari rata-rata nilai
        int total = 0;
        for (int nilaiMahasiswa : nilai) {
            total += nilaiMahasiswa;
        }
        double rataRata = (double) total / n;

        // Menampilkan hasil
        System.out.println("Rata-rata nilainya adalah " + rataRata);
    }
}
