/*
 * Tugas Praktikum 2 : Logika Algoritma
 * Canggih Wahyu Rinaldi : 1901050017
 */
package notacanggihwr;

/**
 *
 * @author CanggihWR
 */
public class NotaCanggihWR {
    
    public static void main(String[] args) {
        
        //DEKLARASI
        
        String toko = "Pelangi Nusantara";
        String tgl = "3 ";
        String bln = "Oktober ";
        String thn = "2019";
        String beli = "Canggih";
        String potongan = "30%";
       
        int m = 34000;
        int sb = 25000;
        int ml = 123000;
        int k = 73500;
        int s = 67800;
        
        double total1;
        double diskon;
        double total2;
        
        total1 = m+sb+ml+k+s;
        diskon = total1*30/100;
        total2 = total1-diskon;
       
        
        System.out.println("======= Nota Belanja =======");
        System.out.println("Toko\t: "+toko);
        System.out.println("tanggal : "+tgl +bln +thn);
        System.out.println("Pembeli : "+beli);
        System.out.println("====== Daftar Belanja ======");
        System.out.println("1. Minyak \t : Rp."+m);
        System.out.println("2. Susu Bubuk \t : Rp."+sb);
        System.out.println("3. Meja Lipat \t : Rp."+ml);
        System.out.println("4. Kaos \t : Rp."+k);
        System.out.println("5. Sarung \t : Rp."+s);
        System.out.println("======= Total Bayar =======");
        System.out.println("Total Belanja: Rp."+total1);
        System.out.println("Diskon : "+potongan);
        System.out.println("Total Bayar: "+total2);
        System.out.println("===========================");
        
        
    }
    
}
