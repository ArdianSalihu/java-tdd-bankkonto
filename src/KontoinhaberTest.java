import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KontoinhaberTest {

    Kontoinhaber inhaber;

    @BeforeEach
    void setup() {
        inhaber = new Kontoinhaber("Anna");
    }

    @Test
    public void testNameWirdGesetzt() {
        assertEquals("Anna", inhaber.getName());
    }

    @Test
    public void testKontoWirdAutomatischErstellt() {
        assertEquals(0, inhaber.getKonto().getKontostand());
    }
}
