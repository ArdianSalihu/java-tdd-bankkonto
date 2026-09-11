public class Main {
    public static void main(String[] args) {

        Kontoinhaber anna = new Kontoinhaber("Anna");
        Sparkonto sparkonto = new Sparkonto(0.05);

        anna.getKonto().einzahlen(100);
        anna.getKonto().abheben(50);

        sparkonto.einzahlen(50);
        sparkonto.zinsenGutschreiben();


        System.out.println(anna.getKonto().getKontostand());

        for (String eintrag : anna.getKonto().getTransaktionen()) {
            System.out.println(eintrag);
        }

        System.out.println(sparkonto.getKontostand());

        }
}