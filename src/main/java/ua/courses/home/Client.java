package ua.courses.home;

/**
 * Created by Nikles Stanislav.
 * 05.07.2017
 */
public class Client {
    private int id;
    private String name;
    private Pet pet;

    public Client(int id, String name, Pet pet) {
        this.id = id;
        this.name = name;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client " +
                "id = " + id +
                ", name = " + name +
                ", pet = " + pet.name + ".\n" ;
    }
}
