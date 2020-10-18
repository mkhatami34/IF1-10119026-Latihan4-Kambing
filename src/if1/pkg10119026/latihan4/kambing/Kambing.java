/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan4.kambing;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah
 * kambing setelah ditambah
 */
public class Kambing {
    
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
