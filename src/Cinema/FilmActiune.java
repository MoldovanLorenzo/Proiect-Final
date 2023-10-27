package Cinema;
class FilmActiune extends Film {
    String regizor;

    public FilmActiune(String titlu, int durata, String regizor) {
        super(titlu, durata);
        this.regizor = regizor;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Titlu: " + titlu);
        System.out.println("Durata: " + durata + " minute");
        System.out.println("Regizor: " + regizor);
    }
}