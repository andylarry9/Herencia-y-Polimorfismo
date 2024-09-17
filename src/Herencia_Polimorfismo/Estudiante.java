
package Herencia_Polimorfismo;


public class Estudiante extends Persona {
    private String idEstudiante;
    private String paralelo;
    private String carrera;

    public Estudiante() {}

    public Estudiante(String nombre, String apellidos, Direccion direccion, String idEstudiante, String paralelo, String carrera) {
        super(nombre, apellidos, direccion);
        this.idEstudiante = idEstudiante;
        this.paralelo = paralelo;
        this.carrera = carrera;
    }

    // Métodos de acceso y modificadores

    public void identificate() {
        System.out.println("Soy un estudiante");
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    

    public String toString() {
        return super.toString() + ", " + idEstudiante + ", " + paralelo + ", " + carrera;
    }
}

