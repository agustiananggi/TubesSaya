/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Penumpang;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Riartha
 */
public abstract class Gerbong {
    private String kodeGerbong;
    private int jumlahKursi;
    private int harga;
    protected List<Penumpang> penumpangs;

    protected static final String kode = "ABCDE";

    public Gerbong(int jumlahKursi, String kodeGerbong) {
        this.jumlahKursi = jumlahKursi;
        this.kodeGerbong = kodeGerbong;
        penumpangs = new ArrayList<Penumpang>();
    }

    public String getKodeGerbong() {
        return kodeGerbong;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public List<Penumpang> getPenumpangs() {
        return penumpangs;
    }

    public String addPenumpang(Penumpang p) {
        penumpangs.add(p);
        return String.valueOf(kodeGerbong + "-" + kode.charAt((getPenumpangs().size() - 1) % 5) + ((getPenumpangs().size() / 5) + 1));
    }

    public Penumpang getPenumpang(String nomorKursi) {
        return null;
    }

    public abstract String getFasilitas();

    @Override
    public String toString() {
        return "Kode : " + kodeGerbong + " - Jumlah kursi : " + jumlahKursi + " - Kursi terpesan : " + penumpangs.size();
    }
}
