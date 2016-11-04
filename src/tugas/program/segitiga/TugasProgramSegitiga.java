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
                  }
            System.out.print("\n");
        }
        System.out.println();
        
        for(i=0;i<Nilai;i++) {
            for(a=i;a<Nilai;a++) {
                System.out.print("^");
                 }
        System.out.println();
        }
        
        for(i=0; i<=Nilai; i++) {
            for(a=0; a<(Nilai-i); a++) {
                System.out.print(" ");
            }
            for(int c=0; c<i; c++) {
                System.out.print("^");
                  }
            System.out.println();
        }
        System.out.println();
        
        for(i=0; i<Nilai; i++) {
            for(int c=0; c<i; c++) {
                System.out.print(" ");
            }
            for(a=0; a<(Nilai-i); a++) {
                System.out.print("^");