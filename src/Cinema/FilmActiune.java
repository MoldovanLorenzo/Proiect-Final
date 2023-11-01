package Cinema;

import java.util.ArrayList;

class FilmActiune extends Film {
    Regizor regizor;
    private int pret;
    private static ArrayList<Bilet> bilete = new ArrayList<>();
    private ArrayList<Integer> ratings = new ArrayList<>();
    private int nrspectatori = 0;

    public FilmActiune(String titlu, int durata, Regizor regizor) {
        super(titlu, durata);
        this.regizor=regizor;

    }

    public FilmActiune(String titlu,int durata,String numeRegizor,String prenumeRegizor,int varstaRegizor,int pret)
    {
        super(titlu,durata);
        this.regizor= new Regizor(numeRegizor, prenumeRegizor, varstaRegizor);
        this.pret = pret;
    }

    public void setRating(int rating) {
        ratings.add(rating);
    }
    

    public double getRating()
    {
        if (ratings.isEmpty()) {
            return 0;
        }
    
        int sumaRatinguri = 0;
        for (int rating : ratings) {
            sumaRatinguri += rating;
        }
        return (double) sumaRatinguri / ratings.size();
    }
    
    public void addBilet(Bilet bilet) {
        bilete.add(bilet);
        nrspectatori++;
    }
    public int getNrSpectatori()
    {
        return nrspectatori;
    }
    @Override
    public ArrayList<Bilet> getBilete() {
        return bilete;
    }

    @Override
    public String afiseazaInformatii() {
        return super.getTitlu() + ", filmul are o durata de " + super.getDurata() + " minute, si este regizat de " + regizor;

    }
}