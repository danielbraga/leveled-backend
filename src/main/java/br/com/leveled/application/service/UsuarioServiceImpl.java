package br.com.leveled.application.service;

import br.com.leveled.application.entities.Usuario;
import br.com.leveled.application.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Usuario entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public Usuario getUsuario(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Usuario getUsuario(String id) {
        return null;
    }

    @Override
    public List<Usuario> getRefresh() {
        return null;
    }

    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }
}
