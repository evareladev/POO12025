public class Main {
    public static void main(String[] args) {
        Classroom CLIC = new Classroom();
        System.out.println(CLIC.toString());
        /*CLIC.name = "CLIC Lab";
        CLIC.location = "1st Floor, Key Institute, La Libertad";
        CLIC.description = "Computer Science LAB";
        CLIC.capacity = 40;*/
        System.out.println(CLIC.toString());
        Classroom SPARK = new Classroom("SPARK Lab",
                "Basic Science Lab",
                "1st Floor",
                60);
        System.out.println(SPARK.toString());
    }
}