package Cinema;
public class FilmComedie extends Film{
 Regizor regizor;
 private int rating;

    public FilmComedie(String titlu, int durata, Regizor regizor,int rating) {
        super(titlu, durata);
        this.regizor=regizor;
        this.rating=rating;
    }
    public FilmComedie(String titlu,int durata,String numeRegizor,String prenumeRegizor,int varstaRegizor)
    {
        super(titlu,durata);
        this.regizor= new Regizor(numeRegizor, prenumeRegizor, varstaRegizor);
    }
    @Override
    public void afiseazaInformatii() {
        System.out.println("Titlu: " + super.getTitlu());
        System.out.println("Durata: " + super.getDurata()+ " minute");
        System.out.println("Rating: " + rating + "/10");
    }
}
