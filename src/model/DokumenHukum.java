package model;

public abstract class DokumenHukum {
    protected String nomorPerkara;

    public DokumenHukum() {
    }

    public DokumenHukum(String nomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }

    public String getNomorPerkara() {
        return nomorPerkara;
    }

    public void setNomorPerkara(String nomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }

    public abstract String getKategoriHukuman();
}