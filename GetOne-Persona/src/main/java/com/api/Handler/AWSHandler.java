package com.api.Handler;

import com.api.Entidades.Persona;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class AWSHandler extends SpringBootRequestHandler<String, Persona> {
}
