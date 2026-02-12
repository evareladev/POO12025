public class Classroom {
    // Modificadores de acceso:
    /*
    * public (por defecto)
    * private
    * Protected
    * Default
    * */
    private String name;
    private String location;
    private String description;
    private int capacity;

    public Classroom(){}

    public Classroom(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Classroom(int capacity, String description){
        this.capacity = capacity;
        this.description = description;
    }

    public Classroom(String description, int capacity) {
        this.description = description;
        this.capacity = capacity;
    }

    public Classroom(String name, String location, String description, int capacity) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Description='" + description + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
