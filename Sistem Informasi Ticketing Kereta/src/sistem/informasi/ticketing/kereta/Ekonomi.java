/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ticketing.kereta;

/**
 *
 * @author Riartha
 */
public class Ekonomi extends Gerbong {
     public Ekonomi(String kodeGerbong) {
        super(105, kodeGerbong);
    }

    @Override
    public String getFasilitas() {
        return "Ekonomi AC : Kapasitas 105 Penumpang";
    }
}
