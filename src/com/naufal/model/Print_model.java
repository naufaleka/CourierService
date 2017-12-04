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
public class Print_model {
    private String namaPengirim;
    private String kotaAsal;
    private String namaPenerima;
    private String AlamatTujuan;
    private String noTlpPengirim;
    private String kotaTujuan;
    private String noTlpPenerima;
    private String provinsi;
    private String nomorPaket;
    private String tglKirim;
    private String jenisPengiriman;
    private String harga;
    private String berat;
    private String asuransi;
    private String hargaBarang;
    private String pembayaran;
    private String total;

    public Print_model() {
    }

    public Print_model(String namaPengirim, String kotaAsal, String namaPenerima, String AlamatTujuan, String noTlpPengirim, String kotaTujuan, String noTlpPenerima, String provinsi, String nomorPaket, String tglKirim, String jenisPengiriman, String harga, String berat, String asuransi, String hargaBarang, String pembayaran, String total) {
        this.namaPengirim = namaPengirim;
        this.kotaAsal = kotaAsal;
        this.namaPenerima = namaPenerima;
        this.AlamatTujuan = AlamatTujuan;
        this.noTlpPengirim = noTlpPengirim;
        this.kotaTujuan = kotaTujuan;
        this.noTlpPenerima = noTlpPenerima;
        this.provinsi = provinsi;
        this.nomorPaket = nomorPaket;
        this.tglKirim = tglKirim;
        this.jenisPengiriman = jenisPengiriman;
        this.harga = harga;
        this.berat = berat;
        this.asuransi = asuransi;
        this.hargaBarang = hargaBarang;
        this.pembayaran = pembayaran;
        this.total = total;
    }

    /**
     * @return the namaPengirim
     */
    public String getNamaPengirim() {
        return namaPengirim;
    }

    /**
     * @param namaPengirim the namaPengirim to set
     */
    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    /**
     * @return the kotaAsal
     */
    public String getKotaAsal() {
        return kotaAsal;
    }

    /**
     * @param kotaAsal the kotaAsal to set
     */
    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    /**
     * @return the namaPenerima
     */
    public String getNamaPenerima() {
        return namaPenerima;
    }

    /**
     * @param namaPenerima the namaPenerima to set
     */
    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    /**
     * @return the AlamatTujuan
     */
    public String getAlamatTujuan() {
        return AlamatTujuan;
    }

    /**
     * @param AlamatTujuan the AlamatTujuan to set
     */
    public void setAlamatTujuan(String AlamatTujuan) {
        this.AlamatTujuan = AlamatTujuan;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the nomorPaket
     */
    public String getNomorPaket() {
        return nomorPaket;
    }

    /**
     * @param nomorPaket the nomorPaket to set
     */
    public void setNomorPaket(String nomorPaket) {
        this.nomorPaket = nomorPaket;
    }

    /**
     * @return the tglKirim
     */
    public String getTglKirim() {
        return tglKirim;
    }

    /**
     * @param tglKirim the tglKirim to set
     */
    public void setTglKirim(String tglKirim) {
        this.tglKirim = tglKirim;
    }

    /**
     * @return the jenisPengiriman
     */
    public String getJenisPengiriman() {
        return jenisPengiriman;
    }

    /**
     * @param jenisPengiriman the jenisPengiriman to set
     */
    public void setJenisPengiriman(String jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }

    /**
     * @return the berat
     */
    public String getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(String berat) {
        this.berat = berat;
    }

    /**
     * @return the asuransi
     */
    public String getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(String asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargaBarang
     */
    public String getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the noTlpPengirim
     */
    public String getNoTlpPengirim() {
        return noTlpPengirim;
    }

    /**
     * @param noTlpPengirim the noTlpPengirim to set
     */
    public void setNoTlpPengirim(String noTlpPengirim) {
        this.noTlpPengirim = noTlpPengirim;
    }

    /**
     * @return the noTlpPenerima
     */
    public String getNoTlpPenerima() {
        return noTlpPenerima;
    }

    /**
     * @param noTlpPenerima the noTlpPenerima to set
     */
    public void setNoTlpPenerima(String noTlpPenerima) {
        this.noTlpPenerima = noTlpPenerima;
    }
    
}
