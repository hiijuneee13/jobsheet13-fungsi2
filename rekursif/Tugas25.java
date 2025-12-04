import java.util.Scanner;

public class Tugas25 {

    // Fungsi rekursif untuk menghitung jumlah 1..n
    public static int jumlahRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        return n + jumlahRekursif(n - 1);
    }

    // Fungsi iteratif untuk menghitung jumlah 1..n
    public static int jumlahIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        int hasilRekursif = jumlahRekursif(N);
        int hasilIteratif = jumlahIteratif(N);

        System.out.println("Hasil (rekursif) : " + hasilRekursif);
        System.out.println("Hasil (iteratif) : " + hasilIteratif);

        sc.close();
    }
}
