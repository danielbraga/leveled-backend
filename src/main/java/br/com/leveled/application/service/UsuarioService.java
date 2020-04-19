package br.com.leveled.application.service;

import br.com.leveled.application.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    void add(Usuario entity);

    Usuario getUsuario(Long id);
    Usuario getUsuario(String id);

    List<Usuario> getRefresh();

    List<Usuario> getAll();
}
