package ex5;


import Ex4.Etudiant;
import java.util.TreeMap;


public class TestCollectios {
    public static void main(String[] args) {
        
       
        TreeMap<Integer, Etudiant> mapTrie = new TreeMap<>();

        
        Etudiant e1 = new Etudiant(500, "Zineb");
        Etudiant e2 = new Etudiant(100, "Amira");
        Etudiant e3 = new Etudiant(300, "sokayna");

        
        mapTrie.put(e1.getMatricule(), e1);
        mapTrie.put(e2.getMatricule(), e2);
        mapTrie.put(e3.getMatricule(), e3);

        
        System.out.println("Liste des étudiants triée par matricule (TreeMap)");
        
       
        for (Etudiant e : mapTrie.values()) {
            System.out.println(e);
        }
        
        System.out.println("\nListe de tous les matricules présents : " + mapTrie.keySet());
    }
}