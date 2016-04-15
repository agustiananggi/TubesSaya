/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Gerbong;

/**
 *
 * @author Riartha
 */
public class Eksekutif extends Gerbong {
     public Eksekutif(String kodeGerbong) {
        super(84, kodeGerbong);
    }

    @Override
    public String getFasilitas() {
        return "Fasilitas gerdong AC kursi dengan sandaran punggung dan kaki";
    }
}
