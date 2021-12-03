package fr.western.tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cowboy extends Humain implements VisagePale{
    private boolean esScalper=false;
    public static List<HorsLaLoi> Prison = new ArrayList<HorsLaLoi>();
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

    public int getPopularite() {
        return popularite;
    }

    @Override
    public void setEsScalper(boolean esScalper) {
        this.esScalper = esScalper;
    }

    @Override
    public void scalp() {
        System.out.println("aie ma tete !");
    }

    public void delivrer(Dame dame, Brigand brigand) {
        System.out.println(this.getNom()+" vole a la rescousse de la dame "+dame.getNom());
        boolean choix = choixBinaire(this.getNom()+",voulez tirer sur le brigand pour tenter de le capturer en plus de délivrer la dame ? (y/n)");
        if(choix == true) {
            Random random  = new Random();
            int probabiliteToucheCible = random.nextInt(2);
            if(probabiliteToucheCible == 1) {
                tirer(brigand);
                System.out.println("Bravo, vous l'avez touché, vous l'emprisonné ensuite, CHEH !");
                this.emprisonner(brigand);
                afficheEtAugmenterPopularite();
            } else {
                System.out.println("Vous avez raté le brigand ! il s'est échappé.");
                System.out.println("Vous liberé la dame "+dame.getNom()+" tout en flattant ses chevilles.");
                afficheEtAugmenterPopularite();
            }
        } else {
            System.out.println(this.getNom()+" laisse "+brigand.getNom()+"s'enfuir et libere la dame !");
            System.out.println("Hooo ma dame "+dame.getNom()+", vous etes sauf ! Vous allez pouvoir gambader avec vos si jolie jambes");
            dame.setEsEnleve(false);
            afficheEtAugmenterPopularite();
        }

    }

    private void afficheEtAugmenterPopularite() {
        this.popularite++;
        System.out.println("Popularité augmenté ! Niveau actuel : "+this.popularite);
    }

    private void tirer(Brigand brigand) {
        System.out.println("Le "+this.getCaracteristique()+" "+this.getNom()+" tire sur "+brigand.getNom()+". PAN !");
        System.out.println("Prend ça, rascal !");
    }



    private void emprisonner(HorsLaLoi brigand) {
        if(this.Prison.contains(brigand)) {
            System.out.println("Déja capturé");
        } else {
            System.out.println(brigand.donnerNom()+" - Damned, je suis fait ! "+this.getNom()+", tu m'as eu !");
            brigand.setEsEnPrison(true);
            this.Prison.add(brigand);
            boolean reponse = choixBinaire("Voulez vous afficher la récompence pour cette capture ? (y/n)");
            if(reponse ==true) {
                System.out.println("La recompence est de :"+brigand.getRecompence()+"$");
            }
        }
    }


    public static boolean choixBinaire(String proposition) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(proposition);
        boolean retour = false;
        while (scanner.hasNext()) {
            String reponse = scanner.next();
            if(reponse.equalsIgnoreCase("y")) {
                retour = true;
                break;
            } else if (reponse.equalsIgnoreCase("n")){
                retour = false;
                break;
            }
        }
        return retour;
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("On dit que je suis "+this.getCaracteristique());
        System.out.println("Mon niveau de popularité est de "+this.getPopularite());
    }

}
