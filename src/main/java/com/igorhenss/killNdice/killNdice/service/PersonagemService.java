package com.igorhenss.killNdice.killNdice.service;

import com.igorhenss.killNdice.killNdice.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

}
