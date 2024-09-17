
package Herencia_Polimorfismo;


public class ListaPersonas {
    private Persona[] personas;
    private int dimension;
    private int contador;

    public ListaPersonas(int dimension) {
        this.personas = new Persona[dimension];
       
this.dimension = dimension;
this.contador = 0;
}
    public void adicionarPersona(Persona persona) {
    if (contador < dimension) {
        personas[contador] = persona;
        contador++;
        System.out.println("Persona agregada exitosamente.");
    } else {
        System.out.println("No se puede agregar más personas.");
    }
}

public void eliminarPersona(int indice) {
    if (indice >= 0 && indice < contador) {
        for (int i = indice; i < contador - 1; i++) {
            personas[i] = personas[i + 1];
        }
        personas[contador - 1] = null;
        contador--;
        System.out.println("Persona eliminada exitosamente.");
    } else {
        System.out.println("No se puede eliminar la persona.");
    }
}

public Estudiante buscarEstudiante(String idEstudiante) {
    for (int i = 0; i < contador; i++) {
        if (personas[i] instanceof Estudiante && ((Estudiante) personas[i]).getIdEstudiante() == idEstudiante) {
            return (Estudiante) personas[i];
        }
    }
    return null;
}

public Profesor buscarProfesor(String usuarioCorreo) {
    for (int i = 0; i < contador; i++) {
        if (personas[i] instanceof Profesor && ((Profesor) personas[i]).getUsuarioCorreo().equals(usuarioCorreo)) {
            return (Profesor) personas[i];
        }
    }
    return null;
}

public int cantidadProfesores() {
    int cantidad = 0;
    for (int i = 0; i < contador; i++) {
        if (personas[i] instanceof Profesor) {
            cantidad++;
        }
    }
    return cantidad;
}

public int cantidadEstudiantes() {
    int cantidad = 0;
    for (int i = 0; i < contador; i++) {
        if (personas[i] instanceof Estudiante) {
            cantidad++;
        }
    }
    return cantidad;
}

public void mostrarPersonas() {
    for (int i = 0; i < contador; i++) {
        System.out.println(personas[i]);
    }
}
}
