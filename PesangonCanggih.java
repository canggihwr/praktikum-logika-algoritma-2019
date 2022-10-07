package pesangon_c;
import javax.swing.JOptionPane;
/**
 *
 * @author ccxcm
 */
public class PesangonCanggih {
    public static void main(String[] args) {
        
        String nama,print;
        char gol;
        float th;
        int t,upah,total,gaji;
        
        nama = JOptionPane.showInputDialog(null, "Masukkan Nama Anda");
        gaji = Integer.parseInt(JOptionPane.showInputDialog(null, "Tuliskan Gaji Anda"));
        th = Float.parseFloat(JOptionPane.showInputDialog(null, "Berapa lama anda sudah bekerja - (tahun)"));
        
        t = 300000;
        upah = gaji+t;
   
   
        if(gaji>=2250000){
            gol = 'A';
        }else if(gaji>=1750000){
            gol = 'B';
        }else if(gaji>=1500000){
            gol = 'C';
        }else {
            gol = 'D';
        }
   
   
        if(th>8){
            total = upah*9;
        }else if(th>=7){
            total = upah*8;
        }else if(th>=6){
            total = upah*7;
        }else if(th>=5){
            total = upah*6;
        }else if(th>=4){
            total = upah*5;
        }else if(th>=3){
            total = upah*4;
        }else if(th>=2){
            total = upah*3;
        }else if(th>=1){
            total = upah*2;
        }else {
            total = upah*1;
        }
        
   print = "=========== Data Karyawan ==========="+"\nNama Karyawan: "+nama+"\nMasa Kerja: "+th+" tahun"+
           "\nGolongan: "+gol+"\n"+"\n=========== Upah Bulanan ==========="+"\nGaji Pokok: Rp. "+gaji+
           "\nTunjangan: Rp. "+t+"\nUpah per bulan: Rp. "+upah+"\n"+"\n============ Pesangon ============="+
           "\nTotal Pesangon: Rp. "+total+"\n==================================";
        
        JOptionPane.showMessageDialog(null, print);
    }
    
}
