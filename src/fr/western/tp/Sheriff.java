package fr.western.tp;

public class Sheriff extends Cowboy{
    private int NombreBrigandEmprisonne=42;

    public Sheriff(String nom) {
        super(nom);
    }

    public int getNombreBrigandEmprisonne() {
        return NombreBrigandEmprisonne;
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("J'ai déja arreté "+getNombreBrigandEmprisonne()+" méchants héhé !");
    }

    public void rechercher(Brigand brigand) {
        System.out.println("Oyez oyez brave gueux !!"+brigand.getRecompence()+"$ à qui arretera "+brigand.donnerNom()+" MORT OIU VIF !");
    }

    public String donnerNom(){
        return ("Sheriff "+this.getNom());
    }

}
