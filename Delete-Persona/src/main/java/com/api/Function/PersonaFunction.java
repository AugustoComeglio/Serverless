package com.api.Function;

import com.api.Entidades.Persona;
import com.api.Repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
@Slf4j
public class PersonaFunction implements Function<String, String> {

    @Autowired
    private PersonaRepository  personaRepository;

    @Override
    public String apply(String id)
    {
        log.info("****** Eliminamos a la persona con id:" + id +  " *******");

        return personaRepository.delete(id);
    }
}
