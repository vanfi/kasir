package javaapplication15;

import java.util.Scanner;

/**
 *
 * @FivanVelaroni/24/XR6
 */
public class saoljava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String namaPembeli, anggota, ulangi;
        int jumlahBarang, kode;
        double buku = 2000, pensil = 1000, rautan = 40000, tas = 80000, totalHarga, diskon, totalBayar;

        System.out.println(" ~ Program Kasir ~ ");
        do {
            System.out.print("Nama Pembeli : ");
            namaPembeli = scan.next();
            System.out.print("kode barang : ");
            kode = scan.nextInt();
            System.out.print("nama barang : ");
            anggota = scan.next();
            System.out.print("Jumlah Barang : ");
            jumlahBarang = scan.nextInt();

            //public class void(pembayaran);{
            if (anggota.equalsIgnoreCase("buku")) {
                totalHarga = buku * jumlahBarang;
                if (totalHarga < 200000) {
                    diskon = totalHarga * 10 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga < 500000) {
                    diskon = totalHarga * 20 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga >= 500000) {
                    diskon = totalHarga * 50 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                }

            }
            if (anggota.equalsIgnoreCase("pensil")) {
                totalHarga = pensil * jumlahBarang;
                if (totalHarga < 200000) {
                    diskon = totalHarga * 10 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga < 500000) {
                    diskon = totalHarga * 20 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga >= 500000) {
                    diskon = totalHarga * 50 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                }

            }
            if (anggota.equalsIgnoreCase("rautan")) {
                totalHarga = rautan * jumlahBarang;
                if (totalHarga < 100000) {
                    diskon = totalHarga * 10 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga < 200000) {
                    diskon = totalHarga * 20 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga >= 500000) {
                    diskon = totalHarga * 50 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                }
            }
            if (anggota.equalsIgnoreCase("tas")) {
                totalHarga = tas * jumlahBarang;
                if (totalHarga < 100000) {
                    diskon = totalHarga * 10 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga < 500000) {
                    diskon = totalHarga * 20 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                } else if (totalHarga >= 500000) {
                    diskon = totalHarga * 50 / 100;
                    totalHarga = totalHarga - diskon;
                    System.out.println("totalHarga :" + totalHarga);
                }
            }
            System.out.println("adakah perbelanjaan lain? :");
            ulangi = scan.next();
        } while (ulangi.equalsIgnoreCase("ya"));
    }
}
