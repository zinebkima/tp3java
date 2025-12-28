package Ex4;

public class TestCollections {
	
	    public static void main(String[] args) {
	      
	        java.util.LinkedList<Etudiant> liste = new java.util.LinkedList<>();

	       
	        Etudiant e1 = new Etudiant(101, "zineb");
	        e1.addNote(15);
	        e1.addNote(17);
	        Etudiant e2 = new Etudiant(102, "Basma"); 
	        e2.addNote(10); 
	        e2.addNote(12);
	        Etudiant e3 = new Etudiant(103, "hamza");
	        e3.addNote(18);
	        Etudiant e4 = new Etudiant(104, "amine"); 
	        e4.addNote(8);
	        Etudiant e5 = new Etudiant(101, "hafsa");

	        liste.add(e1);
	        liste.add(e2);
	        liste.add(e3);
	        liste.add(e4);
	        liste.add(e5);

	        System.out.println(" Contenu de la LinkedList (Ordre respecté, doublons admis)");
	        for (Etudiant e : liste) System.out.println(e);

	        
	        java.util.Set<Etudiant> ensemble = new java.util.HashSet<>(liste);

	        System.out.println("\n Contenu du HashSet (Ordre aléatoire, pas de doublons)");
	        for (Etudiant e : ensemble) System.out.println(e);
	    }
	}

