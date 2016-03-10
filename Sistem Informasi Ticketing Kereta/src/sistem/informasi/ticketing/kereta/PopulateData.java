/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ticketing.kereta;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anggi
 */
public class PopulateData {
    public static ArrayList<Kereta> populateKereta() {
        ArrayList<Kereta> ks = new ArrayList<Kereta>();
        
        Kereta kereta1 = new Kereta("Mutiara Selatan", new Date());
        kereta1.addRute(new Stasiun("Gubeng", "Surabaya"),new Stasiun("Kiara Condong", "Bandung"));
        kereta1.addRute(new Stasiun("Kiara Condong", "Bandung"),new Stasiun("Gubeng", "Surabaya"));
        Kereta kereta2 = new Kereta("Malabar", new Date());
        kereta2.addRute(new Stasiun("Lempuyangan", "Yogyakarta"),new Stasiun("Kiara Condong", "Bandung"));
        
        Ekonomi ge11 = new Ekonomi("EK-01");
        ge11.setHarga(20000);
        kereta1.addGerbong(ge11);
        Ekonomi ge12 = new Ekonomi("EK-02");
        ge12.setHarga(20000);
        kereta1.addGerbong(ge12);
        ks.add(kereta1);
        
        Ekonomi ge21 = new Ekonomi("EK-01");
        ge21.setHarga(20000);
        kereta1.addGerbong(ge11);
        Ekonomi ge22 = new Ekonomi("EK-02");
        ge22.setHarga(20000);
        kereta1.addGerbong(ge22);
        ks.add(kereta2);
    
        
        return ks;
    }
    
    public static ArrayList<Tiket> populateTiket(ArrayList<Kereta> keretas) {
        ArrayList<Tiket> tikets = new ArrayList<Tiket>();
        
        Kereta k1 = keretas.get(0);
        Gerbong g1 = k1.getGerbongs().get(0);
        
        Penumpang p1 = new Penumpang();
        p1.setNoKTP("12345678");
        p1.setNama("Anggi Agustian");
        p1.setAlamat("Sukabumi");
        
        Tiket t1 = new Tiket(p1, new Date());
        t1.setGerbong(g1);
        t1.setKereta(k1);
        t1.setNoKursi(g1.addPenumpang(p1));
        
        tikets.add(t1);
        
        //penumpang 2
        Kereta k2 = keretas.get(0);
        Gerbong g2 = k2.getGerbongs().get(1);
        
        Penumpang p2 = new Penumpang();
        p2.setNoKTP("98765432");
        p2.setNama("Reynaldi Ananda Fakuy");
        p2.setAlamat("Medan");
        
        Tiket t2 = new Tiket(p2, new Date());
        t2.setGerbong(g2);
        t2.setKereta(k2);
        t2.setNoKursi(g2.addPenumpang(p2));
        
        tikets.add(t2);
        
        //penumpang 3
        Kereta k3 = keretas.get(2);
        Gerbong g3 = k3.getGerbongs().get(1);
        
        Penumpang p3 = new Penumpang();
        p2.setNoKTP("666666666");
        p2.setNama("Riartha Fakuy");
        p2.setAlamat("Jakarta");
        
        Tiket t3 = new Tiket(p3, new Date());
        t3.setGerbong(g3);
        t3.setKereta(k3);
        t3.setNoKursi(g3.addPenumpang(p3));
        
        tikets.add(t3);
        
        return tikets;
    }
    
    public static ArrayList<Pegawai> populatePegawai() {
        ArrayList<Pegawai> pegawais = new ArrayList<Pegawai>();
        
        Pegawai p = new Pegawai("PGW-001211", "pegawai1", "pegawai1");
        p.setNama("Kelompok 1");
        p.setAlamat("Sukabirus");
        pegawais.add(p);
        
        return pegawais;
    }
    
    
}
