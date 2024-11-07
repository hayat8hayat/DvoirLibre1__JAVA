import ma.ensa.devoir.classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class TransactionTest {
    @Test
    public void testTransactionTypeVIRIN() {
        Banque banque = new Banque(1, "Maroc");
        Client client1 = new Client(1, "Imhah", "Hayat", "Marrakech", "0600000000", "hayat@test.com");
        Client client2 = new Client(2, "Imhah", "Niama", "Casa", "0611111111", "gi@test.com");

        Compte compte1 = new Compte(100, new Date(), new Date(), "MAD", client1, banque);
        Compte compte2 = new Compte(101, new Date(), new Date(), "MAD", client2, banque);

        Transaction transaction = new Transaction(new Date(), "ref123", compte1, compte2);
        assertEquals("VIRIN", transaction.getType());
    }

    @Test
    public void testTransactionTypeVIRCHAC() {
        Banque banque1 = new Banque(1, "Maroc");
        Banque banque2 = new Banque(2, "Palestine");
        Client client1 = new Client(1, "Imhah", "Hayat", "Marrakech", "0600000000", "hayat@test.com");
        Client client2 = new Client(2, "Imhah", "Niama", "Casa", "0611111111", "gi@test.com");

        Compte compte1 = new Compte(100, new Date(), new Date(), "MAD", client1, banque1);
        Compte compte2 = new Compte(101, new Date(), new Date(), "MAD", client2, banque2);

        Transaction transaction = new Transaction(new Date(), "ref456", compte1, compte2);
        assertEquals("VIRCHAC", transaction.getType());
    }
}
