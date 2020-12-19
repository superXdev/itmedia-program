import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main {
private static String nama;
public static int jumlahBarang;
public static int pilihan;
public static int totalHarga;
public static int diskon;
public static int kembalian;
public static int pembayaran;
public static boolean beli_ulang = false;
public static boolean pembayaran_kurang = false;
public static int jumlahBarang1;
public static int jumlahBarang2;
public static int jumlahBarang3;
public static int jumlahBarang4;
public static int jumlahBarang5;
public static int jumlahBarang6;
public static int jumlahBarang7;
public static int jumlahBarang8;
public static int jumlahBarang9;
public static int jumlahBarang10;
public static boolean beli1 = false;
public static boolean beli2 = false;
public static boolean beli3 = false;
public static boolean beli4 = false;
public static boolean beli5 = false;
public static boolean beli6 = false;
public static boolean beli7 = false;
public static boolean beli8 = false;
public static boolean beli9 = false;
public static boolean beli10 = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi object class
        Scanner key = new Scanner(System.in);
        function func = new function();
        banner ban = new banner();
        //Deklarasi variabel
        String ulang = "n";
        nama = JOptionPane.showInputDialog("Masukkan nama anda");
        
        //Menampilkan sambutan
        ban.awal();
        System.out.println("Selamat datang "+nama);
        System.out.println("");
        
        do{
            
            do{
                beli_ulang = false;
                //Menampilkan menu
                ban.menu();
                System.out.print("Masukkan pilihan: ");
                pilihan = key.nextInt();
                
                //Memilih barang
                func.pilihanMenu(pilihan);
                
                if(beli_ulang == false){
                    ulang = JOptionPane.showInputDialog("Apakah anda ingin membeli yang lain? (y/n)");
                    if(("y").equals(ulang))
                        beli_ulang = true;
                }
            }while(beli_ulang);
            //Menentukan diskon
            if(jumlahBarang >= 3 || totalHarga > 150000){
                diskon = (int)func.hitungDiskon(totalHarga);
            }
            else{
                diskon = 0;
            }
            
            totalHarga = totalHarga - diskon;
             
            //Menampilkan total yang harus dibayar
            ban.pembayaran(jumlahBarang, totalHarga, diskon);
            //Meminta pembayaran
            do{
                pembayaran_kurang = false;
                pembayaran = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pembayaran"));
                if(pembayaran < totalHarga)
                    pembayaran_kurang = true;
            }while(pembayaran_kurang);
            kembalian = pembayaran - totalHarga;
            //Menampilkan struk belanja
            ban.struk_belanja();
            ulang = JOptionPane.showInputDialog("Apakah anda ingin melakukan pembelian lagi? (y/n)");
        }while(!("n").equals(ulang));
    }
    
}
