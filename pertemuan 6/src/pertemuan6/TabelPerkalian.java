/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maks 10): ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("Nilai n maksimal adalah 10!");
            return;
        }

        // Menggunakan Array 2 Dimensi (Matriks)
        int[][] tabel = new int[n + 1][n + 1];

        // Mengisi Array dengan hasil perkalian
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tabel[i][j] = i * j;
            }
        }

        // Menampilkan Tabel
        // Cetak header kolom
        System.out.print("    ");
        for (int j = 1; j <= n; j++) System.out.printf("%4d", j);
        System.out.println("\n-------------------------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " | "); // Cetak header baris
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", tabel[i][j]);
            }
            System.out.println();
        }
    }
}
