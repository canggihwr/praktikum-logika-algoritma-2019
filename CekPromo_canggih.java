
package cekpromo_canggih;
import javax.swing.JOptionPane;


public class CekPromo_canggih {
    
    public static void main(String[] args) {
        char produk = 0;
        float a,b,c,a2 = 0,b2 = 0,c2 = 0,a3,b3,c3,da,db,dc;
        int jumlah;
        String kode,nama,kata,printA,printB,printC;
   
        a = 65000;
        b = 130000;
        c = 84900;
   
   kata = "======== Produk Promo ========"
           + "\nkode[A]:Garam Himalaya 1kg"
           + "\nkode[B]:Gamis Lengan Panjang"
           + "\nkode[C]:Minyak Kelapa"
           + "\n--------------------------------"
           + "\nMasukkan kode A/B/C ?"+produk;
   
   kode = JOptionPane.showInputDialog(null, kata);
   produk = kode.toUpperCase().charAt(0);
   
   
   if(produk=='A') {
     nama = "Garam Himalaya 1kg";
   }else if(produk=='B') {
     nama = "Gamis Lengan Panjang";
   }else if(produk=='C') {
     nama = "Minyak Kelapa";
   }else {
     nama = "Produk tidak ada";
   }
   
   
   jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, "Produk:"+nama+"\nMasukkan Jumlah Pembelian (1-10):"));
   
   switch(produk) {
     case 'A':
     
     if(jumlah>3){
       a2 = a2 - 10000;
     }else if(jumlah>2){
       a2 = a2 - 7500;
     }else if(jumlah>1){
       a2 = a2 - 5000;
     }else {
       a2 = 0;
     }
     break;
     
     
     case 'B':
     
     if(jumlah>2){
       b2 = b*37/100;
     }else if(jumlah>1){
       b2 = b*32/100;
     }else if(jumlah==1){
       b2 = b*25/100;
     }else {
       b2 = 0;
     }
     break;
     
     
     case 'C':
     
     if(jumlah>=3){
       c2 = c*15/100;
     }else {
       c2 = 0;
     }
     break;  
   }
   
   
   a3 = a*jumlah;
   b3 = b*jumlah;
   c3 = c*jumlah;
   
   da = a3-a2;
   db = b3-b2;
   dc = c3-c2;
   
   printA = "Produk : Garam Himalaya 1kg\n--------------------------------\nHarga Satuan : "+a+
            "\nJumlah beli : "+jumlah+" buah"+"\nTotal beli : Rp. "+a3+
            "\n-------------------------------\nPotongan : Rp. "+a2+
            "\nTotal Harga : Rp. "+da;
   
   printB = "Produk : Garam Himalaya 1kg\n--------------------------------\nHarga Satuan : "+b+
            "\nJumlah beli : "+jumlah+" buah"+"\nTotal beli : Rp. "+b3+
            "\n-------------------------------\nPotongan : Rp. "+b2+
            "\nTotal Harga : Rp. "+db;
   
   printC = "Produk : Garam Himalaya 1kg\n--------------------------------\nHarga Satuan : "+c+
            "\nJumlah beli : "+jumlah+" buah"+"\nTotal beli : Rp. "+c3+
            "\n-------------------------------\nPotongan : Rp. "+c2+
            "\nTotal Harga : Rp. "+dc;
   
   
   if(produk=='A'){
     JOptionPane.showMessageDialog(null, printA);
   }else if(produk=='B'){
     JOptionPane.showMessageDialog(null, printB);
   }else if(produk=='C'){
     JOptionPane.showMessageDialog(null, printC);
   }else {
     JOptionPane.showMessageDialog(null, "Produk Tidak Ada");
     
     
     }
    
   }
    
}
