import ma.ensa.devoir.classes.Client;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    @Test
    public void testClientCreation() {
        Client client = new Client(1, "Imhah", "Hayat", "Marrakech", "0600000000", "hayat@test.com");
        assertEquals(1, client.getNumClient());
        assertEquals("Doe", client.getNom());
    }
}
