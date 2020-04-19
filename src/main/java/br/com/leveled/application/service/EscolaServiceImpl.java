package br.com.leveled.application.service;

import br.com.leveled.application.entities.Escola;
import br.com.leveled.application.repository.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaServiceImpl implements EscolaService {

    private EscolaRepository repository;

    public EscolaServiceImpl(EscolaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Escola entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public Escola getEscola(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Escola getEscola(String id) {
        return null;
    }

    @Override
    public List<Escola> getRefresh() {
        return null;
    }

    @Override
    public List<Escola> getAll() {
        return repository.findAll();
    }
}
