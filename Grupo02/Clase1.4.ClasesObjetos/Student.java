public class Student {
    String id;
    String name;
    int age;

    //methods
    void introduceMyself(){
        System.out.println(
                "Hola, soy " + name +
                        ", mi carnet es: " + id +
                        " y tengo " + age + " años"
        );
    }
}
