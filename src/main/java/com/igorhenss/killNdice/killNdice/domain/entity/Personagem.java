package com.igorhenss.killNdice.killNdice.domain.entity;

import com.igorhenss.killNdice.killNdice.enumerated.*;
import com.igorhenss.killNdice.killNdice.infrastructure.CriadorDePersonagem;

import javax.persistence.*;

@Entity
@Table(name = "personagem")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "hitpointsMaximos", nullable = false)
    private Integer hitpointsMaximos;

    @Column(name = "hp", nullable = false)
    private Integer hitpoints;

    @Enumerated(EnumType.STRING)
    @Column(name = "alinhamento", nullable = false)
    private Alinhamento alinhamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "classe", nullable = false)
    private Classe classe;

    @Enumerated(EnumType.STRING)
    @Column(name = "profissao")
    private Profissao profissao;

    @Enumerated(EnumType.STRING)
    @Column(name = "raca", nullable = false)
    private Raca raca;

    public Personagem(CriadorDePersonagem criador) {
        this.nome = criador.getNome();
        this.hitpoints = criador.getHitpoints();
        this.alinhamento = criador.getAlinhamento();
        this.classe = criador.getClasse();
        this.profissao = criador.getProfissao();
        this.raca = criador.getRaca();
    }

    // GETTERS

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHitpointsMaximos() {
        return hitpointsMaximos;
    }

    public Integer getHitpoints() {
        return hitpoints;
    }

    public Alinhamento getAlinhamento() {
        return alinhamento;
    }

    public Classe getClasse() {
        return classe;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public Raca getRaca() {
        return raca;
    }
}
