package com.igorhenss.killNdice.killNdice.resource;

import com.igorhenss.killNdice.killNdice.domain.dto.PersonagemDTO;
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

}
