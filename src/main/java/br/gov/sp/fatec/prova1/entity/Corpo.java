package br.gov.sp.fatec.prova1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cor_corpo")
public class Corpo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cor_id")
    private Long id;

    @Column(name = "cor_nome")
    private String nome;
 
    @Column(name = "cor_descricao")
    private String descricao;
    
    @Column(name = "cor_raio")
    private Integer raio;

    @Column(name = "cor_distancia_estrela")
    private Float distancia_estrela;

    public Corpo() { }

    public Corpo(Long id, String nome, String descricao, Integer raio, Float distancia_estrela) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.raio = raio;
        this.distancia_estrela = distancia_estrela;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }

    public Float getDistancia_estrela() {
        return distancia_estrela;
    }

    public void setDistancia_estrela(Float distancia_estrela) {
        this.distancia_estrela = distancia_estrela;
    }

}
