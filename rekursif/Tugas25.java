package rekursif;

import java.util.Scanner;

public class Tugas25 {

    // Rekursif
    static int jumlahRekursif(int[] data, int i) {
        if (i == data.length) {
            return 0;
        }
        return data[i] + jumlahRekursif(data, i + 1);
    }

    // Iteratif
    static int jumlahIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] data = new int[N];

        // Input angka dari N ke 1
        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[N - i] = sc.nextInt();
        }

        int total = jumlahRekursif(data, 0);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);

        sc.close();
    }
}
