package fr.western.tp;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cowboy extends Humain{
    public static List<Brigand> Prison;
    private int popularite=0;
    private String caracteristique = "vaillant";

    public Cowboy(String nom) {
        super(nom);
    }

    public Cowboy(String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
    }

    public String getCaracteristique() {
        return caracteristique;
    }

    public void delivrer(Dame dame, Brigand brigand) {
        System.out.println("Vous volez a la rescousse de la dame "+dame.getNom());
        boolean choix = choixBinaire("Voulez tirer sur le brigand pour tenter de le capturer et délivrer la dame ? (y/n)","","");
        if(choix == true) {
            Random random  = new Random();
            int probabiliteToucheCible = random.nextInt(2);
            if(probabiliteToucheCible == 1) {
                tirer(brigand);
                System.out.println("Bravo, vous l'avez touché, vous l'emprisonné ensuite, CHEH !");
                this.emprisonner(brigand);
            } else {
                System.out.println("Vous avez raté le brigand ! il s'est échappé.");
                System.out.println("Vous liberé la dame "+dame.getNom()+" tout en flattant ses chevilles.");
            }
        }
        dame.setEsEnleve(false);
        this.popularite++;
    }

    private void tirer(Brigand brigand) {
        System.out.println("Le +"+this.getCaracteristique()+" "+this.getNom()+" tire sur "+brigand.getNom()+". PAN !");
        System.out.println("Prend ça, rascal !");
    }



    private void emprisonner(Brigand brigand) {
        if(this.Prison.contains(brigand)) {
            System.out.println("Déja capturé");
        } else {
            System.out.println("Damned, je suis fait !"+this.getNom()+", tu m'as eu !");
            brigand.setEsEnPrison(true);
            this.Prison.add(brigand);
            choixBinaire("Voulez vous afficher la récompence pour cette capture ? (y/n)","La récompence est de "+brigand.getRecompence()+"$","");
        }
    }

    public static boolean choixBinaire(String proposition, String reponseY,String reponseN) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(proposition);
        while (true) {
            String reponse = scanner.next();
            if(reponse.equalsIgnoreCase("y")) {
                System.out.println(reponseY);
                scanner.close();
                return true;
            } else if (reponse.equalsIgnoreCase("n")){
                System.out.println(reponseN);
                scanner.close();
                return false;
            }
        }
    }
}
