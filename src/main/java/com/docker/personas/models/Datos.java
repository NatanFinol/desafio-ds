package com.docker.personas.models;

public class Datos {
    private final String nombre;
    private final Integer edad;

    public Datos(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Integer getEdad()
    {
        return edad;
    }
}