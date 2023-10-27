package Cinema;
class FilmComedie extends Film {
    int rating;

    public FilmComedie(String titlu, int durata, int rating) {
        super(titlu, durata);
        this.rating = rating;
    }
    @Override
    public void afiseazaInformatii() {
        System.out.println("Titlu: " + titlu);
        System.out.println("Durata: " + durata + " minute");
        System.out.println("Rating: " + rating + "/10");
    }
}
