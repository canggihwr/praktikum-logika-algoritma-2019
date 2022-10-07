package tokobuah_cwr;

import java.util.Scanner;

/**
 *
 * @author ccxcm
 */
public class TokoBuahCanggih {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String kota[] = {"MATARAM", "SELONG", "PRAYA", "AIKMEL", "KEDIRI"};
        String buah[] = {"Apel", "Salak", "Mangga", "Jeruk"};
        int harga[] = {30000, 12000, 10000, 18000};
        int data[][] = new int[4][5];
        int data2[][] = new int[4][5];

        System.out.println("\n-----------------------------------------------------");

        for (int loop = 0; loop < kota.length; loop++) {
            for (int i = 0; i < data.length; i++) {
                for (int j = loop; j < loop + 1; j++) {
                    System.out.print("Toko cabang " + kota[j] + " : jumlah penjualan buah " + buah[i] + " (kg) : ");
                    data[i][j] = x.nextInt();
                    data2[i][j] = data[i][j];
                }
            }
            System.out.println("------------------------------------------------------------");
        }

        System.out.println("");

        System.out.println("Data Penjualan Toko Buah Legends (November 2019)");
        System.out.println("+-----------------------------------------------------------+");
        System.out.print("|   BUAH  | ");
        for (int i = 0; i < kota.length; i++) {
            System.out.print(String.format("%7s | ", kota[i]));
        }
        System.out.println("");
        System.out.println("|---------|---------|---------|---------|---------|---------|");
        for (int i = 0; i < data2.length; i++) {
            System.out.print(String.format("|%8s |", buah[i]));
            for (int j = 0; j < data2[i].length; j++) {
                System.out.print(String.format("%8d |", data2[i][j]));
            }
            System.out.println("");
        }
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("Ket: semua data penjualan dalam kg");
        System.out.println("");
        System.out.println("Harga Buah per kg:");

        for (int i = 0; i < buah.length; i++) {
            System.out.println(String.format("|%8s |", buah[i]) + ("    " + harga[i] + " |"));
        }

        int totalPendapatan;
        double totalApel = 0, totalSalak = 0, totalMangga = 0, totalJeruk = 0;
        double totalMataram = 0, totalSelong = 0, totalPraya = 0, totalAikmel = 0, totalKediri = 0;

        for (int i = 0; i < kota.length; i++) {
            totalApel += data2[0][i];
            totalSalak += data2[1][i];
            totalMangga += data2[2][i];
            totalJeruk += data2[3][i];
        }

        for (int i = 0; i < buah.length; i++) {
            totalMataram += data2[i][0];
            totalSelong += data2[i][1];
            totalPraya += data2[i][2];
            totalAikmel += data2[i][3];
            totalKediri += data2[i][4];
        }

        double apel, salak, mangga, jeruk, mataram, selong, praya, aikmel, kediri;

        apel = totalApel * 30000;
        salak = totalSalak * 12000;
        mangga = totalMangga * 10000;
        jeruk = totalJeruk * 18000;

        totalPendapatan = (int) (apel + salak + mangga + jeruk);

        double beratBuah[] = {totalApel, totalSalak, totalMangga, totalJeruk};
        double hargaBuah[] = {apel, salak, mangga, jeruk};
        double beratKota[] = {totalMataram, totalSelong, totalPraya, totalAikmel, totalKediri};
        double hargaKota[] = new double[kota.length];

        for (int i = 0; i < hargaKota.length; i++) {
            hargaKota[i] = (data2[0][i] * 30000) + (data2[1][i] * 12000) + (data2[2][i] * 10000) + (data2[3][i] * 18000);
        }

        System.out.println("");
        System.out.println("Total Pendapatan bulan November 2019: Rp." + totalPendapatan);
        System.out.println("");
        System.out.println("Detail Data Penjualan Tiap Buah:");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|   BUAH   | TOTAL PENJUALAN (KG) | TOTAL PENDAPATAN |");
        System.out.println("|----------------------------------------------------+");
        for (int i = 0; i < buah.length; i++) {
            System.out.print(String.format("| %8s | ", buah[i]));
            System.out.print("\t\t" + beratBuah[i] + "\t  |" + "   Rp." + hargaBuah[i] + "   |\n");
        }
        System.out.println("");
        System.out.println("Detail Data Penjualan Tiap Cabang:");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|  CABANG  | TOTAL PENJUALAN (KG) | TOTAL PENDAPATAN |");
        System.out.println("|----------------------------------------------------+");
        for (int i = 0; i < kota.length; i++) {
            System.out.print(String.format("| %8s | ", kota[i]));
            System.out.print("\t\t" + beratKota[i] + "\t  |" + "   Rp." + hargaKota[i] + "   |\n");
        }

    }

}
