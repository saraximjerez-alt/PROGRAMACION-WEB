package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

    
        double resSuma = calculadora.sumar(20, 30);
        calculadora.mostrarResultado("Suma", resSuma);

  
        double resResta = calculadora.restar(50, 15);
        calculadora.mostrarResultado("Resta", resResta);

      
        double resMultiplicacion = calculadora.multiplicar(6, 7);
        calculadora.mostrarResultado("Multiplicación", resMultiplicacion);

       
        double resDivision = calculadora.dividir(100, 4);
        calculadora.mostrarResultado("División", resDivision);
    }
}


class Calculadora {

  
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    
    public void mostrarResultado(String operacion, double resultado) {
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }
}
