/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naufal.dao;

import com.naufal.model.CS_model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CS_dao {

    List<CS_model> csdao = new ArrayList<>();

    public List<CS_model> getPaket() {
        try {
            Scanner scan = new Scanner(new File("C:/Users/user/Documents/NetBeansProjects/CourierServices/src/com/naufal/text/daftar_tarif.txt"));
            while (scan.hasNextLine()) {
                String[] data = scan.nextLine().split(",");
                String kota = data[0];
                double reguler = Double.parseDouble(data[1]);
                double ons = Double.parseDouble(data[2]);
                double hds = Double.parseDouble(data[3]);
                double trc = Double.parseDouble(data[4]);
                double sds = Double.parseDouble(data[5]);
                CS_model cs = new CS_model(kota, reguler, ons, hds, trc, sds);
                csdao.add(cs);
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        return csdao;
    }

    public double getHitungPaket(String Tujuan, String paket, int Kg, boolean asuransi, double hargaBarang) {
        double hasilHitung = 0.0;
        double nilaiAsuransi = 0.03;
        for (CS_model cS_model : csdao) {
            if (cS_model.getKota().equalsIgnoreCase(Tujuan)) {
                if (asuransi) {
                    System.out.println("Asuransi");
                    switch (paket) {
                        case "Reguler":
                            hasilHitung = cS_model.getReguler() * Kg;
                            nilaiAsuransi = hargaBarang * nilaiAsuransi;
                            hasilHitung += nilaiAsuransi;
                            System.out.println("Reguler");
                            break;
                        case "Ons":
                            hasilHitung = cS_model.getOns() * Kg;
                            nilaiAsuransi = hargaBarang * nilaiAsuransi;
                            hasilHitung += nilaiAsuransi;
                            break;
                        case "Hds":
                            hasilHitung = cS_model.getHds() * Kg;
                            nilaiAsuransi = hargaBarang * nilaiAsuransi;
                            hasilHitung += nilaiAsuransi;
                            break;
                        case "Trc":
                            hasilHitung = cS_model.getTrc() * Kg;
                            nilaiAsuransi = hargaBarang * nilaiAsuransi;
                            hasilHitung += nilaiAsuransi;
                            break;
                        case "Sds":
                            hasilHitung = cS_model.getSds() * Kg;
                            nilaiAsuransi = hargaBarang * nilaiAsuransi;
                            hasilHitung += nilaiAsuransi;
                            break;
                        default:
                            System.out.println("Data Paket tidak diketemukan...");
                    }
                } else {
                    System.out.println("Non Asuransi");
                    switch (paket) {
                        case "Reguler":
                            hasilHitung = cS_model.getReguler() * Kg;
                            break;
                        case "Ons":
                            hasilHitung = cS_model.getOns() * Kg;
                            break;
                        case "Hds":
                            hasilHitung = cS_model.getHds() * Kg;
                            break;
                        case "Trc":
                            hasilHitung = cS_model.getTrc() * Kg;
                            break;
                        case "Sds":
                            hasilHitung = cS_model.getSds() * Kg;
                            break;
                        default:
                            System.out.println("Data Paket tidak diketemukan...");
                    }
                }
            }
        }
        return hasilHitung;
    }

    public double getHarga(String paket, String kota) {
        double harga = 0.0;
        for (CS_model cS_model : csdao) {
            if (cS_model.getKota().equalsIgnoreCase(kota)) {
                switch (paket) {
                    case "Reguler":
                        harga = cS_model.getReguler();
                        break;
                    case "Ons":
                        harga = cS_model.getOns();
                        break;
                    case "Hds":
                        harga = cS_model.getHds();
                        break;
                    case "Trc":
                        harga = cS_model.getTrc();
                        break;
                    case "Sds":
                        harga = cS_model.getSds();
                        break;
                    default:
                        System.out.println("Data Paket tidak diketemukan...");
                }
            }
        }
        return harga;
    }
}
