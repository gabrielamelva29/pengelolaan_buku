/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaanbuku;

/**
 *
 * @author Dony Tri P
 */
public class Employee extends User{
    private  String nama;
    private  String alamat;
    private String jabatan;

    public Employee(String nama, String alamat, String jabatan, String username, String password) {
        super(username, password);
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    @Override
    public boolean login(String username, String password) {
        if (username.equals("dony") && password.equals("admin")){
        return true;
    }
        else
            return false;
    }
}
