/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
    String namaPembeli,anggota;
    int jumlahBarang;
    double hargaSatuBarang=10000,totalHarga,diskon,totalBayar;

    System.out.println(" ~ Program Kasir ~ ");
    System.out.print("Nama Pembeli : ");
    namaPembeli = scan.next();
    System.out.print("anggota : ");
    anggota = scan.next();
    
    System.out.print("Jumlah Barang : ");
    jumlahBarang = scan.nextInt();
    
    //public class void(pembayaran);{
      totalHarga = hargaSatuBarang * jumlahBarang;
      
      if (anggota.equalsIgnoreCase("ya")){
        if (totalHarga > 1000000){
        diskon = totalHarga * 10 / 100;
        totalHarga = totalHarga - diskon;
        diskon = totalHarga * 10/100;
        totalHarga = totalHarga - diskon;
        System.out.println("totalHarga :" +totalHarga);
        }
        
        else if (totalHarga < 1000000){
        diskon = totalHarga * 10/100;
        totalHarga = totalHarga - diskon;
        System.out.println("totalHarga :" +totalHarga);
        }
        
        }
        if (anggota.equalsIgnoreCase("Tidak")){
          if (totalHarga >1000000){
            diskon = totalHarga * 10/100;
        totalHarga = totalHarga - diskon;
        System.out.println("totalHarga :" +totalHarga);
          }
          else if (totalHarga < 1000000){
            System.out.println("totalHarga :" + totalHarga);
          }
        }
        
        
      }
      }
    
