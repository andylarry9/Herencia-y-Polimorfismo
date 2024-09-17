Tema: Herencia y Polimorfismo.
Objetivo: Resolución de ejercicios mediante la implementación de una jerarquía de clases
por herencia y la redefinición de métodos polimórfico.
Actividad: Se trata de crear una pequeña base de datos de personas de un tecnológico.
De momento definiremos y probaremos las siguientes clases:
❑ Direccion:
✓ atributos: calle, ciudad, código postal, pais
✓ Constructores predeterminado y parametrizado.
✓ Métodos de acceso, modificadores y toString().
❑ Persona: Clase abstracta
✓ atributos: nombre, apellidos y un objeto de la clase Dirección
✓ Constructores predeterminado y parametrizado.
✓ Métodos de acceso y modificadores y toString().
✓ Método Abstracto: Indentificate().
❑ Estudiante: Subclase de Persona.
✓ atributos: ID de estudiante, paralelo y carrera.
✓ Constructores: predeterminado y constructor parametrizado que admita el ID,
paralelo y carrera.
✓ Métodos de acceso, modificadores y toString().
✓ Método Polimórfico: Indentificate(), que muestra el tipo de la clase que lo
implementa (el tipo de persona, en este caso).
❑ Profesor: Subclase de Persona.
✓ atributos: usuario del correo institucional, materia que imparte y paralelo
asignado.
✓ Constructores: predeterminado y constructor parametrizado que admita el
paralelo asignado y la materia que imparte.
✓ Métodos de acceso y modificadores y toString().
✓ Método Polimórfico: Indentificate(), que muestra el tipo de la clase que lo
implementa (el tipo de persona, en este caso).
❑ ListaPersonas
✓ atributos: arreglo de objetos de la clase Persona, dimensión del arreglo,
contador de personas.
✓ Constructores: predeterminado y constructor parametrizado.
✓ Métodos de acceso y modificadores y toString().
3
✓ Métodos de acción:
▪ AdicionarPersona que reciba por parámetro un objeto de la clase
Persona.
▪ EliminarPersona que reciba por parámetro el índice de posición
del elemento del arreglo para eliminar.
▪ BuscarEstudiante que reciba por parámetro el ID del estudiante a
buscar y si es que existe devuelva un objeto de la clase
Estudiante.
▪ BuscarProfesor que reciba de parámetro el usuario de correo
institucional y si es que existe devuelva un objeto de la clase
Profesor.
▪ CantidadProfesores devuelva cuantos profesores existen.
▪ CantidadEstudiantes devuelva cuantos estudiantes existen.
Implemente un programa de consola en el lenguaje Java, mediante la herramienta de
compilación online https://www.onlinegdb.com/ y, que permita ejecutar los siguientes
requerimientos funcionales:
1. Crear un objeto de la clase ListaPersonas mediante el constructor parametrizable.
2. Implementar un menú de opciones:
1. Adicionar una persona.
2. Eliminar una persona.
3. Buscar un estudiante conocido su identificación.
4. Mostrar cuantos profesores existen
5. Mostrar cuantos estudiantes existen.
6. Salir del programa.
