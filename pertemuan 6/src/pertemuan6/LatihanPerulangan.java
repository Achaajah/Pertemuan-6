/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;

public class LatihanPerulangan {
    public static void main(String[] args) {
        // --- a. Bilangan Prima dan Bukan (0 - 20) ---
        System.out.println("a. Deret Bilangan Prima & Bukan (0-20):");
        System.out.print("Prima: ");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.print("\nBukan Prima: ");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i)) System.out.print(i + " ");
        }

        // --- b. Bilangan Ganjil dan Genap (0 - 20) ---
        System.out.println("\n\nb. Deret Ganjil & Genap (0-20):");
        int j = 0;
        System.out.print("Genap: ");
        while (j <= 20) {
            if (j % 2 == 0) System.out.print(j + " ");
            j++;
        }
        j = 0;
        System.out.print("\nGanjil: ");
        while (j <= 20) {
            if (j % 2 != 0) System.out.print(j + " ");
            j++;
        }

        // --- c. Huruf Z - A ---
        System.out.println("\n\nc. Huruf Z - A:");
        char huruf = 'Z';
        do {
            System.out.print(huruf + " ");
            huruf--;
        } while (huruf >= 'A');

        // --- d. Lagu Anak Ayam Turun N ---
        System.out.println("\n\nd. Lagu Anak Ayam:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int n = sc.nextInt();
        for (int k = n; k > 0; k--) {
            if (k > 1) {
                System.out.println("Anak ayam turun " + k + ", mati satu tinggal " + (k - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
            }
        }
    }

    // Fungsi pembantu untuk cek bilangan prima
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
