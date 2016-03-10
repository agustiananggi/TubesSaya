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
public class Rute {
    private Stasiun asal;
    private Stasiun tujuan;
    
    public Rute(Stasiun asal, Stasiun tujuan){
        this.asal=asal;
        this.tujuan=tujuan;
    }
    
    public Stasiun getAsal(){
        return asal;
    }
    
    public Stasiun getTujuan(){
        return tujuan;
    }
}
