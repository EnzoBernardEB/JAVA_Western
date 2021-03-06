package fr.western.tp;

public class Humain {
    private String Nom = "Jonh Doe";
    private String BoissonFavorite = "eau";

    public Humain(){}

    public Humain(String nom) {
        this.Nom = nom;
    }
    public Humain(String nom, String boissonFavorite) {
        this.Nom = nom;
        this.BoissonFavorite = boissonFavorite;
    }

    public String getNom() {
        return Nom;
    }

    public String getBoissonFavorite() {
        return BoissonFavorite;
    }

    public void parler(String texte) {
        System.out.println(getNom()+" - "+texte);
    }

    public void sePresenter() {
        System.out.println("Bonjour je suis "+this.getNom()+" et ma boisson préféré c'est -> "+this.getBoissonFavorite());
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+this.getBoissonFavorite()+" ! GLOUPS");
    }

    public String donnerNom(){
        return this.getNom();
    }

    public String donnerBoissonFavorite() {
        return this.getBoissonFavorite();
    }
}
