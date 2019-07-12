package com.igorhenss.killNdice.killNdice.domain.dto;

import com.igorhenss.killNdice.killNdice.enumerated.Alinhamento;
import com.igorhenss.killNdice.killNdice.enumerated.Classe;
import com.igorhenss.killNdice.killNdice.enumerated.Profissao;
import com.igorhenss.killNdice.killNdice.enumerated.Raca;

import java.io.Serializable;

public class PersonagemDTO implements Serializable {

    public static final long serialVersionUID = 23L;

    private Long id;
    private String nome;
    private Integer hitpoints;
    private Alinhamento alinhamento;
    private Classe classe;
    private Profissao profissao;
    private Raca raca;

    public PersonagemDTO(Long id, String nome, Integer hitpoints,
                         Alinhamento alinhamento, Classe classe,
                         Profissao profissao, Raca raca) {
        this.id = id;
        this.nome = nome;
        this.hitpoints = hitpoints;
        this.alinhamento = alinhamento;
        this.classe = classe;
        this.profissao = profissao;
        this.raca = raca;
    }

}
