package br.gov.sp.fatec.prova1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.prova1.entity.Corpo;
import br.gov.sp.fatec.prova1.repository.CorpoRepository;

@Service
public class CorpoService implements ICorpoService{
    @Autowired
    private CorpoRepository corpoRepo;

    public Corpo cadastrarCorpo(Corpo corpo) {
        if (corpo.getNome() == null || 
        corpo.getDescricao() == null || 
        corpo.getDistancia_estrela() == null) {
            throw new IllegalArgumentException("Os campos nome, descrição e distância não podem ser nulos");
        }
        return corpoRepo.save(corpo);
    }
    
    public List<Corpo> buscarTodos() {
    return corpoRepo.findAll();
    }

    public List<Corpo> buscarCorposPorNomeEDistancia(String texto, Float distancia) {
         return CorpoRepository.findByNomeContainingAndDistanciaEstrelaGreaterThan(texto, distancia);
    }

    @Override
    public Corpo buscarCorposPorNomeEDistancia(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCorposPorNomeEDistancia'");
    }
}
