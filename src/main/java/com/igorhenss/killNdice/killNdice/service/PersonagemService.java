package com.igorhenss.killNdice.killNdice.service;

import com.igorhenss.killNdice.killNdice.domain.dto.PersonagemDTO;
import com.igorhenss.killNdice.killNdice.domain.entity.Personagem;
import com.igorhenss.killNdice.killNdice.infrastructure.CriadorDePersonagem;
import com.igorhenss.killNdice.killNdice.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    // CREATE

    public PersonagemDTO save(PersonagemDTO dto) {
        Personagem personagem = new CriadorDePersonagem().comNomeIgualA(dto.getNome())
                                                        .comHitpointsMaximosIgualA(dto.getHitpointsMaximos())
                                                        .comHitpointsIgualA(dto.getHitpoints())
                                                        .comAlinhamentoIgualA(dto.getAlinhamento())
                                                        .comClasseIgualA(dto.getClasse())
                                                        .comProfissaoIgualA(dto.getProfissao())
                                                        .comRacaIgualA(dto.getRaca())
                                                        .criar();
        return personagemToDto(personagemRepository.save(personagem));
    }

    // METHODS

    private PersonagemDTO personagemToDto(Personagem personagem) {
        return new PersonagemDTO(personagem.getId(), personagem.getNome(),
                personagem.getHitpointsMaximos(), personagem.getHitpoints(),
                personagem.getAlinhamento(), personagem.getClasse(),
                personagem.getProfissao(), personagem.getRaca());
    }

}
