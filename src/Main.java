public class Main {
    public static void main(String[] args) {
        {
            Carte carte1 = new Carte(); // cuvantul cheie new se foloseste la crearea/instantierea obiectelor
            carte1.autor = "Mihai Eminescu";
            carte1.titlu = "Poezii";
            carte1.pret = 35.00;

            Carte carte2 = new Carte();
            carte2.autor = "Ion Creanga";
            carte2.titlu = "Amintiri din copilarie";

            System.out.println(carte1.pret);
            System.out.println(carte2.pret);

            System.out.println(carte1.getPret());
            System.out.println(carte1.afiseaza());

            carte1.titlu = "Basme";
            System.out.println(carte1.afiseaza());
            Animal animal1 = new Animal();
            Animal animal2 = new Animal("Azorel");
            Animal animal3 = new Animal("Pisi", "maro");
            Animal animal4 = new Animal("Nemo", "rosu", true);

            animal1.mananca();
            animal2.doarme();
            animal3.mananca();
            animal4.doarme();
            //animal4.nume="Nemo2";

            System.out.println(animal4.afiseaza());
            System.out.println(animal3.afiseaza());

            Elev elev1 = new Elev("Popescu");
            Elev elev2 = new Elev("Ionescu");
            System.out.println(elev1.nume);
            System.out.println(elev2.nume);
            elev1.diriginte = "Isoscel2";
            System.out.println(elev2.diriginte);

            elev1.metodaNonStatica();
            Elev.metodaStatica();

        }


    }
}