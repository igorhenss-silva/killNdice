package com.igorhenss.killNdice.killNdice.service;

import com.igorhenss.killNdice.killNdice.domain.dto.PersonagemDTO;
import com.igorhenss.killNdice.killNdice.domain.entity.Personagem;
import com.igorhenss.killNdice.killNdice.enumerated.Alinhamento;
import com.igorhenss.killNdice.killNdice.enumerated.Classe;
import com.igorhenss.killNdice.killNdice.enumerated.Profissao;
import com.igorhenss.killNdice.killNdice.infrastructure.CriadorDePersonagem;
import com.igorhenss.killNdice.killNdice.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    // CREATE

    public PersonagemDTO salvar(PersonagemDTO dto) {
        Personagem personagem = new CriadorDePersonagem().comNomeIgualA(dto.getNome())
                                                        .comHitpointsMaximosIgualA(dto.getHitpointsMaximos())
                                                        .comHitpointsIgualA(dto.getHitpoints())
                                                        .comAlinhamentoIgualA(dto.getAlinhamento())
                                                        .comClasseIgualA(dto.getClasse())
                                                        .comProfissaoIgualA(dto.getProfissao())
                                                        .comRacaIgualA(dto.getRaca())
                                                        .criar();
        return personagemParaDto(personagemRepository.save(personagem));
    }

    // READ

    public List<PersonagemDTO> getByNomeParcial(String nome) {
        return personagemRepository.findAll()
                                    .stream()
                                    .filter(personagem -> personagem.getNome().contains(nome))
                                    .map(this::personagemParaDto)
                                    .collect(Collectors.toList());
    }

    public PersonagemDTO getByNome(String nome) {
        Personagem personagem = personagemRepository.getByNome(nome);
        return personagemParaDto(personagem);
    }

    public List<PersonagemDTO> getByAlinhamento(Alinhamento alinhamento) {
        List<Personagem> personagens = personagemRepository.getByAlinhamento(alinhamento);
        return personagens.stream()
                            .map(this::personagemParaDto)
                            .collect(Collectors.toList());
    }

    public List<PersonagemDTO> getByClasse(Classe classe) {
        List<Personagem> personagens = personagemRepository.getByClasse(classe);
        return personagens.stream()
                            .map(this::personagemParaDto)
                            .collect(Collectors.toList());
    }

    public List<PersonagemDTO> getByProfissao(Profissao profissao) {
        List<Personagem> personagens = personagemRepository.getByProfissao(profissao);
        return personagens.stream()
                            .map(this::personagemParaDto)
                            .collect(Collectors.toList());
    }

    // METHODS

    private PersonagemDTO personagemParaDto(Personagem personagem) {
        return new PersonagemDTO(personagem.getId(), personagem.getNome(),
                personagem.getHitpointsMaximos(), personagem.getHitpoints(),
                personagem.getAlinhamento(), personagem.getClasse(),
                personagem.getProfissao(), personagem.getRaca());
    }

}
