
package Herencia_Polimorfismo;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaPersonas listaPersonas = new ListaPersonas(100);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Adicionar una persona.");
            System.out.println("2. Eliminar una persona.");
            System.out.println("3. Buscar un estudiante conocido su identificación.");
            System.out.println("4. Mostrar cuántos profesores existen.");
            System.out.println("5. Mostrar cuántos estudiantes existen.");
            System.out.println("6. Salir del programa.");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner.

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos de la persona:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Calle: ");
                    String calle = scanner.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = scanner.nextLine();
                    System.out.print("Código Postal: ");
                    String codigoPostal = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    System.out.print("Es estudiante (s/n): ");
                    String esEstudianteString = scanner.nextLine();

                    boolean esEstudiante = false;
                    if (esEstudianteString.equals("s")) {
                        esEstudiante = true;
                    }

                    if (esEstudiante) {
                        System.out.print("ID del estudiante: ");
                        String idEstudiante = scanner.nextLine();
                        System.out.print("Paralelo: ");
                        String paralelo = scanner.nextLine();
                        System.out.print("Carrera: ");
                        String carrera = scanner.nextLine();

                        Estudiante estudiante = new Estudiante(nombre, apellidos, new Direccion(calle, ciudad, codigoPostal, pais), idEstudiante, paralelo, carrera);
                        listaPersonas.adicionarPersona(estudiante);
                    } else {
                        System.out.print("Usuario del correo institucional: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Materia que imparte: ");
                        String materia = scanner.nextLine();
                        System.out.print("Paralelo asignado: ");
                        String paralelo = scanner.nextLine();

                        Profesor profesor = new Profesor(nombre, apellidos, new Direccion(calle, ciudad, codigoPostal, pais), usuario, materia, paralelo);
                        listaPersonas.adicionarPersona(profesor);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el índice de la persona a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner.
                    listaPersonas.eliminarPersona(indiceEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del estudiante a buscar: ");
                    String idEstudiante = scanner.nextLine();
                    Estudiante estudianteEncontrado = listaPersonas.buscarEstudiante(idEstudiante);
                    if (estudianteEncontrado != null) {
                        System.out.println("Estudiante encontrado:");
                        System.out.println(estudianteEncontrado.toString());
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 4:
                    int cantidadProfesores = listaPersonas.cantidadProfesores();
                    System.out.println("Hay " + cantidadProfesores + " profesores en la lista.");
                    break;
            case 5:
int cantidadEstudiantes = listaPersonas.cantidadEstudiantes();
System.out.println("Hay " + cantidadEstudiantes + " estudiantes en la lista.");
break;
case 6:
System.out.println("Hasta luego!");
break;
default:
System.out.println("Opción inválida. Intente de nuevo.");
break;
}
} while (opcion != 6);

    scanner.close();
}
}


