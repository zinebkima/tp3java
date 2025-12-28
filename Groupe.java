package ex5;

import Ex4.Etudiant;
import java.util.HashMap;
import java.util.Map;

public class Groupe {
    private String nomDuGroupe;
    private Map<Integer, Etudiant> membres = new HashMap<>();

    public Groupe(String nom) {
        this.nomDuGroupe = nom;
    }

   
    public int getNombreEtudiants() {
        return membres.size(); 
    }

    
    public String getNomDuGroupe() {
        return nomDuGroupe;
    }

    public void ajouterEtudiant(int matricule, Etudiant e) {
        membres.put(matricule, e);
    }
    public void rechercherEtudiant(int matricule) {
        Etudiant e = membres.get(matricule);
        if (e != null) {
            System.out.println("Trouvé dans " + nomDuGroupe + " : " + e);
        } else {
            System.out.println("Aucun étudiant avec le matricule " + matricule);
        }
    }

    public void supprimerEtudiant(int matricule) {
        membres.remove(matricule);
        System.out.println("Matricule " + matricule + " supprimé.");
    }
}