package org.example;


public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    public void imprimirEstado() {
        if (esMayorDeEdad()) {
            System.out.println("Nombre: " + nombre + " Es mayor de edad");
        } else {
            System.out.println("Nombre: " + nombre + " No es mayor de edad");
        }
    }
}
