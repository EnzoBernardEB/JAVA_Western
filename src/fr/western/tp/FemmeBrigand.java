package fr.western.tp;

import java.util.ArrayList;
import java.util.List;

public class FemmeBrigand extends Dame implements HorsLaLoi{
    private int recompence;
    private boolean esEnPrison=false;
    private List<Dame> damesKidnappe = new ArrayList<Dame>();
    private int nombreDameEnleve;


    public FemmeBrigand(String nom, String couleurDeLaRobe) {
        super(nom, couleurDeLaRobe);
        this.recompence = 100;
    }

    public FemmeBrigand(String nom, String boissonFavorite, String couleurDeLaRobe, int recompence) {
        super(nom, boissonFavorite, couleurDeLaRobe);
        this.recompence = recompence;
    }

    @Override
    public void kidnapper(Dame dame) {
        if(this.damesKidnappe.contains(dame)) {
            System.out.println("Déja kidnapper !");
        } else {
            System.out.println("HAHA "+dame.getNom()+",tu es mienne désormais !");
            this.damesKidnappe.add(dame);
            this.nombreDameEnleve++;
            dame.setEsEnleve(true);
        }
    }

    @Override
    public int getRecompence() {
        return this.recompence;
    }

    @Override
    public void setEsEnPrison(boolean esEnPrison) {
        this.esEnPrison = esEnPrison;
    }
}
