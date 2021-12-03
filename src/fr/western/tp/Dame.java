package fr.western.tp;

public class Dame extends Humain{
    boolean esEnleve = false;

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
        this.esEnleve = esEnlever;
    }

}
