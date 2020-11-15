package com.api.Function;

import com.api.Entidades.Persona;
import com.api.Repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
@Slf4j
public class PersonaFunction implements Function<String, Persona> {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona apply(String id) {
        log.info("Buscamos al la persona con el id:" + id );

        return personaRepository.getOne(id);
    }
}
