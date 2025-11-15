import java.time.Instant;
import java.time.LocalDate;

public class Etudiants {
    private int id_Etudiant;
    private String nom;
    private String prenom;
    private Instant date_naissance;
    private String email;
    private String telephone;
    private Tuteurs tuteur;

    public Etudiants(int id_Etudiant, String nom, String prenom, Instant date_naissance, String email, String telephone, Tuteurs tuteur) {
        this.id_Etudiant = id_Etudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.email = email;
        this.telephone = telephone;
        this.tuteur = tuteur;
    }

    public int getId_Etudiant() {
        return id_Etudiant;
    }

    public void setId_tuteur(int id_Etudiant) {
        this.id_Etudiant = id_Etudiant;
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

    public Tuteurs getTuteur() {
        return tuteur;
    }

    public void setTuteur(Tuteurs tuteur) {
        this.tuteur = tuteur;
    }
}
