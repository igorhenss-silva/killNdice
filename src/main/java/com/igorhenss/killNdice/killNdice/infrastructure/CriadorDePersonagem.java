package com.igorhenss.killNdice.killNdice.infrastructure;

import com.igorhenss.killNdice.killNdice.domain.entity.Personagem;
import com.igorhenss.killNdice.killNdice.enumerated.Alinhamento;
import com.igorhenss.killNdice.killNdice.enumerated.Classe;
import com.igorhenss.killNdice.killNdice.enumerated.Profissao;
import com.igorhenss.killNdice.killNdice.enumerated.Raca;

public class CriadorDePersonagem {

    private String nome;
    private Integer hitpointsMaximos;
    private Integer hitpoints;
    private Alinhamento alinhamento;
    private Classe classe;
    private Profissao profissao;
    private Raca raca;

    public CriadorDePersonagem comNomeIgualA(String nome) {
        this.nome = nome;
        return this;
    }

    public CriadorDePersonagem comHitpointsMaximosIgualA(Integer hitpointsMaximos) {
        this.hitpointsMaximos = hitpointsMaximos;
        return this;
    }

    public CriadorDePersonagem comHitpointsIgualA(Integer hitpoints) {
        this.hitpoints = hitpoints;
        return this;
    }

    public CriadorDePersonagem comAlinhamentoIgualA(Alinhamento alinhamento) {
        this.alinhamento = alinhamento;
        return this;
    }

    public CriadorDePersonagem comClasseIgualA(Classe classe) {
        this.classe = classe;
        return this;
    }

    public CriadorDePersonagem comProfissaoIgualA(Profissao profissao) {
        this.profissao = profissao;
        return this;
    }

    public CriadorDePersonagem comRacaIgualA(Raca raca) {
        this.raca = raca;
        return this;
    }

    public Personagem criar() {
        return new Personagem(this);
    }

    // GETTERS

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
