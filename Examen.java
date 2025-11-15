import java.time.Instant;

public class Examen {
    private int id_examen;
    private String nom_examen;
    private Cours cours;
    private Instant date_examen;
    private int coefficient;

    public Examen(int id_examen, String nom_examen, Cours cours, Instant date_examen, int coefficient) {
        this.id_examen = id_examen;
        this.nom_examen = nom_examen;
        this.cours = cours;
        this.date_examen = date_examen;
        this.coefficient = coefficient;
    }

    public int getId_examen() {
        return id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public String getNom_examen() {
        return nom_examen;
    }

    public void setNom_examen(String nom_examen) {
        this.nom_examen = nom_examen;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Instant getDate_examen() {
        return date_examen;
    }

    public void setDate_examen(Instant date_examen) {
        this.date_examen = date_examen;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
