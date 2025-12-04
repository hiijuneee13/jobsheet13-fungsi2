package rekursif;

import java.util.Scanner;

public class Percobaan125 {
    // Fungsi faktorial dengan rekursif
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1; // base case
        } else {
            return (n * faktorialRekursif(n - 1));
        }
    }

    // Fungsi faktorial dengan iteratif
    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
            System.out.println(faktorialRekursif(5));
            System.out.println(faktorialIteratif(5));
        }


    }
