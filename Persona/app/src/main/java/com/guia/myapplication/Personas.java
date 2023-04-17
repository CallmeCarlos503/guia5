package com.guia.myapplication;

public class Personas {
    private String Nombre;
    private char genero;
    public Personas(String nombre, char genero){
        this.Nombre=nombre;
        this.genero=genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public char getGenero() {
        return genero;
    }
}
