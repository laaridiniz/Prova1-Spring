package br.gov.sp.fatec.prova1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.prova1.entity.Corpo;

public interface CorpoRepository extends JpaRepository<Corpo, Long>{
    @Query("SELECT c FROM Corpo c WHERE c.nome LIKE %:texto% AND c.distancia_estrela > :distancia")
    static
    List<Corpo> findByNomeContainingAndDistanciaEstrelaGreaterThan(String texto, Float distancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomeContainingAndDistanciaEstrelaGreaterThan'");
    }
}
