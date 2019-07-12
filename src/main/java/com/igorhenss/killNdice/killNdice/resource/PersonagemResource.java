package com.igorhenss.killNdice.killNdice.resource;

import com.igorhenss.killNdice.killNdice.domain.dto.PersonagemDTO;
import com.igorhenss.killNdice.killNdice.enumerated.Alinhamento;
import com.igorhenss.killNdice.killNdice.enumerated.Classe;
import com.igorhenss.killNdice.killNdice.enumerated.Profissao;
import com.igorhenss.killNdice.killNdice.enumerated.Raca;
import com.igorhenss.killNdice.killNdice.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/personagens")
public class PersonagemResource {

    @Autowired
    private PersonagemService personagemService;

    @PostMapping
    public PersonagemDTO salvar(@RequestBody PersonagemDTO body) {
        return personagemService.salvar(body);
    }

    @GetMapping(value = "/nomeParcial/{nome_parcial}")
    public List<PersonagemDTO> getByNomeParcial(@PathVariable("nome_parcial") String nome) {
        return personagemService.getByNomeParcial(nome);
    }

    @GetMapping(value = "/nome/{nome}")
    public PersonagemDTO getByNome(@PathVariable("nome") String nome) {
        return personagemService.getByNome(nome);
    }

    @GetMapping(value = "/alinhamento/{alinhamento}")
    public List<PersonagemDTO> getByAlinhamento(@PathVariable("alinhamento") Alinhamento alinhamento) {
        return personagemService.getByAlinhamento(alinhamento);
    }

    @GetMapping(value = "/classe/{classe}")
    public List<PersonagemDTO> getByClasse(@PathVariable("classe") Classe classe) {
        return personagemService.getByClasse(classe);
    }

    @GetMapping(value = "/profissao/{profissao}")
    public List<PersonagemDTO> getByProfissao(@PathVariable("profissao") Profissao profissao) {
        return personagemService.getByProfissao(profissao);
    }

    @GetMapping(value = "/raca/{raca}")
    public List<PersonagemDTO> getByRaca(@PathVariable("raca") Raca raca) {
        return personagemService.getByRaca(raca);
    }

    @PutMapping(value = "/{id}")
    public PersonagemDTO alterar(@PathVariable("id") Long id, @RequestBody PersonagemDTO body) {
        return personagemService.alterar(id, body);
    }

}
