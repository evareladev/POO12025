public class Classroom {
    // modificadores de acceso: public, private, protected y default
    private String name;
    private String description;
    private String location;
    private int capacity;


    public Classroom(){
    }

    public Classroom(String name, String location){
        this.name = name;
        this.location = location;
    }

    public Classroom(String name, String location, String description, int capacity){
        this.name = name;
        this.location = location;
        this.description = description;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 1 && capacity <= 40){
            this.capacity = capacity;
        }
        /*
        * Error pendiente de definir: valor incorrecto
        * */
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
