package br.com.leveled.application.service;

import br.com.leveled.application.entities.Missao;

import java.util.List;

public interface MissaoService {
    void add(Missao entity);

    Missao getMissao(Long id);
    Missao getMissao(String id);

    List<Missao> getRefresh();

    List<Missao> getAll();
}
