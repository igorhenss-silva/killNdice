package com.igorhenss.killNdice.killNdice.domain.entity;

import com.igorhenss.killNdice.killNdice.enumerated.*;
import com.igorhenss.killNdice.killNdice.infrastructure.CriadorDePersonagem;

public class Personagem {

    private String nome;
    private Integer hitpoints;
    private Alinhamento alinhamento;
    private Classe classe;
    private Profissao profissao;
    private Raca raca;

    public Personagem(CriadorDePersonagem criador) {
        this.nome = criador.getNome();
        this.hitpoints = criador.getHitpoints();
        this.alinhamento = criador.getAlinhamento();
        this.classe = criador.getClasse();
        this.profissao = criador.getProfissao();
        this.raca = criador.getRaca();
    }

}
