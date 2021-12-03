package fr.western.tp;

public class Launcher {
    public static void main(String[] args) {
        Humain roger = new Humain("roger","kombucha");
        roger.sePresenter();
        roger.boire();

        Brigand davido = new Brigand("bertrand","javel");
        Dame maximelle = new Dame("maximelle","lait");
        Cowboy bertrand = new Cowboy("bertrand","whisky");

        davido.kidnapper(maximelle);
        bertrand.delivrer(maximelle,davido);
    }
}
