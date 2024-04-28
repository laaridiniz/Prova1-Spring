package br.gov.sp.fatec.prova1.service;

import java.util.List;

import br.gov.sp.fatec.prova1.entity.Corpo;

public interface ICorpoService {
    public List<Corpo> buscarCorposPorNomeEDistancia(String texto, Float distancia);
    public Corpo cadastrarCorpo(Corpo corpo);
    public List<Corpo> buscarTodos();
    public Corpo buscarCorposPorNomeEDistancia(Long id);
}
