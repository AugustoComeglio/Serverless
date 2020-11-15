package com.api.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.api.Entidades.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepositoryImpl implements  PersonaRepository{

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    @Override
    public String delete(String id)
    {
        String msgVuleta = "";

        Persona persona= dynamoDBMapper.load(Persona.class, id);

        if (persona != null) {
            dynamoDBMapper.delete(persona);
            msgVuleta = "¡Eliminación exitosa!";
        }
        else {
            msgVuleta ="Error: la persona con id" + id +  "¡no está presente en el registro!";
        }
        return msgVuleta;
    }
}
