package Cinema;
public class Bilet {
    Spectator spectator;
    Film film;
    private int pret;
    private static final int MAXBILETE=20;

    public Bilet(Spectator spectator, Film film, int pret) {
        this.spectator = spectator;
        this.film = film;
        this.pret = pret;
    }
    public boolean cumparaBilete(int nrBilete)
    {
        if(nrBilete<=MAXBILETE)
        {
            System.out.println("ati cumparat"+ nrBilete);
             return true;
        }
        else
        {    System.out.println("numarul este mai mare decat ai voie sa cumperi");
             return false;
        }
    }
    public void afiseazaInformatii() {
        System.out.println("Detalii Bilet:");
        spectator.afiseazaInformatii();
        System.out.println("Pret Bilet: " + pret + " RON");
        film.afiseazaInformatii();
    }
}