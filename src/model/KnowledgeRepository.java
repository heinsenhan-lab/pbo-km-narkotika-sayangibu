package model;

import java.util.ArrayList;

public class KnowledgeRepository {
    private ArrayList<Putusan> daftarPutusan = new ArrayList<>();

    public void simpan(Putusan p) {
        daftarPutusan.add(p);
    }

    public ArrayList<Putusan> getDaftarSemua() {
        return daftarPutusan;
    }

    public int getTotalData() {
        return daftarPutusan.size();
    }
}