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

    @Column(name = "hitpoints_maximos", nullable = false)
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

    // GETTERS AND SETTERS

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

    public Integer getHitpointsMaximos() {
        return hitpointsMaximos;
    }

    public void setHitpointsMaximos(Integer hitpointsMaximos) {
        this.hitpointsMaximos = hitpointsMaximos;
    }

    public Integer getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(Integer hitpoints) {
        this.hitpoints = hitpoints;
    }

    public Alinhamento getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(Alinhamento alinhamento) {
        this.alinhamento = alinhamento;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

}
