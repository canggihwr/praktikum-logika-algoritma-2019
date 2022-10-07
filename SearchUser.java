package penyewaanwarnet;

import java.util.Scanner;

/**
 *
 * @author Alice
 */
public class SearchUser {

    public void search(String[][] user, String[] header) {
        Scanner input = new Scanner(System.in);
        System.out.print("Key pencarian : ");
        String key = input.next();
        int nKey = 99;
        boolean ketemu = true;
        
        if (ketemu == true) {
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user[0].length; j++) {
                    if (key.equalsIgnoreCase(user[i][j])) {
                        nKey = i;
                        System.out.println(">>> Data ditemukan pada kolom " + header[j] + "**");
                        System.out.println("*======================================================================================*");
                        System.out.println("|                             Hasil Searching Data Warnet                              |");
                        System.out.println("|======================================================================================|");
                        for (i = 0; i < user[0].length; i++) {
                            System.out.print(String.format("| %10s  ", header[i]));
                        }
                        System.out.println(" |");
                        System.out.println("|--------------------------------------------------------------------------------------|");
                        System.out.print(String.format("| %13s ", "Komp/PC-" + user[nKey][0]));
                        System.out.print(String.format("| %10s  ", user[nKey][1]));
                        System.out.print(String.format("| %10s  ", user[nKey][2] + " menit"));
                        for (j = 3; j < user[0].length; j++) {
                            System.out.print(String.format("| %10s  ", "Rp." + user[nKey][j]));
                        }
                        System.out.println(" |");
                        System.out.println("|--------------------------------------------------------------------------------------|");
                        break;
                    }
                }
            }
            ketemu = false;
            
        }
        if (nKey==99) {
            System.out.println(">>> Data Tidak Ditemukan**");
        }
    }
}
