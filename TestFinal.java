
package Ex6;

import Ex4.Etudiant;
import ex5.Groupe;



public class TestFinal {
public static void main(String[] args) {
    Etablissement ecole = new Etablissement();
    
    Groupe g1 = new Groupe("Informatique");
    g1.ajouterEtudiant(101, new Etudiant(101, "zineb"));
    
    Groupe g2 = new Groupe("Maths");
    g2.ajouterEtudiant(202, new Etudiant(202, "Btissam"));
    g2.ajouterEtudiant(203, new Etudiant(203, "douaa"));

    ecole.ajouterGroupe("Info", g1);
    ecole.ajouterGroupe("Maths", g2);

    ecole.chercherEtudiantGlobal(202); 
    ecole.afficherGroupesParTaille();  
}
}