package ua.courses.home;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Nikles Stanislav.
 * @since 06.07.2017
 */
public class ClinicTest {
    private Clinic clinic;
    private Client client;

    @Before
    public void setUp() throws Exception {
        clinic = new Clinic(10);
        client = new Client(1, "Petr", new Cat("Cat"));
    }


    @Test
    public void addClient() throws Exception {
        clinic.addClient(client);
        assertEquals(client, clinic.getClient(1));
    }

    @Test
    public void removeClient() throws Exception {
        clinic.addClient(client);
        clinic.removeClient(1);
        assertEquals(null, clinic.getClient(1));
    }


    @Test
    public void removeClient1() throws Exception {
        clinic.addClient(client);
        clinic.removeClient("Petr");
        assertEquals(null, clinic.getClient(1));
    }

    @Test
    public void renameClient() throws Exception {
        clinic.addClient(client);
        clinic.renameClient("Petr", "Ivan");
        assertEquals("Ivan", clinic.getClient(1).getName() );
    }

}