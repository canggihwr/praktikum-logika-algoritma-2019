package penyewaanwarnet;

/**
 *
 * @author Alice
 */
public class SortUser {
    
    public double[] getTotalBayar(String[][] user) {
        int n = user.length;
        double[] total = new double[n];

        for (int i = 0; i < n; i++) {
            total[i] = Double.parseDouble(user[i][5]);
        }
        return total;
    }

    public void sortAsc(String[][] user, double[] total2) {
        int n = total2.length;
        double tempTotal;
        String tempUser;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (total2[i] > total2[j]) {
                    tempTotal = total2[i];
                    total2[i] = total2[j];
                    total2[j] = tempTotal;
                    
                    for (int kolom = 0; kolom < n; kolom++) {
                        tempUser = user[i][kolom];
                        user[i][kolom] = user[j][kolom];
                        user[j][kolom] = tempUser;
                    }
                }
            }
        }
        for (int loop = 0; loop < n; loop++) {
            user[loop][5] = String.valueOf(total2[loop]);
        }
    }

    public void sortDesc(String[][] user, double[] total) {
        int n = total.length;
        double tempTotal;
        String tempUser;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (total[i] < total[j]) {
                    tempTotal = total[i];
                    total[i] = total[j];
                    total[j] = tempTotal;
                    
                    for (int kolom = 0; kolom < n; kolom++) {
                        tempUser = user[i][kolom];
                        user[i][kolom] = user[j][kolom];
                        user[j][kolom] = tempUser;
                    }
                }
            }
        }
        for (int loop = 0; loop < n; loop++) {
            user[loop][5] = String.valueOf(total[loop]);
        }
    }

    public void viewSort(String[] header, String[][] user) {
        System.out.println("*======================================================================================*");
        System.out.println("|                         Hasil Sorting Data Penyewaan Warnet                          |");
        System.out.println("|======================================================================================|");
        for (int i = 0; i < user[0].length; i++) {
            System.out.print(String.format("| %10s  ", header[i]));
        }
        System.out.println(" |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        for (int i = 0; i < user.length; i++) {
            System.out.print(String.format("| %13s ", "Komp/PC-" + user[i][0]));
            System.out.print(String.format("| %10s  ", user[i][1]));
            System.out.print(String.format("| %10s  ", user[i][2] + " menit"));
            for (int j = 3; j < user[0].length; j++) {
                System.out.print(String.format("| %10s  ", "Rp." + user[i][j]));
            }
            System.out.println(" |");
        }
        System.out.println("*--------------------------------------------------------------------------------------*");
    }
    
    public double pendapatan(double[] total) {
        double pendapatan = 0;
        for (int i = 0; i < total.length; i++) {
            pendapatan += total[i];
        }
        return pendapatan;
    }
    
    public void printPendapatan(String[] header , String[][] user , double pendapatan) {
//        String penghasilan = String.valueOf(pendapatan);
        System.out.println("*======================================================================================*");
        System.out.println("|                                Total Pendapatan Warnet                               |");
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
        System.out.println("|--------------------------------------------------------------------------------------|");
        System.out.println("|  Total Pendapatan Warnet Hari Ini                                       Rp."+pendapatan+"   |");
        System.out.println("*--------------------------------------------------------------------------------------*");
        
    }
    
}
