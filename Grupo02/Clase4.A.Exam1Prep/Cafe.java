public class Cafe {
    private String name;
    private boolean isOpen;
    private Schedule schedule;

    public Cafe(String name, Schedule schedule){
        this.name = name;
        this.isOpen = false;
        this.schedule = schedule;
    }

    public Cafe(String name, boolean isOpen, Schedule schedule) {
        this.name = name;
        this.isOpen = isOpen;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    //methods
    void openCafe(){
        this.isOpen = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchedule(Schedule schedule){
        this.schedule = schedule;
    }
}
