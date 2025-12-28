package tp3;

public class TestList {

	    public static void main(String[] args) {

	    	 java.util.ArrayList<Personne> liste = new java.util.ArrayList<>();


	        liste.add(new Personne("Zineb", 25));
	        liste.add(new Personne("Sara", 20));
	        liste.add(new Personne("hafsa", 30));
	        liste.add(new Personne("karim", 22));
	        liste.add(new Personne("hamza", 28));

	       
	        System.out.println("Liste non triée :");
	        for (Personne p : liste) {
	            System.out.println(p);
	        }

	        
	        java.util.Collections.sort(liste);

	        System.out.println("\nListe triée par âge croissant :");
	        for (Personne p : liste) {
	            System.out.println(p);
	        }

	        
	        Personne personneRecherchee = new Personne("Sara", 20);
	        System.out.println("Sara existe dans la liste ? " + liste.contains(personneRecherchee));

	        
	        liste.remove(personneRecherchee);

	     
	        System.out.println("\nListe après suppression :");
	        for (Personne p : liste) {
	            System.out.println(p);
	        }
	    }
	}


