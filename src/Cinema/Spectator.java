package Cinema;
class Spectator implements Vizualizabil {
    private static Spectator instance = null;
     private String numeSpectator;

    private Spectator() {
        this.numeSpectator = "Nedeterminat";
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

    public String afiseazaInformatii() {
        return "Nume Spectator: " + numeSpectator;
    }
}
