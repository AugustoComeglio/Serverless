package com.api.Entidades;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "persona")
public class Persona {

    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "nombre")
    private String nombre;

    @DynamoDBAttribute(attributeName = "apellido")
    private String apellido;

    @DynamoDBAttribute(attributeName = "dni")
    private int dni;

}
