import java.util.ArrayList;

public class Note {
    private Etudiants etudiant;
    private Examen examen;
    private double note;
    private ArrayList<Object[]> historique;

    public Note(Etudiants etudiant, Examen examen, double note) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.note = 0;
        this.historique = new ArrayList<>();
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public ArrayList<Object[]> getHistorique() {
        return historique;
    }

    public void setHistorique(ArrayList<Object[]> historique) {
        this.historique = historique;
    }
}
