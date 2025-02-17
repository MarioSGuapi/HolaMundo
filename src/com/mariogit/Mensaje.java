package com.mariogit;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje){
        System.out.print(mensaje);

       Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void Saludar(Persona persona) {
        System.out.printf("Hola %s, Bienvenido a Java\n", persona);
    }
}
