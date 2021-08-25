/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaanbuku;

import java.util.ArrayList;

/**
 *
 * @author Joh
 */
public class RakBuku {
    private ArrayList<Buku> listBuku = new ArrayList<Buku>();

    public ArrayList<Buku> getListBuku() {
        return listBuku;
    }

    public void setListBuku(ArrayList<Buku> listBuku) {
        this.listBuku = listBuku;
    }
    
    public void tambahBuku(Buku buku){
        listBuku.add(buku);
    }
     public void editBuku(int urutan, Buku buku){
        listBuku.set(urutan,buku);
    }
    public void hapusBuku(Buku buku){
        listBuku.remove(buku);
    }
     public void tampilkanBuku(){
        if(listBuku.size() == 0){
            System.out.println("Belum ada buku yang terdaftar");
        }
        else{
            System.out.println("\nDaftar Buku");
            
            for(Buku buku: listBuku){
                System.out.println("--------------------------------------------");
                System.out.println("Judul Buku             : " +  buku.getJudul());
                System.out.println("Jumlah Halaman Buku    : " + buku.getJumlahHalaman());
                System.out.println("Penerbit Buku          : " + buku.getPenerbit());
                System.out.println("--------------------------------------------");
            }
        
        }
        
    }
    
}
