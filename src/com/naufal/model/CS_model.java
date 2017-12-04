/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naufal.model;

/**
 *
 * @author user
 */
public class CS_model {

    private String kota;
    private double reguler;
    private double ons;
    private double hds;
    private double trc;
    private double sds;

    public CS_model() {
    }

    public CS_model(String kota, double reguler, double ons, double hds, double trc, double sds) {
        this.kota = kota;
        this.reguler = reguler;
        this.ons = ons;
        this.hds = hds;
        this.trc = trc;
        this.sds = sds;
    }

    
    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    /**
     * @return the trc
     */
    public double getTrc() {
        return trc;
    }

    /**
     * @param trc the trc to set
     */
    public void setTrc(double trc) {
        this.trc = trc;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    @Override
    public String toString() {
//        System.out.println("Kota "+this.getKota());
        return this.getKota();
    }
    
    
}
