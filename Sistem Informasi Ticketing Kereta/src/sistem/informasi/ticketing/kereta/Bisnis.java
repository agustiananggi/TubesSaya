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
public class Bisnis extends Gerbong {
    public Bisnis(String kodeGerbong) {
        super(84, kodeGerbong);
    }

    @Override
    public String getFasilitas() {
        return "Bisnis fasilitas AC kursi sofa empuk";
    }
}
