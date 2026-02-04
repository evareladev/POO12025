
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Creando objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        // Asignando valores a un objeto
        estudiante1.carnet = "KEY000114";
        estudiante1.nombre = "Jonathan Delgado";
        estudiante1.edad = 19;

        estudiante2.carnet = "KEY000089";
        estudiante2.nombre = "Sofia Molina";
        estudiante2.edad = 18;

        // Mostrando la información de los estudiantes
        estudiante1.presentarse();
        estudiante2.presentarse();


    }
}