package searchtokobuahcanggihwr;

/**
 *
 * @author cwr
 */
public class SearchTokoBuahCanggihWR {

    public static void main(String[] args) {
        String kota[] = {"MATARAM", "SELONG", "PRAYA", "AIKMEL", "KEDIRI"};
        String buah[] = {"Apel", "Salak", "Mangga", "Jeruk"};
        int data[][] = {
            {73, 57, 25, 88, 65},
            {45, 73, 55, 105, 75},
            {110, 96, 102, 100, 89},
            {100, 78, 125, 98, 112}
        };

        System.out.println("Data Penjualan Toko Buah Legenda (November 2019)");
        System.out.println("+-----------------------------------------------------------+");
        System.out.print("|   BUAH  | ");
        for (int i = 0; i < kota.length; i++) {
            System.out.print(String.format("%7s | ", kota[i]));
        }
        System.out.println("");
        System.out.println("|---------|---------|---------|---------|---------|---------|");
        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("|%8s |", buah[i]));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(String.format("%8d |", data[i][j]));
            }
            System.out.println("");
        }
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("Ket : semua data penjualan dalam kg");
        System.out.println("");

        int kb[] = new int[5];
        int kk[] = new int[5];
        int jml_kb = 0;
        int jml_kk = 0;
        for (int i = 0; i < data[0].length; i++) {
            kk[i] = data[0][i];
        }      
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (kb[j] < data[i][j]) {
                    kb[j] = data[i][j];
                }
                if (kk[j] > data[i][j]) {
                    kk[j] = data[i][j];
                }
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            if (kb[4] < data[i][4]) {
                kb[4] = data[i][4];
            }
            if (kk[4] > data[i][4]) {
                kk[4] = data[i][4];
            }
        }
        int max_k = 0;
        int min_k = kk[0];
        System.out.println("====== Nilai <KOLOM> TERBESAR ====== ");
        System.out.println("+---------------------------------------+");
        for (int i = 0; i < data[0].length; i++) {
            if (max_k < kb[i]) {
                max_k = kb[i];
            }
            jml_kb += kb[i];
            System.out.print("|  ");
            System.out.println("NILAI TERBESAR KOLOM KE-" + i + " : " + kb[i]+"\t|");
        }
        System.out.println("+---------------------------------------+");
        System.out.println("");
        System.out.println("====== Nilai <KOLOM> TERKECIL ====== ");
        System.out.println("+---------------------------------------+");
        for (int i = 0; i < data[0].length; i++) {
            if (min_k > kk[i]) {
                min_k = kk[i];
            }
            jml_kk += kk[i];
            System.out.print("|  ");
            System.out.println("NILAI TERKECIL KOLOM KE-" + i + " : " + kk[i]+"\t|");
        }
        System.out.println("+---------------------------------------+");
        System.out.println("Jumlah nilai kolom terbesar = "+jml_kb);
        System.out.println("Jumlah nilai kolom terkecil = "+jml_kk);
        System.out.println("Jumlah selisih (nilai terbesar - nilai terkecil) = "
                +max_k+" - "+min_k+" = "+(max_k-min_k));
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        
        int bb[] = new int[4];
        int bk[] = new int[4];
        int jml_bb = 0;
        int jml_bk = 0;
        for (int i = 0; i < data.length; i++) {
            bk[i] = data[i][0];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < data.length; j++) {
                if (bb[j] < data[j][i]) {
                    bb[j] = data[j][i];
                }
                if (bk[j] > data[j][i]) {
                    bk[j] = data[j][i];
                }
            }
        }
        int max_b = 0;
        int min_b = bk[0];
        System.out.println("====== Nilai <BARIS> TERBESAR ======");
        System.out.println("+---------------------------------------+");
        for (int i = 0; i < data.length; i++) {
            if (max_b < bb[i]) {
                max_b = bb[i];
            }
            jml_bb += bb[i];
            System.out.print("|  ");
            System.out.println("NILAI TERBESAR BARIS KE-" + i + " : " + bb[i]+"\t|");
        }
        System.out.println("+---------------------------------------+");
        System.out.println("");
        System.out.println("====== Nilai <BARIS> TERKECIL ====== ");
        System.out.println("+---------------------------------------+");
        for (int i = 0; i < data.length; i++) {
            if (min_b > bk[i]) {
                min_b = bk[i];
            }
            jml_bk += bk[i];
            System.out.print("|  ");
            System.out.println("NILAI TERKECIL BARIS KE-" + i + " : " + bk[i]+"\t|");
        }
        System.out.println("+---------------------------------------+");
        System.out.println("Jumlah nilai baris terbesar = "+jml_bb);
        System.out.println("Jumlah nilai baris terkecil = "+jml_bk);
        System.out.println("Jumlah selisih (nilai terbesar - nilai terkecil) = "
                +max_b+" - "+min_b+" = "+(max_b-min_b));
        System.out.println("");
    }

}
