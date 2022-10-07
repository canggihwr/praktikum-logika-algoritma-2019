package binarysearchtokobuahcanggihwr;

import java.util.Scanner;

public class BinarySearchTokoBuahCanggihWR {

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
        String loop;
        boolean ulang = true;
        Scanner c = new Scanner(System.in);

        while (ulang == true) {
            System.out.print("==============================================\n"
                    + "*  PROGRAM PENCARIAN :                       *\n"
                    + "*  A . Cari berdasarkan nama BUAH (baris)    *\n"
                    + "*  B . Cari berdasarkan nama CABANG (kolom)  *\n"
                    + "==============================================\n"
                    + "jawab [A/B] => ");
            String tanya = c.next();
            String tanya2 = "";
            System.out.println("---------------");
            if ("A".equalsIgnoreCase(tanya)) {
                tanya = "baris";
                tanya2 = "baris[Nama buah] : ";
            } else if ("B".equalsIgnoreCase(tanya)) {
                tanya = "kolom";
                tanya2 = "kolom[Nama cabang] : ";
            } else {
                System.out.println("INPUT SALAH");
                ulang = false;
                break;
            }
            System.out.print("Masukkan key pencarian : ");
            int key = c.nextInt();
            System.out.print(tanya2);
            String kunci = c.next().toUpperCase();
            int n = 0;

            switch (kunci) {
                case "APEL":
                    n = 0;
                    break;
                case "SALAK":
                    n = 1;
                    break;
                case "MANGGA":
                    n = 2;
                    break;
                case "JERUK":
                    n = 3;
                    break;
                case "MATARAM":
                    n = 0;
                    break;
                case "SELONG":
                    n = 1;
                    break;
                case "PRAYA":
                    n = 2;
                    break;
                case "AIKMEL":
                    n = 3;
                    break;
                case "KEDIRI":
                    n = 4;
                    break;
                default:
                    System.out.println("Data " + tanya + " tidak valid (Program Berhenti)");
                    ulang = false;
            }

            int low = 0, mid = 0, high = 0;
            boolean end = false;

            if ("baris".equalsIgnoreCase(tanya)) {
                high = data[n].length - 1;
                for (int i = 0; i < data.length; i++) {
                    for (int j = i + 1; j < data[0].length; j++) {
                        if (data[n][i] > data[n][j]) {
                            int temp = data[n][i];
                            data[n][i] = data[n][j];
                            data[n][j] = temp;
                        }
                    }
                }
                while (low <= high) {
                    mid = (int) Math.floor(low + ((high - low) / 2));
                    if (key == data[n][mid]) {
                        System.out.println(">>> Key ditemukan pada buah " + buah[n]);
                        end = true;
                        break;
                    } else if (key > data[n][mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                if (end == false) {
                    System.out.println(">>> Key tidak ditemukan pada buah " + buah[n]);
                }

            } else if ("kolom".equalsIgnoreCase(tanya)) {
                high = 3;
                for (int i = 0; i < data[0].length; i++) {
                    for (int j = i + 1; j < data.length; j++) {
                        if (data[i][n] > data[j][n]) {
                            int temp = data[i][n];
                            data[i][n] = data[j][n];
                            data[j][n] = temp;
                        }
                    }
                }
                while (low <= high) {
                    mid = (int) Math.floor(low + ((high - low) / 2));
                    if (key == data[mid][n]) {
                        System.out.println(">>> Key ditemukan pada cabang " + kota[n]);
                        end = true;
                        break;
                    } else if (key > data[mid][n]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                if (end == false) {
                    System.out.println(">>> Key tidak ditemukan pada cabang " + kota[n]);
                }
            }
            System.out.println("---------------");
            System.out.print("Ingin melakukan pencarian lagi?[y/t] => ");
            loop = c.next();
            if ("Y".equalsIgnoreCase(loop)) {
                ulang = true;
            } else {
                ulang = false;
            }
        }
    }
}
