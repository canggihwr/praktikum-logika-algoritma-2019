package penyewaanwarnet;

import java.util.Scanner;

/**
 *
 * @author Alice
 */
public class WarnetMain {

    public static void main(String[] args) {
        
        UserFiles c = new UserFiles();
        SortUser c2 = new SortUser();
        SearchUser c3 = new SearchUser();
        
        Scanner x = new Scanner(System.in);
        System.out.println("  ◤====================================================◥");
        System.out.println("  ╏            **Aplikasi Penyewaan Warnet**            ╏");
        System.out.println("  ╏ ____________ • Canggih Wahyu Rinaldi • ____________ ╏");
        System.out.println("  ╏                                                     ╏");
        System.out.println("  ╏ PC 1-5  (biasa) : Rp.500/10 menit => Rp.3000/jam    ╏");
        System.out.println("  ╏ PC 6-10 (AC)    : Rp.1000/10 menit => Rp.6000/jam   ╏");
        System.out.println("  ╏                                                     ╏");
        System.out.println("  ╏ *Discount 20% untuk penyewaan 100 menit atau lebih  ╏");
        System.out.println("  ◣----------------------------------------------------◢");
        System.out.println("");
        System.out.print("Masukkan jumlah user : ");
        int nUser = x.nextInt();
        System.out.println("");
        
        String[] header = c.menu();
        String[][] user = c.inputUser(header, nUser);
        double[] totalBayar = c2.getTotalBayar(user);
        double pendapatan = c2.pendapatan(totalBayar);
        
        c.printNota(header, user);
        boolean loop = true;
        
        while (loop) {
            c.pressEnter();
            System.out.println("=======================================================");
            System.out.println("|            **Aplikasi Penyewaan Warnet**            |");
            System.out.println("| 1 . Sorting Ascending (Terendah ke tertinggi)       |");
            System.out.println("| 2 . Sorting Descending (Tertinggi ke terendah)      |");
            System.out.println("| 3 . Total Pendapatan                                |");
            System.out.println("| 4 . Searching (Pencarian)                           |");
            System.out.println("| 0 . Exit (Keluar Aplikasi)                          |");
            System.out.println("*-----------------------------------------------------*");
            System.out.print("Pilih [1/2/3/0] : ");
            int pilih = x.nextInt();
            System.out.println("");
            
            if (pilih == 1) {
                c2.sortAsc(user, totalBayar);
                c2.viewSort(header, user);
            } else if (pilih == 2) {
                c2.sortDesc(user, totalBayar);
                c2.viewSort(header, user);
            } else if (pilih == 3) {
                c2.printPendapatan(header, user, pendapatan);
            } else if (pilih == 4) {
                c3.search(user, header);
            } else {
                System.exit(0);
            }
        }
        
    }
    
}
