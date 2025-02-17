package com.mariogit;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msj =  new Mensaje();
        String nombre = msj.solicitaDatos("Escribe tu nombre: ");
        msj.Saludar(nombre);
    }
}
