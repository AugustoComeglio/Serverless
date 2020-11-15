package com.api.Function;

import com.api.Entidades.Persona;
import com.api.Repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
@Slf4j
public class PersonaFunction implements Function<Persona, InfoMsg> {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public InfoMsg apply(Persona persona) {
        String msg = "";

        InfoMsg msgVuelta = new InfoMsg();

        log.info("****** Entrada de datos de Persona *******");

        if (persona.getId() == "") {
            msg = "Error: ingrese un id correcto";
        } else
            if (persona.getNombre().length() < 1 || persona.getNombre().length() > 50) {
            msg = "Error: el nombre debe tener entre 1 y 50 caracteres";
        } else {
            String id = personaRepository.save(persona).getId();
            if (id.length() > 0) {
                msg = "Entrada de datos de la persona " + id + " realizada con exito!";
            }
        }

        log.info(msg);
        msgVuelta.setMessage(msg);
        return msgVuelta;
    }
}
