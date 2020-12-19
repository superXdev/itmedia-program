/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class banner {
    public void awal(){
        System.out.println(" ----------------------------------------------------------");
        System.out.println("|                   {  itMedia shop }                      |");
        System.out.println(" ----------------------------------------------------------");
    }
    
    public void menu(){
        System.out.println("0-----------------< SILAHKAN PILIH MENU >-------------------0");
        System.out.println("|     Barang                         |      Harga           |");
        System.out.println(" ===========================================================");
        System.out.println("||  1. Flash Disk 4GB                |    Rp. 100.000      ||");
        System.out.println("||  2. Mouse Razer                   |    Rp. 700.000      ||");
        System.out.println("||  3. Screen Protector 15.6inch     |    Rp. 120.000      ||");
        System.out.println("||  4. MousePad 14x16                |    Rp. 80.000       ||");
        System.out.println("||  5. Ram DDR 4GB                   |    Rp. 2.700.000    ||");
        System.out.println("||  6. Xbox OneS ControllerWireless  |    Rp. 1000.000     ||");
        System.out.println("||  7. Gaming Keyboard RGB Wireless  |    Rp. 700.000      ||");
        System.out.println("||  8. InfocusProjector In114xa XGA  |    Rp. 5.500.000    ||");
        System.out.println("||  9. HP DeskJet Ink Advantage2135  |    Rp. 760.000      ||");
        System.out.println("||  10. Gamepad Stick HP Wireless    |    Rp. 80.000       ||");
        System.out.println("=============================================================");
        System.out.println("| -Setiap pembelian dengan jumlah barang lebih dari 2 atau  |");
        System.out.println("|  total harga lebih dari 150.000 rupiah akan mendapatkan   |");
        System.out.println("|  diskon sebesar 10%                                       |");
        System.out.println("=============================================================");
    }
    
    public void pembayaran(int barang, int harga, int diskon){
        System.out.println("");
        System.out.println("0----------------< TOTAL YANG HARUS DIBAYAR >---------------0");
        System.out.println("| Jumlah barang : " + barang);
        System.out.println("| Total harga   : Rp. " + harga);
        System.out.println("| Diskon        : Rp. " + diskon);
        System.out.println("=============================================================");
    }
    
    public void struk_belanja(){
        System.out.println("");
        System.out.println("0--------------------[ STRUK BELANJA ]----------------------0");
        System.out.println("|        Nama Barang          |   Jumlah   |  Total Harga   |");
        System.out.println("0-----------------------------------------------------------0");
        if(Main.beli1)
            System.out.println("| Flash Disk 4GB              |      "+Main.jumlahBarang1+"     |   Rp. "+Main.jumlahBarang1*100000);
        if(Main.beli2)
            System.out.println("| Mouse Razer                 |      "+Main.jumlahBarang2+"     |   Rp. "+Main.jumlahBarang2*700000);
        if(Main.beli3)
            System.out.println("| Screen Protector 15.6inch   |      "+Main.jumlahBarang3+"     |   Rp. "+Main.jumlahBarang3*120000);
        if(Main.beli4)
            System.out.println("| MousePad 14x16              |      "+Main.jumlahBarang4+"     |   Rp. "+Main.jumlahBarang4*80000);
        if(Main.beli5)
            System.out.println("| Ram DDR 4GB                 |      "+Main.jumlahBarang5+"     |   Rp. "+Main.jumlahBarang5*2700000);
        if(Main.beli6)
            System.out.println("| Xbox OneS ControllerWireless|      "+Main.jumlahBarang6+"     |   Rp. "+Main.jumlahBarang6*1000000);
        if(Main.beli7)
            System.out.println("| Gaming Keyboard RGB Wireless|      "+Main.jumlahBarang7+"     |   Rp. "+Main.jumlahBarang7*700000);
        if(Main.beli8)
            System.out.println("| InfocusProjector In114xa XGA|      "+Main.jumlahBarang8+"     |   Rp. "+Main.jumlahBarang8*5500000);
        if(Main.beli9)
            System.out.println("| HP DeskJet Ink Advantage2135|      "+Main.jumlahBarang9+"     |   Rp. "+Main.jumlahBarang9*760000);
        if(Main.beli10)
            System.out.println("| Gamepad Stick HP Wireless   |      "+Main.jumlahBarang10+"    |   Rp. "+Main.jumlahBarang10*80000);
        System.out.println("0-----------------------------------------------------------0");
        System.out.println("Total harga : "+Main.totalHarga);
        System.out.println("Jumlah      : "+Main.jumlahBarang);
        System.out.println("Diskon      : "+Main.diskon);
        System.out.println("Pembayaran  : "+Main.pembayaran);
        System.out.println("Kembalian   : "+Main.kembalian);
        System.out.println("0===========================================================0");
    }
}
