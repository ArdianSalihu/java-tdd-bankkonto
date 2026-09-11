public class Kontoinhaber {

    String name;
    Bankkonto konto;

    public Kontoinhaber(String name) {
        this.name = name;
        this.konto = new Bankkonto();
    }

    public String getName() {
        return name;
    }

    public Bankkonto getKonto(){
        return konto;
    }
}
