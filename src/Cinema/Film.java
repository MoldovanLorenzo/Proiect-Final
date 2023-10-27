package Cinema;
public abstract class Film implements Vizualizabil {
     private String titlu;
     private int durata;

    public Film(String titlu, int durata) {
        this.titlu = titlu;
        this.durata = durata;
    }
    public String getTitlu()
    {
        return titlu;
    }
    public int getDurata()
    {
        return durata;
    }

    public abstract void afiseazaInformatii();
}
