package ua.courses.home;

/**
 * @author Nikles Stanislav.
 * @since 05.07.2017
 */
public class Clinic {

    private Client[] clients;
    private int counter = 0;

    Clinic(int capacity) {
        clients = new Client[capacity];
        System.out.println("Клиника создана!");
    }

    void showClients() {
        for (int i = 0; i < counter; i++) {
            System.out.println(clients[i].toString());
        }
    }

    void addClient(Client client) {
        System.out.print("Добавляю...");
        clients[counter] = client;
        counter++;
        System.out.println("OK");
    }

    void removeClient(int id) {
        int i = 0;
        while (i < clients.length) {
            if (clients[i].getId() == id) {
                clients = remove(i);
                break;
            } else {
                i++;
            }
        }
    }

    void removeClient(String name) {
        int i = 0;
        while (i < clients.length) {
            if (clients[i].getName().equals(name)) {
                clients = remove(i);
                break;
            } else {
                i++;
            }
        }
    }

    public void renameClient(String oldName, String newName) {
        int i = 0;
        while (i < clients.length) {
            if (oldName.equals(clients[i].getName())) {
                clients[i].setName(newName);
                break;
            } else {
                i++;
            }
        }
    }

    public Client getClient(int id) {
        Client client = null;
        for (Client cl : clients) {
            if (cl != null) {
                if (cl.getId() == id) {
                    client = cl;
                }
            }
        }
        return client;
    }

    public Client[] getClients() {
        return clients;
    }

    private Client[] remove(int index) {
        System.out.print("Удаляю...");
        Client[] newClients = new Client[clients.length - 1];
        System.arraycopy(clients, 0, newClients, 0, index);
        System.arraycopy(clients, index + 1, newClients, index, clients.length - index - 1);
        counter--;
        System.out.println("OK");
        return newClients;
    }

}
