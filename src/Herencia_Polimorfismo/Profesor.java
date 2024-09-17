
package Herencia_Polimorfismo;


public class Profesor extends Persona {
    private String usuarioCorreo;
    private String materiaImparte;
    private String paraleloAsignado;

    public Profesor() {}

    public Profesor(String nombre, String apellidos, Direccion direccion, String usuarioCorreo, String materiaImparte, String paraleloAsignado) {
        super(nombre, apellidos, direccion);
        this.usuarioCorreo = usuarioCorreo;
        this.materiaImparte = materiaImparte;
        this.paraleloAsignado = paraleloAsignado;
    }

    // Métodos de acceso y modificadores

    public void identificate() {
        System.out.println("Soy un profesor");
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public String toString() {
        return super.toString() + ", " + usuarioCorreo + ", " + materiaImparte + ", " + paraleloAsignado;
    }
}

