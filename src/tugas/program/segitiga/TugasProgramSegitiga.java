package tugas.program.segitiga;

import javax.swing.JOptionPane;
public class TugasProgramSegitiga {

    
    public static void main(String[] args) {
    
         int i, a;
          int Nilai;
        
        Nilai =Integer.valueOf(JOptionPane.showInputDialog("Jumlah jenis Segitiga:"));
        System.out.print("Hasil jenis Segitiga yang ditampilkan");
        
        for(i=0;i<=Nilai;i++) {
            for(a=0; a<i; a++) {
                System.out.print("^");