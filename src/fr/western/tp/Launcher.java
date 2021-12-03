package fr.western.tp;

public class Launcher {
    public static void main(String[] args) {


        Brigand davido = new Brigand("davido","javel");
        Dame maximelle = new Dame("maximelle","lait","rouge");
        Cowboy bertrand = new Cowboy("bertrand","whisky");
        Barman quentin = new Barman("quentin", "[...Q]");
        Sheriff ajitzi = new Sheriff("ajitzi");
        Ripoux ajuro = new Ripoux("ajuro");
        Indien manon = new Indien("manon","Jus de racine",4);


//        davido.sePresenter();
//        maximelle.sePresenter();
//        bertrand.sePresenter();
//        quentin.sePresenter();
//        quentin.servir(bertrand);
//        ajitzi.sePresenter();
//        ajitzi.rechercher(davido);
        manon.sePresenter();
        manon.scalper(quentin);



//        davido.kidnapper(maximelle);
//        bertrand.delivrer(maximelle,davido);
    }
}
