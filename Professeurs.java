import java.time.Instant;

public class Professeurs {
    private int id_professeur;
    private String nom;
    private String prenom;
    private Instant date_naissance;
    private String email;
    private String telephone;
    private String specialite;

    public Professeurs(int id_professeur, String nom, String prenom, Instant date_naissance, String email, String telephone, String specialite) {
        this.id_professeur = id_professeur;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
    }

    public int getId_professeur() {
        return id_professeur;
    }

    public void setId_tuteur(int id_professeur) {
        this.id_professeur = id_professeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Instant getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Instant date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
