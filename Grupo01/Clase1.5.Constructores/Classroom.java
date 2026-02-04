public class Classroom {
    private String name;
    private String description;
    private String location;
    private int capacity;

    public Classroom(){
        name = "Not defined";
        description = "No description";
        location = "Not defined";
        capacity = -1;
    }

    public Classroom(String name, String description, String location, int capacity) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.capacity = capacity;
    }

    public Classroom (String name, int capacity){
        this.name = name;
        if (capacity > 1 && capacity <= 60) {
            this.capacity = capacity;
        }
        else{
            this.capacity = 60;
        }

        this.description = "No description";
        this.location = "No location defined";
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

