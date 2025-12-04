package rekursif;

import java.util.Scanner;

public class Percobaan325 {

    // Fungsi rekursif
    public static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
           
            return (1.11 * hitungLaba(saldo, tahun - 1)); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun): ");
        int tahun = sc.nextInt();

        System.out.print("jumlah saldo setelah " + tahun + " tahun: ");
        System.out.print(hitungLaba(saldoAwal, tahun));
        }


    }

