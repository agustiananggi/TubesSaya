/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ticketing.kereta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Reynaldi
 */
public class SistemInformasiTicketingKereta {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
      
        int mn = -1;
        List<Kereta> keretas = PopulateData.populateKereta();
        List<Pegawai> pegawais = new ArrayList<Pegawai>();
        List<Tiket> tikets = new ArrayList<Tiket>();
        Kereta currentKereta = null;
        Pegawai currentPegawai = null;

        pegawais.add(new Pegawai("11111", "PBO", "sandiaman"));

        while (mn != 0) {

            if (currentPegawai == null) {
                //Untuk awal sudah tersedia pegawai dengan username dan password "PBO dan sandiaman"
                System.out.println("============ Login Pegawai =============");
                currentPegawai = loginPegawai(pegawais, inputStringWithText("Masukkan Username"), inputStringWithText("Masukkan Password"));
            } else {

                System.out.println("============= KAI Ticketting ============");
                System.out.println("1. Tambah Kereta Baru");
                System.out.println("2. Pilih dari List Kereta");
                System.out.println("3. Tambah Pegawai Baru");
                System.out.println("4. List Pegawai");
                System.out.println("5. Beli Tiket");
                System.out.println("6. Print Tiket");
                System.out.println("99. Logout");

                if (currentKereta != null) {
                    System.out.println("============= Menu Kereta ===========");
                    System.out.println("20. Detail Kereta");
                    System.out.println("21. Tambah Stasiun Baru");
                    System.out.println("22. Tambah Gerbong Baru");
                }
                
                mn = Integer.parseInt(inputStringWithText("Pilih menu"));

                switch (mn) {
                    case 1:
                        Kereta k = new Kereta(inputStringWithText("Nama kereta"), null /*inputStringWithText("Jadwal kereta")*/);
                        currentKereta = k;
                        keretas.add(k);
                        break;

                    case 2:
                        showContent(keretas);
                        int p = Integer.parseInt(inputStringWithText("Pilih Kereta [0 Apabila cancel]"));
                        currentKereta = p == 0 ? currentKereta : keretas.get(p - 1);
                        break;

                    case 3:
                        Pegawai pegawai = new Pegawai(inputStringWithText("NIP"), inputStringWithText("Username"), inputStringWithText("Password"));
                        pegawai.setNama(inputStringWithText("Nama"));
                        pegawai.setAlamat(inputStringWithText("Alamat"));
                        pegawai.setNoTelp(inputStringWithText("No Telp"));
                        break;

                    case 4:
                        showContent(pegawais);
                        break;

                    case 5:
                        Tiket tiket = inputTiket(keretas);
                        tikets.add(tiket);
                        System.out.println(tiket);
                        break;

                    case 6:
                        printTiket(tikets, inputStringWithText("Masukkan kode tiket"));
                        break;

                    case 99:
                        currentPegawai = null;
                        break;
                }

                if (mn >= 20 && mn <= 22) {
                    if (currentKereta != null) {

                        switch (mn) {
                            case 20:
                                System.out.println(currentKereta.getDetail());
                                break;

                            case 21:
                                currentKereta.addRute(
                                        new Stasiun(inputStringWithText("Nama stasiun asal"), inputStringWithText("Daerah stasiun asal")),
                                        new Stasiun(inputStringWithText("Nama stasiun tujuan"), inputStringWithText("Daerah stasiun tujuan")));
                                break;

                            case 22:
                                currentKereta.addGerbong(inputGerbong());
                                break;
                        }

                    } else {
                        System.out.println("Maaf anda belum memilih kereta");
                    }
                }

            }
        }
    }


    private static String inputStringWithText(String text) {
        System.out.print(text + " : ");
        return sc.nextLine();
    }

    private static void showContent(List list) {
        int i = 0;
        for (Object aList : list) {
            System.out.println(++i + ". " + aList + "\n");
        }
    }

    private static Gerbong inputGerbong() {
        System.out.println("============== Tambah Gerbong Baru ================");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. Eksekutif");
        int kelas = Integer.parseInt(inputStringWithText("Pilih jenis gerbong"));
        Gerbong gerbong = null;

        String kode = inputStringWithText("Masukkan kode gerbong");

        switch (kelas) {
            case 1:
                gerbong = new Ekonomi(kode);
                break;

            case 2:
                gerbong = new Bisnis(kode);
                break;

            case 3:
                gerbong = new Eksekutif(kode);
                break;
        }

        gerbong.setHarga(Integer.parseInt(inputStringWithText("Harga per kursi")));

        return gerbong;
    }

    private static Tiket inputTiket(List<Kereta> keretas) {
        System.out.println("============= Pemesanan Tiket ============");
        showContent(keretas);
        Kereta kereta = keretas.get(Integer.parseInt(inputStringWithText("Pilih kereta")) - 1);
        showContent(kereta.getGerbongs());
        Gerbong gerbong = kereta.getGerbongs().get(Integer.parseInt(inputStringWithText("Pilih gerbong")) - 1);

        Penumpang p = new Penumpang();
        p.setNoKTP(inputStringWithText("No KTP penumpang"));
        p.setNama(inputStringWithText("Nama penumpang"));
        p.setAlamat("Alamat penumpang");

        Tiket tiket = new Tiket(p, new Date());
        tiket.setNoKursi(gerbong.addPenumpang(p));
        tiket.setKereta(kereta);
        tiket.setGerbong(gerbong);

        return tiket;
    }

    private static void printTiket(List<Tiket> tikets, String kodeTiket) {
        Tiket found = null;
        for(Tiket tiket : tikets) {
            if (tiket.getNoKursi().equalsIgnoreCase(kodeTiket)) {
                found = tiket;
                break;
            }
        }

        System.out.println(found == null ? "Tiket tidak ditemukan" : found);
    }

    private static Pegawai loginPegawai(List<Pegawai> pegawais, String username, String password) {
        for (Pegawai pegawai : pegawais) {
            if (pegawai.getUsername().equalsIgnoreCase(username) && pegawai.getPassword().equalsIgnoreCase(password))
                return pegawai;
        }
        return null;  
    }
    
}
