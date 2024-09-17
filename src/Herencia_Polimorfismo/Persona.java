
package Herencia_Polimorfismo;


public abstract class Persona {
    private String nombre;
    private String apellidos;
    private Direccion direccion;

    public Persona() {}

    public Persona(String nombre, String apellidos, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    // Métodos de acceso y modificadores

    public abstract void identificate();

    public String toString() {
        return nombre + " " + apellidos + ", " + direccion.toString();
    }
}

