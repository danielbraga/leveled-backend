package br.com.leveled.application.controller;

import br.com.leveled.application.entities.Usuario;
import br.com.leveled.application.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public Usuario add(@RequestBody Usuario entity) throws Exception {
        if (entity != null) {
            service.add(entity);
        }
        return entity;
    }


    @GetMapping(value ="/{id}",produces = "application/json; charset=UTF-8")
    public Usuario get(@PathVariable String id) throws Exception {
        Usuario entity = service.getUsuario(id);
        return entity;
    }

    @GetMapping(value ="/list",produces = "application/json; charset=UTF-8")
    public List<Usuario> list() throws Exception {
        return service.getAll();
    }

}
