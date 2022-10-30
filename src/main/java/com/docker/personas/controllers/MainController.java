package com.docker.personas.controllers;

import com.docker.personas.models.Datos;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/datos")
    public Datos datos(@RequestParam(value="nombre", defaultValue="Natan") String nombre,
                       @RequestParam(value="edad", defaultValue="47") Integer edad)
    {
        return new Datos(nombre, edad);
    }

}