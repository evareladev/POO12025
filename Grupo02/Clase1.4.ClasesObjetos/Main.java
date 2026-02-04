import javax.swing.plaf.synth.SynthTableUI;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");
        // Declarando e inicializando objetos
        Student e1 = new Student();
        Student e2 = new Student();

        // asignado información a los objetos
        e1.id = "KEY_000115";
        e1.name = "Ademir Cañas";
        e1.age = 20;

        e2.id = "KEY_000108";
        e2.name = "Reina Romero";
        e2.age = 20;


        // Mostrando la información de los objetos
        e1.introduceMyself();
        e2.introduceMyself();


        // Ejemplo de lista de objetos
        List<Student> group = new ArrayList<>();

        // Agregando objetos a la lista
        group.add(e1);
        group.add(e2);
        group.add(new Student());

        for (Student s: group){ //for (i in list): ...
            s.introduceMyself();
        }
    }
}