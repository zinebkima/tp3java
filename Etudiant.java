package Ex4;

import java.util.ArrayList;
import java.util.Objects;

public class Etudiant {
    private int matricule;
    private String nom;
    private ArrayList<Double> notes;

    public Etudiant(int matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void addNote(double note) {
        notes.add(note);
    }

    public double calculerMoyenne() {
        if (notes.isEmpty()) return 0;
        double somme = 0;
        for (double n : notes) {
            somme += n;
        }
        return somme / notes.size();
    }

    public int getMatricule() {
        return matricule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return matricule == etudiant.matricule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }

    @Override
    public String toString() {
        return "Etudiant[" + matricule + "] " + nom + " (Moyenne: " + calculerMoyenne() + ")";
    }
}