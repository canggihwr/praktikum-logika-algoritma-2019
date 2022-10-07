package ArrayNilaiSiswaCanggih;

import javax.swing.JOptionPane;

public class ArrayNilaiSiswaCanggih {

    public static void main(String[] args) {

        String nama, kelas, jk, ket = null, kapasitas, p, x = null;
        int n;
        double total = 0, rata;

        nama = JOptionPane.showInputDialog(null, "Nama Siswa:");
        kelas = JOptionPane.showInputDialog(null, "Kelas:");
        jk = JOptionPane.showInputDialog(null, "Jenis Kelamin(P/W):");

        if ("P".equalsIgnoreCase(jk)) {
            jk = "Pria";
        } else if ("W".equalsIgnoreCase(jk)) {
            jk = "Wanita";
        } else {
            jk = "Tidak diketahui";
        }

        kapasitas = JOptionPane.showInputDialog(null, "Banyak Tryout:");
        n = Integer.valueOf(kapasitas);
        Double[] nilai = new Double[n];

        for (int i = 0; i < n; i++) {
            nilai[i] = Double.valueOf(JOptionPane.showInputDialog(null, "Nilai ke-" + (i + 1)));
            total = total + nilai[i];
        }

        rata = total / n;

        if (rata >= 90) {
            ket = "Sangat Memuaskan";
        } else if (rata < 90) {
            ket = "Memuaskan";
        } else if (rata < 75) {
            ket = "Cukup Memuaskan";
        } else if (rata < 55) {
            ket = "Tidak Lulus";
        }

        p = "";
        for (int i = 0; i < n; i++) {
            p = p + "Nilai Ke-" + (i + 1) + " : " + nilai[i] + "\n";
        }
        //JOptionPane.showMessageDialog(null, p);


        JOptionPane.showMessageDialog(null, 
                "=========== Data Siswa ===========\n"
                + "Nama : " + nama + "\n"
                + "Jenis Kelamin : " + jk + "\n"
                + "Kelas : " + kelas + "\n"
                + "========== Rekap Tryout ==========\n"
                + p
                + "----------------------------------\n"
                + "Total Nilai : " + total + "\n"
                + "Rata-Rata : " + rata + "\n"
                + "Keterangan : " + ket + "\n"
                + "================================"
        );

    }

}
