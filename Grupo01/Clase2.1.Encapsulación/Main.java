
public class Main {
    public static void main(String[] args) {
        Classroom R103 = new Classroom();
        R103.setName("Room 103");
        System.out.println(R103.toString());
        R103.setName("Room-103");
        System.out.println(R103.toString());
        R103.setCapacity(10000);
    }
}