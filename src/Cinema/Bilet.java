package Cinema;
public class Bilet {
    Spectator spectator;
     
    private static final int MAX_BILETE=20;

    public Bilet(Spectator spectator) {
        this.spectator = spectator;
    }
    public boolean cumparaBilete(int nrBilete)
    {
        if(nrBilete<=MAX_BILETE)
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
         
    }
}