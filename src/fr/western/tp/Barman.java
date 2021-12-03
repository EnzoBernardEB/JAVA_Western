package fr.western.tp;

public class Barman extends Humain implements VisagePale{
    private boolean esScalper=false;
    public String nomDuBar;

    public Barman(String nom) {
        super(nom);
        this.nomDuBar = "Chez "+nom;
    }

    public Barman(String nom, String nomDuBar){
        super(nom);
        this.nomDuBar = nomDuBar;
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("Bienvenue dans mon bar ! Le "+this.nomDuBar +" mon petit coco");
    }

    @Override
    public void setEsScalper(boolean esScalper) {
        this.esScalper = esScalper;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête coco !");
    }

    public void servir(Humain client){
        System.out.println(this.getNom()+" sert du "+client.getBoissonFavorite()+" a "+client.getNom());
        System.out.println("et voila un "+client.getBoissonFavorite()+" pour mon petit coco !");
    }
}
