import java.util.ArrayList;
import java.util.List;

public class Bankkonto {

    private int kontostand = 0;
    private List<String> transaktionen = new ArrayList<>();

    public void einzahlen(int betrag) {

        if (betrag <= 0) {
            throw new IllegalArgumentException("Der Einzahlungsbetrag darf nicht negativ sein!");
        }

        kontostand += betrag;
        transaktionen.add("Einzahlung: " + betrag);
    }

    public int getKontostand() {
        return kontostand;
    }

    public void abheben(int betrag) {
        if (kontostand < betrag) {
            throw new IllegalArgumentException("Dein Guthaben ist nicht ausreichend!");
        }

        if (betrag <= 0) {
            throw new IllegalArgumentException("Du kannst keinen negativen Betrag abheben!");
        }

        kontostand -= betrag;
        transaktionen.add("Abhebung: " + betrag);
    }

    public List<String> getTransaktionen() {
        return transaktionen;
    }
}
