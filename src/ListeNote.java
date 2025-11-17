package src;

import java.time.Instant;
import java.util.ArrayList;

public class ListeNote {
    private ArrayList<Note> notes;

    public ListeNote(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

   public double getExamGrade(Examen exam, Etudiants etudiant1, Instant t){
   for(int i = 0; i<notes.size(); i++){
    Note note = notes.get(i);
  if(note.getExamen().equals(exam)&&note.getEtudiant().equals(etudiant1)){
        for(Object o: note.getHistorique()){
            Object[] tableau = (Object[]) o;
            for(int j = 0; j<tableau.length; j++){
                if(tableau[j].equals(t)){
                return (Double) tableau[0] ;
                }
            }
        }
  }
   }
   return 0;
    };

    public double getCourseGrade(Cours cours, Etudiants etudiant2, Instant t){
        double number=0;
        double total=0;
        for(int i = 0; i<notes.size(); i++){
            Note note = notes.get(i);
            if(note.getExamen().getCours().equals(cours)&&note.getEtudiant().equals(etudiant2)){
                for(Object o: note.getHistorique()){
                    Object[] tableau = (Object[]) o;
                    for(int j = 0; j<tableau.length; j++){
                        if(tableau[j].equals(t)){
                            total+=note.getExamen().getCoefficient();
                            number+= (Double) tableau[0]*note.getExamen().getCoefficient() ;
                        }
                    }
                }
            }
        }
        return number/total;
    }
}
