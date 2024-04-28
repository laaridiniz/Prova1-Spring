package br.gov.sp.fatec.prova1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.prova1.entity.Corpo;
import br.gov.sp.fatec.prova1.service.ICorpoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/corpo")
public class CorpoController {
    @Autowired
    private ICorpoService service;

    @GetMapping
    public List<Corpo> buscarTodos() {
    return service.buscarTodos();
    }
 
    @GetMapping(value = "/{corpo}")
    public Corpo buscarCorposPorNomeEDistancia(@PathVariable("corpo") Long id) {
    return service.buscarCorposPorNomeEDistancia(id);
 }

    @PostMapping
    public Corpo cadastrarCorpo (@RequestBody Corpo corpo) {
    return service.cadastrarCorpo(corpo);
 }

}
