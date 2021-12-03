package fr.western.tp;

import java.util.List;

public class Brigand extends Humain {

    private List<Dame> damesKidnappe;

    public Brigand(String nom){
        super(nom);
    }
    public Brigand(String nom, String boissonFavorite){
        super(nom,boissonFavorite);
    }

    public List<Dame> getDamesKidnappe() {
        return damesKidnappe;
    }


    public void kidnapper(Dame dame) {
        if(this.damesKidnappe.contains(dame)) {
            System.out.println(("Déja kidnapper !");
        } else {
            this.damesKidnappe.add(dame);
            dame.setEsEnleve(true);
        }
    }
}
