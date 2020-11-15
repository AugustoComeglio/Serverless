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
    public Persona getOne(String id)
    {
        Persona persona = dynamoDBMapper.load(Persona.class, id);

        return persona;
    }
}
