package controller;

import util.DataSeeder;
import util.InputHandler;
import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;

import java.util.ArrayList;

public class KnowledgeController {
    private KnowledgeRepository repository;

    public KnowledgeController(KnowledgeRepository repository) {
        this.repository = repository;
        DataSeeder.isiDataAwal(repository);
    }

    public ArrayList<Putusan> tampilkanSemua() {
        return repository.getDaftarSemua();
    }

    public Putusan cariByNomor(String nomor) {
        return repository.cariByNomor(nomor);
    }

    public ArrayList<Putusan> cariByNama(String nama) {
        return repository.cariByNama(nama);
    }

    public boolean hapusPutusan(String nomor) {
        return repository.hapus(nomor);
    }

    public StatistikPutusan getStatistik() {
        return new StatistikPutusan(repository.getDaftarSemua());
    }

    public boolean tambahPutusan(String[] data) {
        try {
            for (String item : data) {
                if (!InputHandler.validasiString(item)) {
                    return false;
                }
            }

            String nomorPerkara = data[0];
            String pengadilan = data[1];
            String tanggalPutusan = data[2];
            String namaTerdakwa = data[3];
            int umurTerdakwa = InputHandler.parseInt(data[4]);
            String jenisNarkotika = data[5];
            double beratBarangBukti = InputHandler.parseDouble(data[6]);
            String pasalDilanggar = data[7];
            String peranTerdakwa = data[8];
            int vonisHukuman = InputHandler.parseInt(data[9]);
            double vonisDenda = InputHandler.parseDouble(data[10]);
            String namaHakim = data[11];

            if (umurTerdakwa <= 0 || beratBarangBukti <= 0 || vonisHukuman <= 0 || vonisDenda < 0) {
                return false;
            }

            if (repository.cariByNomor(nomorPerkara) != null) {
                return false;
            }

            Putusan p = new Putusan(
                    nomorPerkara, pengadilan, tanggalPutusan, namaTerdakwa,
                    umurTerdakwa, jenisNarkotika, beratBarangBukti,
                    pasalDilanggar, peranTerdakwa, vonisHukuman,
                    vonisDenda, namaHakim
            );

            repository.simpan(p);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}