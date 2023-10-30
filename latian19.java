/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2part2;

/**
 *
 * @author ThinkPad
 */
public class latian19 {
    public static void main(String[] args) {
      // Inisialisasi variabel
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lamaBulan = 6;
        
        // Hitung saldo akhir setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double saldoAkhir = saldoAwal + (saldoAwal * bunga);
            saldoAwal = saldoAkhir;
            System.out.printf("Saldo bulan ke-%d: Rp%,.2f\n", i, saldoAkhir);
}
        }
    }

