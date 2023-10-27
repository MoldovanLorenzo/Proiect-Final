package Cinema;
class Bilet {
    Spectator spectator;
    Film film;
    int pret;

    public Bilet(Spectator spectator, Film film, int pret) {
        this.spectator = spectator;
        this.film = film;
        this.pret = pret;
    }

    public void afiseazaInformatii() {
        System.out.println("Detalii Bilet:");
        spectator.afiseazaInformatii();
        System.out.println("Pret Bilet: " + pret + " RON");
        film.afiseazaInformatii();
    }
}