package model;

public class Putusan extends DokumenHukum implements Laporan {

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

    @Override
    public void tampilkan() {
        System.out.println(
                nomorPerkara + " | " +
                        namaTerdakwa + " | " +
                        jenisNarkotika + " | " +
                        vonisHukuman + " bulan"
        );
    }

    public void tampilkan(boolean detail) {
        if (detail) {
            System.out.println(this);
        } else {
            tampilkan();
        }
    }

    @Override
    public String getKategoriHukuman() {
        if (vonisHukuman <= 12) {
            return "Ringan";
        } else if (vonisHukuman <= 60) {
            return "Sedang";
        } else {
            return "Berat";
        }
    }

    @Override
    public String toString() {
        return "Nomor Perkara: " + nomorPerkara +
                "\nPengadilan: " + pengadilan +
                "\nTanggal Putusan: " + tanggalPutusan +
                "\nNama Terdakwa: " + namaTerdakwa +
                "\nUmur: " + umurTerdakwa +
                "\nJenis Narkotika: " + jenisNarkotika +
                "\nBerat Barang Bukti: " + beratBarangBukti +
                "\nPasal Dilanggar: " + pasalDilanggar +
                "\nPeran Terdakwa: " + peranTerdakwa +
                "\nVonis Hukuman: " + vonisHukuman +
                "\nVonis Denda: " + vonisDenda +
                "\nNama Hakim: " + namaHakim +
                "\nKategori: " + getKategoriHukuman();
    }
}