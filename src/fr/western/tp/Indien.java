package fr.western.tp;

public class Indien extends Humain{
    private String Totem = "coyotte";
    private int NombreDePlume;

    public Indien(String nom,String boisson,int nombreDePlume) {
        super(nom,boisson);
        this.NombreDePlume = nombreDePlume;
    }
    public Indien(String nom,String boisson,int nombreDePlume,String totem) {
        super(nom,boisson);
        this.NombreDePlume = nombreDePlume;
        this.Totem = totem;
    }

    public String getTotem() {
        return Totem;
    }

    public int getNombreDePlume() {
        return NombreDePlume;
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("J'ai "+this.getNombreDePlume()+" plumes ! (héhé) et mon totem c'est -> "+this.getTotem()+"Ugh !");
    }

    public void scalper(VisagePale cible) {
        System.out.println("Nouvelle plume pour moi UHG !");
        cible.setEsScalper(true);
        this.NombreDePlume++;
        cible.scalp();
    }
}
