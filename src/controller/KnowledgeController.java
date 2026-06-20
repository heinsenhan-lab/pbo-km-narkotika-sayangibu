package controller;

import model.KnowledgeRepository;

public class KnowledgeController {
    private KnowledgeRepository repository;

    public KnowledgeController(KnowledgeRepository repository) {
        this.repository = repository;
    }
}