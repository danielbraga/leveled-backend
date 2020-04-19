package br.com.leveled.application.service;

import br.com.leveled.application.entities.Escola;

import java.util.List;

public interface EscolaService {
    void add(Escola entity);

    Escola getEscola(Long id);
    Escola getEscola(String id);

    List<Escola> getRefresh();

    List<Escola> getAll();
}
