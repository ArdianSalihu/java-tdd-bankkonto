import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SparkontoTest {

    Sparkonto sparen;

    @BeforeEach
    void setup() {
        sparen = new Sparkonto(0.08);
    }

    @Test
    void testZinsenWerdenGutgeschrieben() {
        sparen.einzahlen(100);
        sparen.zinsenGutschreiben();
        assertEquals(108, sparen.getKontostand());
    }
}
