package fr.western.tp;

public class Dame extends Humain{
    boolean esEnleve = false;
    private String CouleurDeLaRobe;

    public Dame(String nom) {
        super(nom);
    }

    public Dame(String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
    }

    public boolean isEsEnleve() {
        return esEnleve;
    }

    public void setEsEnleve(boolean esEnlever) {
        if(esEnlever == true) {
            System.out.println("AHH OS Et COURT !");
            this.esEnleve = esEnlever;
        } else {
            System.out.println("Merci Homme qui sent le foin !");
            this.esEnleve = esEnlever;
        }
    }

    public void changerDeRobe(String couleur) {
        System.out.println("Regarder ma nouvelle robe "+couleur);
    }

}
