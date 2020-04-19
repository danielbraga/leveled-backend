package br.com.leveled.application.controller;

import br.com.leveled.application.entities.Missao;
import br.com.leveled.application.service.MissaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/missao")
public class MissaoController {

    private MissaoService service;

    public MissaoController(MissaoService service) {
        this.service = service;
    }

    @PostMapping
    public Missao add(@RequestBody Missao entity) throws Exception {
        if (entity != null) {
            service.add(entity);
        }
        return entity;
    }


    @GetMapping(value ="/{id}",produces = "application/json; charset=UTF-8")
    public Missao get(@PathVariable String id) throws Exception {
        Missao entity = service.getMissao(id);
        return entity;
    }

    @GetMapping(value ="/list",produces = "application/json; charset=UTF-8")
    public List<Missao> list() throws Exception {
        return service.getAll();
    }

}
