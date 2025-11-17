package src;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListeNoteTest {
    @Test
    void getListeNote(){
        Tuteurs Njiva=new Tuteurs(3,"RABEKOTO","Tolojanahary Niva", Instant.parse("2023-05-10T12:30:00Z"),"Njiva@gmail.com","0340468852","L oncle de l etidiant");
        Etudiants Nomena=new Etudiants(1,"RABEMANANJARA","Nomenjanahary Yves",Instant.parse("2005-05-10T12:30:00Z"),"Nomena@gmail.com","0320532218",Njiva);
        Professeurs Toky=new Professeurs(2,"Ramarozaka","Tokimahery",Instant.parse("1098-09-20T12:24:01Z"),"Toky@gmail.com","0371245678","Back-end");
        Cours Prog2=new Cours(4,"Prog2",6,Toky);
        Examen ExamenProg2 =new Examen(1,"Premiere Evaluation",Prog2,Instant.parse("2023-05-10T12:30:00Z"),6);
        Note note1=new Note(Nomena,ExamenProg2,12);
        //note1.changeLaNote(14.3,"ajouter le bonus");
        ArrayList<Note> notesList = new ArrayList<>();
        notesList.add(note1);
        ListeNote listeNote = new ListeNote(notesList);

        double noteExamen = listeNote.getExamGrade(ExamenProg2, Nomena, Instant.parse("2023-05-10T12:30:00Z"));
        System.out.println("Note de l'examen : " + noteExamen);
    }
@Test
    void getMoyenne(){
        Tuteurs Njiva=new Tuteurs(3,"RABEKOTO","Tolojanahary Niva", Instant.parse("2023-05-10T12:30:00Z"),"Njiva@gmail.com","0340468852","L oncle de l etidiant");
        Etudiants Nomena=new Etudiants(1,"RABEMANANJARA","Nomenjanahary Yves",Instant.parse("2005-05-10T12:30:00Z"),"Nomena@gmail.com","0320532218",Njiva);
        Professeurs Toky=new Professeurs(2,"Ramarozaka","Tokimahery",Instant.parse("1098-09-20T12:24:01Z"),"Toky@gmail.com","0371245678","Back-end");
        Cours Prog2=new Cours(4,"Prog2",6,Toky);
        Examen ExamenProg2 =new Examen(1,"Premiere Evaluation",Prog2,Instant.parse("2023-05-10T12:30:00Z"),6);
        Note note1=new Note(Nomena,ExamenProg2,12);
        note1.changeLaNote(14.3,"ajouter le bonus");
        ArrayList<Note> notesList = new ArrayList<>();
        notesList.add(note1);
        ListeNote listeNote = new ListeNote(notesList);
         double moyenneExam= listeNote.getCourseGrade(Prog2, Nomena, Instant.parse("2023-05-10T12:30:00Z"));
        System.out.println("moyenne de l'examen : " + moyenneExam);
    }
}