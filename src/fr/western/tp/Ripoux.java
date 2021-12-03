package fr.western.tp;

import java.util.ArrayList;
import java.util.List;

public class Ripoux extends Sheriff implements HorsLaLoi{
    private List<Dame> damesKidnappe = new ArrayList<Dame>();
    private int nombreDameEnleve;
    private boolean esEnPrison=false;

    public Ripoux(String nom) {
        super(nom);
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
        System.out.println("Je suis sheriff moi, je vais te faire pendre");
        return 0;
    }

    @Override
    public void setEsEnPrison(boolean esEnPrison) {
        this.esEnPrison = esEnPrison;
    }
}
