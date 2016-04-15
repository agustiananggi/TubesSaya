/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Kereta;
import Model.Pegawai;
import Controller.PopulateData;
import Model.Tiket;
import java.util.ArrayList;

/**
 *
 * @author Anggi
 */
public class DataHolder {
    
    static ArrayList<Kereta> keretas = PopulateData.populateKereta();
    static ArrayList<Tiket> tikets = PopulateData.populateTiket(keretas);
    static ArrayList<Pegawai> pegawais = PopulateData.populatePegawai();
    
}
