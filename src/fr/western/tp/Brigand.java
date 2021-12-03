package fr.western.tp;

import java.util.ArrayList;
import java.util.List;

public class Brigand extends Humain implements HorsLaLoi,VisagePale {
    private boolean esScalper=false;
    private List<Dame> damesKidnappe = new ArrayList<Dame>();
    private int nombreDameEnleve;
    private int recompence =100;
    private boolean esEnPrison=false;
    private String look = "méchant";

    public Brigand(){}
    public Brigand(String nom,String boissonFavorite ,int recompence,String look){
        super(nom,boissonFavorite);
        this.recompence =recompence;
        this.look =look;
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

    public void setEsScalper(boolean esScalper) {
        this.esScalper = esScalper;
    }

    @Override
    public void scalp() {
        System.out.println("aie ma tete !");
    }

    public List<Dame> getDamesKidnappe() {
        return damesKidnappe;
    }

    public int getRecompence() {
        return recompence;
    }

    public String getLook() {
        return look;
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

    public String donnerNom(){
        return (this.getNom()+" le "+this.getLook());
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("j'ai l'air "+this.getLook()+" et j'ai kidnappé "+this.nombreDameEnleve +(this.nombreDameEnleve> 1 ?" dames." : "dame."));
        System.out.println("Ma tête est mise a prix pour "+this.getRecompence()+"$ !");
    }

}
