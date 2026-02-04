public class Main {
    public static void main(String[] args) {
        Classroom CLIC = new Classroom();
        System.out.println(CLIC.toString());

        // Asignado valores
        /*CLIC.name = "CLIC";
        CLIC.location = "1st floor, Key Institute, La Libertad Este";
        System.out.println(CLIC.toString());*/

        Classroom SPARK = new Classroom("Spark lab", "Basic science lab", "1st floor, Key Institute,", 40);
        System.out.println(SPARK.toString());

        Classroom ACTION = new Classroom("Action lab", 30);










    }
}