public class Main {
    public static void main(String[] args) {
        Classroom r101 = new Classroom("","","",1);
        //r101.name = "Room 101";
        /*r101.name = "Room 101";
        r101.description = "Basic sciences room";
        r101.location = "1st floor";
        r101.capacity = 30;*/

        r101.setName("Room 101");
        r101.setCapacity(10000);

        System.out.println(r101.toString());
        System.out.println(r101.getName());

    }
}