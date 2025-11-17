package src;

import java.util.ArrayList;

public class ListeExamen {
    private ArrayList<Examen> examens;

    public ListeExamen(ArrayList<Examen> examens) {
        this.examens = examens;
    }

    public ArrayList<Examen> getExamens() {
        return examens;
    }

    public void setExamens(ArrayList<Examen> examens) {
        this.examens = examens;
    }
}
