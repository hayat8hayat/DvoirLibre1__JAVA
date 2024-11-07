import ma.ensa.devoir.classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class CompteTest {
    @Test
    public void testCompteCreation() {
        Client client = new Client(1, "Imhah", "Hayat", "Marrakech", "0600000000", "hayat@test.com");
        Banque banque = new Banque(1, "Maroc");
        Compte compte = new Compte(100, new Date(), new Date(), "MAD", client, banque);
        assertEquals("MAD", compte.getDevise());
        assertEquals(client, compte.getClient());
    }
}
