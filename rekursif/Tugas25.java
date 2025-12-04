package rekursif;

import java.util.Scanner;

public class Tugas25 {

    // Rekursif: jumlah dari 1..n
    public static int jumlahRekursif(int n) {
        if (n <= 0) {
            return 0; // base case: jumlah sampai 0 = 0
        } else {
            return n + jumlahRekursif(n - 1);
        }
    }

    // Iteratif: jumlah dari 1..n
    public static int jumlahIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N (>=0): ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("N harus >= 0.");
        } else {
            int s1 = jumlahRekursif(N);
            int s2 = jumlahIteratif(N);
            System.out.println("Hasil jumlahRekursif(1.." + N + ") = " + s1);
            System.out.println("Hasil jumlahIteratif(1.." + N + ") = " + s2);

            // Sebagai pembelajaran, tampilkan juga rumus Gauss: N*(N+1)/2
            long gauss = (long) N * (N + 1) / 2;
            System.out.println("Rumus Gauss (verifikasi) N*(N+1)/2 = " + gauss);
        }

        sc.close();
    }
}

