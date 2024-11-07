package ma.ensa.devoir.classes;

public class Client {
    private final int numClient;
    private final String nom;
    private final String prenom;
    private final String adresse;
    private final String phone;
    private final String email;

    
    public Client(int numClient, String nom, String prenom, String adresse, String phone, String email) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
    }

    
    public int getNumClient() { return numClient; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getAdresse() { return adresse; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
}
