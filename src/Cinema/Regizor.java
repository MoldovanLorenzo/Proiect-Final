package Cinema;

public class Regizor {
    private String nume;
    private String prenume;
    private int varsta;

    public Regizor(String nume,String prenume,int varsta)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }
    @Override
    public String toString()
    {
        return nume+ " "+prenume+ " "+varsta;
    }
}
