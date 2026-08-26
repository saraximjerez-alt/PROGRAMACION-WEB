package org.example;

public class NOMPERSONA {
    private String nombre;
    private int edad;
    private String documento;

   
    public NOMPERSONA(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Documento: " + documento);
    }
}


package org.example;
public class Main {
    public static void main(String[] args) {
        NOMPERSONA p1 = new NOMPERSONA("Juan", 20, "12345678");
        p1.mostrarInformacion();
    }
}
