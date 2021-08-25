/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaanbuku;

/**
 *
 * @author Joh
 */
public class Buku {
    private int id;
    private String judul;
    private int jumlahHalaman;
    private String penerbit;

    public Buku(int id, String judul, int jumlahHalaman, String penerbit) {
        this.id = id;
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
    }

    public Buku() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
