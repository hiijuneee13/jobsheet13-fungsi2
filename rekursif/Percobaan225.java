package rekursif;

import java.util.Scanner;

public class Percobaan225 {

    // Fungsi rekursif untuk menghitung bilangan^pangkat
    public static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat (x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();

        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        // Hitung hasil menggunakan rekursif
        int hasil = hitungPangkat(bilangan, pangkat);

        // MODIFIKASI: Membuat deret perhitungan
        StringBuilder deret = new StringBuilder();

        // contoh 2^5 → 2x2x2x2x2x1
        for (int i = 0; i < pangkat; i++) {
            deret.append(bilangan);
            deret.append("x");
        }
        deret.append("1");

        // Cetak deret dan hasil
        System.out.println("Perhitungan: " + deret + " = " + hasil);

    }
}
