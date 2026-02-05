public class Classroom {
    String name;
    String description;
    String location;
    int capacity;

    public Classroom(){
        name = "Not defined";
        description = "Not defined";
        location = "Not defined";
        capacity = -1;
    }

    public Classroom(String name, String description, String location, int capacity){
        this.name = name;
        this.description = description;
        this.location = location;
        this.capacity = capacity;
    }

    public Classroom(String name, String location){
        this.name = name;
        this.location = location;
        this.capacity = -1;
        this.description = "Not defined";
    }
    

    @Override
    public String toString() {
        return "Classroom{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
