
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class function {
    //Untuk menghitung diskon
    public double hitungDiskon(int harga){
        double hasil=0;
        
        hasil = harga * 0.1;
        return hasil;
    }
    //Untuk mereset nilai variabel
    public void clearData(){
        Main.totalHarga = 0;
        Main.jumlahBarang = 0;
        Main.jumlahBarang1 = 0;
        Main.jumlahBarang2 = 0;
        Main.jumlahBarang3 = 0;
        Main.jumlahBarang4 = 0;
        Main.jumlahBarang5 = 0;
        Main.jumlahBarang6 = 0;
        Main.jumlahBarang7 = 0;
        Main.jumlahBarang8 = 0;
        Main.jumlahBarang9 = 0;
        Main.jumlahBarang10 = 0;
    }
    
    public void pilihanMenu(int param){
        Scanner key = new Scanner(System.in);
        switch(param){
            case 1:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang1 = key.nextInt();
                Main.jumlahBarang += inputBarang1;
                Main.jumlahBarang1 += inputBarang1;
                Main.totalHarga += inputBarang1 * 100000;
                Main.beli1 = true;
                break;
            case 2:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang2 = key.nextInt();
                Main.jumlahBarang += inputBarang2;
                Main.jumlahBarang2 += inputBarang2;
                Main.totalHarga += inputBarang2 * 700000;
                Main.beli2 = true;
                break;
            case 3:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang3 = key.nextInt();
                Main.jumlahBarang += inputBarang3;
                Main.jumlahBarang3 += inputBarang3;
                Main.totalHarga += inputBarang3 * 120000;
                Main.beli3 = true;
                break;
            case 4:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang4 = key.nextInt();
                Main.jumlahBarang += inputBarang4;
                Main.jumlahBarang4 += inputBarang4;
                Main.totalHarga += inputBarang4 * 80000;
                Main.beli4 = true;
                break;
            case 5:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang5 = key.nextInt();
                Main.jumlahBarang += inputBarang5;
                Main.jumlahBarang5 += inputBarang5;
                Main.totalHarga += inputBarang5 * 2700000;
                Main.beli5 = true;
                break;
            case 6:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang6 = key.nextInt();
                Main.jumlahBarang += inputBarang6;
                Main.jumlahBarang6 += inputBarang6;
                Main.totalHarga += inputBarang6 * 1000000;
                Main.beli6 = true;
                break;
            case 7:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang7 = key.nextInt();
                Main.jumlahBarang += inputBarang7;
                Main.jumlahBarang7 += inputBarang7;
                Main.totalHarga += inputBarang7 * 700000;
                Main.beli7 = true;
                break;
            case 8:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang8 = key.nextInt();
                Main.jumlahBarang += inputBarang8;
                Main.jumlahBarang8 += inputBarang8;
                Main.totalHarga += inputBarang8 * 5500000;
                Main.beli8 = true;
                break;
            case 9:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang9 = key.nextInt();
                Main.jumlahBarang += inputBarang9;
                Main.jumlahBarang9 += inputBarang9;
                Main.totalHarga += inputBarang9 * 760000;
                Main.beli9 = true;
                break;
            case 10:
                System.out.print("Masukkan jumlah barang: ");
                int inputBarang10 = key.nextInt();
                Main.jumlahBarang += inputBarang10;
                Main.jumlahBarang10 += inputBarang10;
                Main.totalHarga += inputBarang10 * 80000;
                Main.beli10 = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Menu tidak ditemukan!");
                Main.beli_ulang = true;
                break;
                }
    }
}
