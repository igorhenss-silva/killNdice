package com.igorhenss.killNdice.killNdice.repository;

import com.igorhenss.killNdice.killNdice.domain.entity.Personagem;
import com.igorhenss.killNdice.killNdice.enumerated.Alinhamento;
import com.igorhenss.killNdice.killNdice.enumerated.Classe;
import com.igorhenss.killNdice.killNdice.enumerated.Profissao;
import com.igorhenss.killNdice.killNdice.enumerated.Raca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

    Personagem getByNome(String nome);
    List<Personagem> getByAlinhamento(Alinhamento alinhamento);
    List<Personagem> getByClasse(Classe classe);
    List<Personagem> getByProfissao(Profissao profissao);
    List<Personagem> getByRaca(Raca raca);

}
