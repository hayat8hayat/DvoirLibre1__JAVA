package ma.ensa.devoir.classes;

import java.util.Date;

public class Compte {
    private final int numCompte;
    private final Date dateCreation;
    private final Date dateUpdate;
    private final String devise;
    private final Client client;
    private final Banque banque;

   
    public Compte(int numCompte, Date dateCreation, Date dateUpdate, String devise, Client client, Banque banque) {
        this.numCompte = numCompte;
        this.dateCreation = new Date(dateCreation.getTime());
        this.dateUpdate = new Date(dateUpdate.getTime());
        this.devise = devise;
        this.client = client;
        this.banque = banque;
    }

    public int getNumCompte() { return numCompte; }
    public Date getDateCreation() { return new Date(dateCreation.getTime()); }
    public Date getDateUpdate() { return new Date(dateUpdate.getTime()); }
    public String getDevise() { return devise; }
    public Client getClient() { return client; }
    public Banque getBanque() { return banque; }
}
