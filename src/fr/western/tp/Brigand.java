package fr.western.tp;

import java.util.ArrayList;
import java.util.List;

public class Brigand extends Humain {

    private List<Dame> damesKidnappe = new ArrayList<Dame>();
    private int nombreDameEnleve;
    private int recompence =100;
    private boolean esEnPrison=false;

    public Brigand(){}
    public Brigand(String nom, int recompence){
        super(nom);
        this.recompence =recompence;
    }
    public Brigand(String nom, String boissonFavorite){
        super(nom,boissonFavorite);
    }

    public boolean isEsEnPrison() {
        return esEnPrison;
    }

    public void setEsEnPrison(boolean esEnPrison) {
        this.esEnPrison = esEnPrison;
    }

    public List<Dame> getDamesKidnappe() {
        return damesKidnappe;
    }

    public int getRecompence() {
        return recompence;
    }

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
}
