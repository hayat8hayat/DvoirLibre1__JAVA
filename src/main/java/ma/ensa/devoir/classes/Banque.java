package ma.ensa.devoir.classes;

public class Banque {
    private final int id;
    private final String pays;

    
    public Banque(int id, String pays) {
        this.id = id;
        this.pays = pays;
    }

    public int getId() { return id; }
    public String getPays() { return pays; }
}
