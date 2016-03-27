/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ticketing.kereta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Anggi & Reynaldi
 */
public class Kereta {

    private String nama;
    private Date jadwal;
    private Rute rute;
    private List<Gerbong> gerbongs;

    public Kereta(String nama, Date jadwal) {
        this.nama = nama;
         this.jadwal = jadwal = new Date();
//        rute = new ArrayList<Stasiun>();
        gerbongs = new ArrayList<Gerbong>();
    }

    public String getNama() {
        return nama;
    }

    public Date getJadwal() {
        return jadwal;
    }

    public void addRute(Stasiun asal, Stasiun tujuan) {
        rute = new Rute(asal, tujuan);
    }

    public Rute getRute() {
        return rute;
    }

    public void addGerbong(Gerbong g) {
        gerbongs.add(g);
    }

    public List<Gerbong> getGerbongs() {
        return gerbongs;
    }

    public String getDetail() {
        String s = toString() + "\n";

        System.out.println("Jumlah gerbong : " + gerbongs.size());
        for (Gerbong gerbong : gerbongs) {
            s += gerbong.toString() + "\n";
        }

        return s;
    }

    @Override
    public String toString() {
        String s = "Nama kereta : " + nama + "\n";
        try {

            s += "Jadwal kereta : " + jadwal + "\n";
            if (rute.getAsal() != null && rute.getTujuan() != null) {
                s += "Rute : " + ((Stasiun) rute.getAsal()).getNama() + " - " + ((Stasiun) rute.getTujuan()).getNama() + "\n";
            }
        } catch (NullPointerException e) {
            System.out.println("Lengkapi dulu Stasiun baru dan Gerbong Barunya gan");
        }

        return s;
    }
}
