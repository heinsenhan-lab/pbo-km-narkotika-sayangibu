package controller;

import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;

import java.util.ArrayList;

public class KnowledgeController {
    private KnowledgeRepository repository;

    public KnowledgeController(KnowledgeRepository repository) {
        this.repository = repository;
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
}