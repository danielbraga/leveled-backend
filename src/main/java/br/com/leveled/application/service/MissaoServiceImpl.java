package br.com.leveled.application.service;

import br.com.leveled.application.entities.Missao;
import br.com.leveled.application.repository.MissaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoServiceImpl implements MissaoService {

    private MissaoRepository repository;

    public MissaoServiceImpl(MissaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Missao entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public Missao getMissao(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Missao getMissao(String id) {
        return null;
    }

    @Override
    public List<Missao> getRefresh() {
        return null;
    }

    @Override
    public List<Missao> getAll() {
        return repository.findAll();
    }
}
