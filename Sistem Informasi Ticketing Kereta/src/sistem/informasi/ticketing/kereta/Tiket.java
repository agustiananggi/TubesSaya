/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ticketing.kereta;
import java.util.Date;
/**
 *
 * @author Reynaldi 
 */
public class Tiket {
    private Date tanggal;
    private Kereta kereta;
    private Gerbong gerbong;
    private String noKursi;
    private Penumpang penumpang;

    public Tiket(Penumpang penumpang, Date tanggal) {
        this.penumpang = penumpang;
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public Gerbong getGerbong() {
        return gerbong;
    }

    public void setGerbong(Gerbong gerbong) {
        this.gerbong = gerbong;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public void setNoKursi(String noKursi) {
        this.noKursi = noKursi;
    }

    public Kereta getKereta() {
        return kereta;
    }

    public void setKereta(Kereta kereta) {
        this.kereta = kereta;
    }

    @Override
    public String toString() {
        String s = "=================== Tiket Anda ===============\n";
        s += "No KTP : " + penumpang.getNoKTP() + "\n";
        s += "Nama : " + penumpang.getNama() + "\n\n";
        s += "Kereta : " + kereta.getNama() + "\n";
        s += "Tanggal berangkat : " + kereta.getJadwal() + "\n";
        s += "Gerbong : " + gerbong.getKodeGerbong() + "\n";
        s += "No Kursi : " + noKursi + "\n";
        s += "Harga : " + gerbong.getHarga() + "\n";
        s += "Tanggal Pembelian : " + tanggal +"\n";
        s += "==========================================";

        return s;
    }
}
