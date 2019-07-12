package com.igorhenss.killNdice.killNdice.domain.dto;

import com.igorhenss.killNdice.killNdice.enumerated.Alinhamento;
import com.igorhenss.killNdice.killNdice.enumerated.Classe;
import com.igorhenss.killNdice.killNdice.enumerated.Profissao;
import com.igorhenss.killNdice.killNdice.enumerated.Raca;

import java.io.Serializable;
import java.util.Objects;

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

    // EQUALS AND HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonagemDTO that = (PersonagemDTO) o;
        return id.equals(that.id) &&
                nome.equals(that.nome) &&
                hitpoints.equals(that.hitpoints) &&
                alinhamento == that.alinhamento &&
                classe == that.classe &&
                profissao == that.profissao &&
                raca == that.raca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

}
