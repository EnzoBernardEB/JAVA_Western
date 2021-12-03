package fr.western.tp;

public class Dame extends Humain implements VisagePale{
    boolean esEnleve = false;
    private String CouleurDeLaRobe;
    private boolean esScalper=false;

    public Dame(String nom,String couleurDeLaRobe) {
        super(nom);
        this.CouleurDeLaRobe = couleurDeLaRobe;
    }

    public Dame(String nom, String boissonFavorite, String couleurDeLaRobe) {
        super(nom, boissonFavorite);
        this.CouleurDeLaRobe = couleurDeLaRobe;
    }

    public boolean isEsEnleve() {
        return esEnleve;
    }

    public String getCouleurDeLaRobe() {
        return CouleurDeLaRobe;
    }

    @Override
    public void setEsScalper(boolean esScalper) {
        this.esScalper = esScalper;
    }

    @Override
    public void scalp() {
        System.out.println("aie ma tête !");
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

    public String donnerNom(){
        return ("Miss "+this.getNom());
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("J'adore ma robe de couleur "+this.getCouleurDeLaRobe());
    }

}
