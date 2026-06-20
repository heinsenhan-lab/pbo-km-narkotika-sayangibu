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

    public Putusan() {
        jumlahDibuat++;
    }

    public Putusan(String nomorPerkara, String pengadilan, String tanggalPutusan,
                   String namaTerdakwa, int umurTerdakwa, String jenisNarkotika,
                   double beratBarangBukti, String pasalDilanggar, String peranTerdakwa,
                   int vonisHukuman, double vonisDenda, String namaHakim) {
        super(nomorPerkara);
        this.pengadilan = pengadilan;
        this.tanggalPutusan = tanggalPutusan;
        this.namaTerdakwa = namaTerdakwa;
        this.umurTerdakwa = umurTerdakwa;
        this.jenisNarkotika = jenisNarkotika;
        this.beratBarangBukti = beratBarangBukti;
        this.pasalDilanggar = pasalDilanggar;
        this.peranTerdakwa = peranTerdakwa;
        this.vonisHukuman = vonisHukuman;
        this.vonisDenda = vonisDenda;
        this.namaHakim = namaHakim;
        jumlahDibuat++;
    }

    public static int getJumlahDibuat() {
        return jumlahDibuat;
    }

    public String getPengadilan() { return pengadilan; }
    public String getTanggalPutusan() { return tanggalPutusan; }
    public String getNamaTerdakwa() { return namaTerdakwa; }
    public int getUmurTerdakwa() { return umurTerdakwa; }
    public String getJenisNarkotika() { return jenisNarkotika; }
    public double getBeratBarangBukti() { return beratBarangBukti; }
    public String getPasalDilanggar() { return pasalDilanggar; }
    public String getPeranTerdakwa() { return peranTerdakwa; }
    public int getVonisHukuman() { return vonisHukuman; }
    public double getVonisDenda() { return vonisDenda; }
    public String getNamaHakim() { return namaHakim; }

    public void setPengadilan(String pengadilan) { this.pengadilan = pengadilan; }
    public void setTanggalPutusan(String tanggalPutusan) { this.tanggalPutusan = tanggalPutusan; }
    public void setNamaTerdakwa(String namaTerdakwa) { this.namaTerdakwa = namaTerdakwa; }
    public void setUmurTerdakwa(int umurTerdakwa) { this.umurTerdakwa = umurTerdakwa; }
    public void setJenisNarkotika(String jenisNarkotika) { this.jenisNarkotika = jenisNarkotika; }
    public void setBeratBarangBukti(double beratBarangBukti) { this.beratBarangBukti = beratBarangBukti; }
    public void setPasalDilanggar(String pasalDilanggar) { this.pasalDilanggar = pasalDilanggar; }
    public void setPeranTerdakwa(String peranTerdakwa) { this.peranTerdakwa = peranTerdakwa; }
    public void setVonisHukuman(int vonisHukuman) { this.vonisHukuman = vonisHukuman; }
    public void setVonisDenda(double vonisDenda) { this.vonisDenda = vonisDenda; }
    public void setNamaHakim(String namaHakim) { this.namaHakim = namaHakim; }
}

