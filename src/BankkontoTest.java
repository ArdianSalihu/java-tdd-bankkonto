import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class BankkontoTest {

    Bankkonto konto;

    @BeforeEach
    void setup() {
        konto = new Bankkonto();
    }

    @Test
    void testEinzahlen() {
        konto.einzahlen(100);
        assertEquals(100, konto.getKontostand());
    }

    @Test
    void testAbheben() {
        konto.einzahlen(100);
        konto.abheben(30);
        assertEquals(70, konto.getKontostand());
    }

    @Test
    void testAbhebenMitZuWenigGeld() {
        assertThrows(IllegalArgumentException.class, () -> konto.abheben(150));
    }

    @Test
    void testEinzahlenMitNegativemBetrag() {
        assertThrows(IllegalArgumentException.class, () -> konto.einzahlen(-50));
    }

    @Test
    void testAbhebenMitNegativemBetrag() {
        assertThrows(IllegalArgumentException.class, () -> konto.abheben(-30));
    }

    @Test
    public void testEinzahlungWirdInTransaktionenGespeichert() {
        konto.einzahlen(100);
        assertEquals(1, konto.getTransaktionen().size());
    }

    @Test
    public void testAbhebungWirdInTransaktionenGespeichert() {
        konto.einzahlen(100);
        konto.abheben(50);
        assertEquals(2, konto.getTransaktionen().size());
    }
}
