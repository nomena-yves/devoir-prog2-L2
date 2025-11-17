package src;

public class Cours {
    private int id_cours;
    private String label;
    private int credit;
    private Professeurs professeur;

    public Cours(int id_cours, String label, int credit, Professeurs professeur) {
        this.id_cours = id_cours;
        this.label = label;
        this.credit = credit;
        this.professeur = professeur;
    }

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Professeurs getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeurs professeur) {
        this.professeur = professeur;
    }
}
