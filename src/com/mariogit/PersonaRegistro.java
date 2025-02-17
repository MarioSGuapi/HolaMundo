package com.mariogit;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        System.out.println("Esta instrucion es in");
        return "%s %s".formatted(nombre, apellidos);
    }
}
