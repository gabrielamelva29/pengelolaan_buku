/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaanbuku;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class PengelolaanBuku {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        int pil = 0;
        Scanner scan = new Scanner(System. in);
        RakBuku listBuku = new RakBuku();
        while(true){
            System.out.println("Selamat Datang di Aplikasi Penyimpanan Buku");
            System.out.println("Menu");
            System.out.println("1.Lihat Semua Buku");
            System.out.println("2.Tambah Buku Semua Buku");
            System.out.println("3.Edit Buku Semua Buku");
            System.out.println("4.Hapus Buku Semua Buku");
            System.out.println("9.Exit");
            System.out.print("Pilihan : ");
            pil = scan.nextInt();
            System.out.println("===========================================");

            if(pil == 1){
                listBuku.tampilkanBuku();
                System.out.print("Tekan sesuatu untuk kembali ke menu...");
                System.in.read();
                System.out.println("===========================================");
            }
            if(pil == 2){
                Buku buku = new Buku();
                System.out.println("\nTambah Buku");
                System.out.print("Masukkan Judul Buku  : ");
                buku.setJudul(scan.next());
                System.out.print("Masukkan Jumlah Halaman Buku  : ");
                buku.setJumlahHalaman(scan.nextInt());
                System.out.print("Masukkan Penerbit Buku  : ");
                buku.setPenerbit(scan.next());
                listBuku.tambahBuku(buku);
                System.out.println("Buku berhasil ditambahkan");
                System.out.println("===========================================");
            }
            if(pil == 3){
                listBuku.tampilkanBuku();
                System.out.print("Edit buku ke : ");
                int urutanBuku = scan.nextInt();
                 if(urutanBuku > listBuku.getListBuku().size()){
                    System.out.println("Maaf nomor buku tidak sesuai");
                }
                else{
                     Buku buku = listBuku.getListBuku().get(urutanBuku-1);
                     System.out.print("Masukkan Judul Buku  : ");
                        buku.setJudul(scan.next());
                        System.out.print("Masukkan Jumlah Halaman Buku  : ");
                        buku.setJumlahHalaman(scan.nextInt());
                        System.out.print("Masukkan Penerbit Buku  : ");
                        buku.setPenerbit(scan.next());
                        listBuku.editBuku(urutanBuku-1,buku);
                    System.out.println("Buku berhasil diedit");
                }
                System.out.println("===========================================");
            }
            if(pil == 4){
                listBuku.tampilkanBuku();
                System.out.print("Hapus buku ke : ");
                int urutanBuku = scan.nextInt();
                if(urutanBuku > listBuku.getListBuku().size()){
                    System.out.println("Maaf nomor buku tidak sesuai");
                }
                else{
                    listBuku.hapusBuku(listBuku.getListBuku().get(urutanBuku-1));
                    System.out.println("Buku berhasil dihapus");
                }
                System.out.println("===========================================");
                
            }
            if(pil == 9){
                System.exit(0);
            }
            System.out.println("\n");
        }
        
    }
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  

        System.out.flush();  

    }
}
