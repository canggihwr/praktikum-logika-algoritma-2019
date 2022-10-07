package penyewaanwarnet;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author Alice
 */
public class UserFiles {

    public String[] menu() {
        String[] header = {
            "KOMPUTER(PC)",
            "USERNAME",
            "WAKTU",
            "BIAYA",
            "DISKON",
            "TOTAL"
        };
        return header;
    }

    public String[][] inputUser(String[] header, int n) {
        Scanner x = new Scanner(System.in);
        String[][] user = new String[n][6];

        int com[] = new int[n];
        String username[] = new String[n];
        int time[] = new int[n];
        double harga[] = new double[n];
        double diskon[] = new double[n];
        double total[] = new double[n];
        
        System.out.println("-------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("Pilih Komputer[1-10] : ");
            com[i] = x.nextInt();
            System.out.print("Masukkan Username : ");
            username[i] = x.next();
            System.out.print("Durasi (dalam satuan menit) : ");
            time[i] = x.nextInt();
            System.out.println("-------------------------------");
            
            if (com[i] <= 5) {
                harga[i] = time[i]*50;
                total[i] = harga[i];
                if (time[i] >= 100) {
                    diskon[i] = total[i]/5;
                    total[i] = total[i] - diskon[i];
                }
            }else {
                harga[i] = time[i]*100;
                total[i] = harga[i];
                if (time[i] >= 100) {
                    diskon[i] = total[i]/5;
                    total[i] = total[i] - diskon[i];
                }
            }
            
            user[i][0] = String.valueOf(com[i]);
            user[i][1] = username[i];
            user[i][2] = String.valueOf(time[i]);
            user[i][3] = String.valueOf(harga[i]);
            user[i][4] = String.valueOf(diskon[i]);
            user[i][5] = String.valueOf(total[i]);
        }
        return user;
    }
    
    public void printNota(String[] header , String[][] user) {
        System.out.println("*======================================================================================*");
        System.out.println("|                                 Nota Penyewaan Warnet                                |");
        System.out.println("|======================================================================================|");
        for (int i = 0; i < user[0].length; i++) {
            System.out.print(String.format("| %10s  ", header[i]));
        }System.out.println(" |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        for (int i = 0; i < user.length; i++) {
            System.out.print(String.format("| %13s ", "Komp/PC-"+user[i][0]));
            System.out.print(String.format("| %10s  ", user[i][1]));
            System.out.print(String.format("| %10s  ", user[i][2]+" menit"));
            for (int j = 3; j < user[0].length; j++) {
                System.out.print(String.format("| %10s  ", "Rp."+user[i][j]));
            }
            System.out.println(" |");
        }
        System.out.println("*--------------------------------------------------------------------------------------*");
    }
    
    public void pressEnter() {
        Scanner enter = new Scanner(System.in);
        System.out.print("tekan *enter untuk melanjutkan ");
        enter.nextLine();
    }
}
