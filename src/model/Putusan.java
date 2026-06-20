package model;

public class Putusan extends DokumenHukum implements Laporan {

    @Override
    public void tampilkan() {
    }

    @Override
    public String getKategoriHukuman() {
        return "";
    }

    private String pengadilan;
    private String tanggalPutusan;
    private String namaTerdakwa;
    private int umurTerdakwa;
    private String jenisNarkotika;
    private double beratBarangBukti;
    private String pasalDilanggar;
    private String peranTerdakwa;
    private int vonisHukuman;
    private double vonisDenda;
    private String namaHakim;

    private static int jumlahDibuat = 0;

    
}

