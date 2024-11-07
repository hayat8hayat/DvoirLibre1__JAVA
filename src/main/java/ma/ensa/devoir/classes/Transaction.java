package ma.ensa.devoir.classes;

import java.util.Date;

public final class Transaction {
    private final String type;
    private final Date timeStamp;
    private final String reference;
    private final Compte compteSource;
    private final Compte compteDest;

   
    public Transaction(Date timeStamp, String reference, Compte compteSource, Compte compteDest) {
        this.timeStamp = new Date(timeStamp.getTime());
        this.reference = reference;
        this.compteSource = compteSource;
        this.compteDest = compteDest;
        this.type = calculerType();
    }

    
    private String calculerType() {
        if (compteSource.getBanque().equals(compteDest.getBanque())) {
            return "VIRIN";
        } else if (compteSource.getBanque().getPays().equals(compteDest.getBanque().getPays())) {
            return "VIREST";
        } else {
            return "VIRCHAC";
        }
    }

   
    public String getType() { return type; }
    public Date getTimeStamp() { return new Date(timeStamp.getTime()); }
    public String getReference() { return reference; }
    public Compte getCompteSource() { return compteSource; }
    public Compte getCompteDest() { return compteDest; }
}
