package Cinema;
class Spectator implements Vizualizabil {
    private static Spectator instance = null;
    String numeSpectator;
    int varsta;

    private Spectator() {
        this.numeSpectator = "Nedeterminat";
        this.varsta = 0;
    }

    public static Spectator getInstance() {
        if (instance == null) {
            instance = new Spectator();
        }
        return instance;
    }

    public void setNumeSpectator(String numeSpectator) {
        this.numeSpectator = numeSpectator;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afiseazaInformatii() {
        System.out.println("Nume Spectator: " + numeSpectator);
        System.out.println("Varsta Spectator: " + varsta);
    }
}
