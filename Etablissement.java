package Ex6;


import ex5.Groupe;
import java.util.*;

public class Etablissement {
    
    private TreeMap<String, Groupe> lesGroupes = new TreeMap<>();

    public void ajouterGroupe(String nom, Groupe g) {
        lesGroupes.put(nom, g);
    }

    
    public void chercherEtudiantGlobal(int matricule) {
        System.out.println("Recherche du matricule " + matricule + "...");
        for (Groupe g : lesGroupes.values()) {
           
            g.rechercherEtudiant(matricule);
        }
    }

    
    public void afficherGroupesParTaille() {
       
        List<Groupe> listeGroupes = new ArrayList<>(lesGroupes.values());

        
        Collections.sort(listeGroupes, new Comparator<Groupe>() {
            @Override
            public int compare(Groupe g1, Groupe g2) {
                return Integer.compare(g1.getNombreEtudiants(), g2.getNombreEtudiants());
            }
        });

        System.out.println("Groupes triés par effectif");
        for (Groupe g : listeGroupes) {
            System.out.println(g.getNomDuGroupe() + " : " + g.getNombreEtudiants() + " étudiants");
        }
    }
}