/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ticketing.kereta;

/**
 *
 * @author Anggi
 */
public class Stasiun {
    private String nama, daerah;

    public Stasiun(String nama, String daerah) {
        this.nama = nama;
        this.daerah = daerah;
    }

    public String getNama() {
        return nama;
    }

    public String getDaerah() {
        return daerah;
    }
}
