package fr.western.tp;

public class Launcher {
    public static void main(String[] args) {
        Humain roger = new Humain("roger","kombucha");
        roger.sePresenter();
        roger.boire();
    }
}
