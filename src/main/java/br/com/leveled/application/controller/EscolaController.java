package br.com.leveled.application.controller;

import br.com.leveled.application.entities.Escola;
import br.com.leveled.application.service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/escola")
public class EscolaController {

    private EscolaService service;

    public EscolaController(EscolaService service) {
        this.service = service;
    }

    @PostMapping
    public Escola add(@RequestBody Escola entity) throws Exception {
        if (entity != null) {
            service.add(entity);
        }
        return entity;
    }


    @GetMapping(value ="/{id}",produces = "application/json; charset=UTF-8")
    public Escola get(@PathVariable String id) throws Exception {
        Escola entity = service.getEscola(id);
        return entity;
    }

    @GetMapping(value ="/list",produces = "application/json; charset=UTF-8")
    public List<Escola> list() throws Exception {
        return service.getAll();
    }

}
