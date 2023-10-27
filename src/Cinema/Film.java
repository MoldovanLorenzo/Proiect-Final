package Cinema;
public abstract class Film implements Vizualizabil {
    String titlu;
    int durata;

    public Film(String titlu, int durata) {
        this.titlu = titlu;
        this.durata = durata;
    }

    public abstract void afiseazaInformatii();
}
