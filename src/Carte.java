public class Carte {
    double pret;
    String autor;
    String titlu;

    public double getPret(){
        return pret;
    }
    public String afiseaza(){
        return "Cartea "+titlu+" are ca autor "+autor;

    }
}
