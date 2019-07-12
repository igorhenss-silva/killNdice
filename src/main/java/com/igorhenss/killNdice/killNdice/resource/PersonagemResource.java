package com.igorhenss.killNdice.killNdice.resource;

import com.igorhenss.killNdice.killNdice.domain.dto.PersonagemDTO;
import com.igorhenss.killNdice.killNdice.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/personagens")
public class PersonagemResource {

    @Autowired
    private PersonagemService personagemService;

    @PostMapping
    public PersonagemDTO salvar(@RequestBody PersonagemDTO body) {
        return personagemService.salvar(body);
    }

}
