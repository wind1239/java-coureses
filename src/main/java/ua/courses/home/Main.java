package ua.courses.home;

/**
 * Created by Nikles Stanislav.
 * 05.07.2017
 */
public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(10);

        clinic.addClient(new Client(0, "Petrov Ivan", new Cat("Murka")));
        clinic.addClient(new Client(1, "Petrov Ivan2", new Dog("Juchka")));
        clinic.addClient(new Client(2, "Petrov Ivan3", new Dog("Tuzik")));
        clinic.showClients();

        clinic.removeClient(1);
        clinic.showClients();

        clinic.removeClient("Petrov Ivan");
        clinic.showClients();
    }
}
