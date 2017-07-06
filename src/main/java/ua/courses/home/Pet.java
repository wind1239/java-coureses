package ua.courses.home;

/**
 * Created by Nikles Stanislav.
 * 05.07.2017
 */
public abstract class Pet {
    String name;
    String identifier;

    public Pet(String name) {
        this.name = name;
    }

    void voice(){
        System.out.println(name + " say " + identifier);
    }
}
