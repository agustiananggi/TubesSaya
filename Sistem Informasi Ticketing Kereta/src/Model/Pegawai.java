/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Reynaldi
 */
public class Pegawai {
    private String username, password, nip, nama, alamat, noTelp;

    public Pegawai(String nip, String username, String password, String noTelp, String nama) {
        this.username = username;
        this.password = password;
        this.nip = nip;
        this.nama=nama;
        this.noTelp=noTelp;
    }

    public Pegawai() {
        
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;   
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

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    @Override
    public String toString() {
        String s;
        s = "NIP : " +getNip()+ "\n";
        s += "Nama : " + getNama() + "\n";
        s += "Nomor Telepon : " + getNoTelp() + "\n";

        return s;
    }
}
