import java.time.Instant;
import java.time.LocalDate;

public class Tuteurs {
    private int id_tuteur;
    private String nom;
    private String prenom;
    private Instant date_naissance;
    private String email;
    private String telephone;
    private String description_lien;

    public Tuteurs(int id_tuteur, String nom, String prenom, Instant date_naissance, String email, String telephone, String description_lien) {
        this.id_tuteur = id_tuteur;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.email = email;
        this.telephone = telephone;
        this.description_lien = description_lien;
    }

    public int getId_tuteur() {
        return id_tuteur;
    }

    public void setId_tuteur(int id_tuteur) {
        this.id_tuteur = id_tuteur;
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

    public String getDescription_lien() {
        return description_lien;
    }

    public void setDescription_lien(String description_lien) {
        this.description_lien = description_lien;
    }
}
