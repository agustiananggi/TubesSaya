/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bisnis;
import Model.Ekonomi;
import Model.Eksekutif;
import Model.Pegawai;
import Model.Penumpang;
import Model.Stasiun;
import Model.Tiket;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anggi
 */
public class PopulateData {
    public static ArrayList<Kereta> populateKereta() {
        ArrayList<Kereta> ks = new ArrayList<>();
        
        Kereta kereta1 = new Kereta("Mutiara Selatan", new Date());
        kereta1.addRute(new Stasiun("Kiara Condong", "Bandung"),new Stasiun("Gubeng", "Surabaya"));
        
        Kereta kereta2 = new Kereta("Malabar", new Date());
        kereta2.addRute(new Stasiun("Lempuyangan", "Yogyakarta"),new Stasiun("Kiara Condong", "Bandung"));
        
        Ekonomi ge11 = new Ekonomi("EK-01");
        ge11.setHarga(20000);
        kereta1.addGerbong(ge11);
        
        Ekonomi ge21 = new Ekonomi("EK-01");
        ge21.setHarga(20000);
        kereta2.addGerbong(ge11);
        
        Bisnis gb11 = new Bisnis("BE-01");
        gb11.setHarga(40000);
        kereta1.addGerbong(gb11);
        
        Bisnis gb21 = new Bisnis("BE-01");
        gb21.setHarga(40000);
        kereta2.addGerbong(gb21);
        
        Eksekutif eks11 = new Eksekutif("Eks-01");
        eks11.setHarga(60000);
        kereta1.addGerbong(eks11);
        
        Eksekutif eks21 = new Eksekutif("Eks-01");
        eks21.setHarga(60000);
        kereta2.addGerbong(eks21);
        
        ks.add(kereta1);
        ks.add(kereta2);
        
        return ks;
    }
    
    public static ArrayList<Tiket> populateTiket(ArrayList<Kereta> keretas) {
        ArrayList<Tiket> tikets = new ArrayList<>();
        Kereta k = keretas.get(0);
        Gerbong g = k.getGerbongs().get(0);
        
        Penumpang p = new Penumpang();
        p.setNoKTP("1301144149");
        p.setNama("Anggi Agustian");
        p.setAlamat("Sukabumi");
        
        Tiket t = new Tiket(p, new Date());
        t.setGerbong(g);
        t.setKereta(k);
        t.setNoKursi(g.addPenumpang(p));
        
        tikets.add(t);
        
        return tikets;
//        return null;
    }
    
    public static ArrayList<Pegawai> populatePegawai() {
        ArrayList<Pegawai> pegawais = new ArrayList<>();
        
        Pegawai p = new Pegawai("PGW-001211", "agustian.anggi", "sandiaman", "085659540490", "Anggi");
        p.setNama("Kelompok 1");
        p.setAlamat("Sukabirus");
        pegawais.add(p);
        
        return pegawais;
    }
    
    
}
