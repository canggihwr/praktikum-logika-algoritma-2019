package sorttokobuahcanggihwr;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cwr
 */
public class SortTokoBuahCanggihWR {
    public static void main(String[] args) {
        String tanya,loop;
        int n = 0;
        String kota[] = {"MATARAM", "SELONG", "PRAYA", "AIKMEL", "KEDIRI"};
        String buah[] = {"Apel", "Salak", "Mangga", "Jeruk"};
        int data[][] = {
            {73,57,25,88,65},
            {45,73,55,105,75},
            {110,96,102,100,89},
            {100,78,125,98,112}
        };
        
        
        System.out.println("====== DATA SEBELUM DI-SORTING ======");
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
        
        do {            
        tanya = JOptionPane.showInputDialog(null, "Pilih Jenis Sorting :\n"
                + "A . BARIS\n"
                + "B . KOLOM\n"
                + "Pilih [A/B]");
        
        if("A".equalsIgnoreCase(tanya)){
            tanya = "BARIS";
            n = Integer.valueOf(JOptionPane.showInputDialog(null, "Pilih "+tanya+" ke : \n"
                + "1 - 4"));
            int temp[] = new int[4];
            n -= 1;
            for (int i = 0; i < data.length; i++) {
                for (int j = i+1; j < data[i].length; j++) {
                    if (data[n][i] < data[n][j]) {
                        for (int k = 0; k < temp.length; k++) {
                            temp[k] = data[k][i];
                            data[k][i] = data[k][j];
                            data[k][j] = temp[k];
                        }
                    }
                }
            }
            
        }else if("B".equalsIgnoreCase(tanya)) {
            tanya = "KOLOM";
            n = Integer.valueOf(JOptionPane.showInputDialog(null, "Pilih "+tanya+" ke : \n"
                + "1 - 5"));
            int temp[] = new int[5];
            n -= 1;
            for (int i = 0; i < 5; i++) {
                for (int j = i+1; j < data.length; j++) {
                    if (data[i][n] < data[j][n]) {
                        for (int k = 0; k < temp.length; k++) {
                            temp[k] = data[i][k];
                            data[i][k] = data[j][k];
                            data[j][k] = temp[k];
                        }
                    }
                }
            }
        }else{
            tanya = "TIDAK DIKETAHUI";
        }
        System.out.println("");
        System.out.println("=== DATA TERURUT DESCENDING "+tanya+" KE-"+(n+1)+" ===");
        System.out.println("|==================================================|");
        for (int i = 0; i < data.length; i++) {
            System.out.print("||");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(String.format("%6d  ||", data[i][j]));
            }System.out.println("");
        }
        System.out.println("+==================================================+");
        Scanner x = new Scanner(System.in);
        System.out.print("Ingin Sorting Lagi [Y/T] : ");
        loop = x.next();
        
        } while ("Y".equalsIgnoreCase(loop));
        
    }
}
