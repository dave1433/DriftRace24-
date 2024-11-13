package dk.davidcho.driftrace;

public class Player {
    private String name;
    private int age;
    private String colour;

    public Player(String name, int age, String colour) {
        getName();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
