public class Sparkonto extends Bankkonto {

    double zinssatz;

    public Sparkonto(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public void zinsenGutschreiben() {
        double zinsbetrag = getKontostand() * zinssatz;

        int myInt = (int) zinsbetrag;

        einzahlen(myInt);
    }

}
