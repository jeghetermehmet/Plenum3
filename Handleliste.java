import java.util.ArrayList;

public class Handleliste {
    public static void main(String [] args) {
        ArrayList<Vare> handleliste = new ArrayList<>();

        Datamaskin maskin = new Datamaskin(10_000, 20, 2, 32, "HP", 0.8);
        Frukt frukt = new Frukt(20, 10, "Appelsin");
        Godteri sjokolade = new Godteri(40, 3, "Mørk sjokolade");
        Godteri surt = new Godteri(100, 2, "Sure føtter", 2);

        handleliste.add(maskin);
        handleliste.add(frukt);
        handleliste.add(sjokolade);
        handleliste.add(surt);

        double totalPris = 0;

        for (Vare vare : handleliste) {
            totalPris += vare.beregnFullPris();
            if (vare instanceof Matvare) {
                Matvare matvare = (Matvare) vare;

                if (matvare.erNokkelhullsmerket()) 
                    System.out.println(matvare.hentNavn() + " er nøkkelhullsmerket!");
                else 
                    System.out.println(matvare.hentNavn() + " er IKKE nøkkelhullsmerket! Styr unna!");
                    
            }

            System.out.println();
        }

        System.out.println("Totalpris for handelista: " + totalPris + " kr");

    }
}
    

