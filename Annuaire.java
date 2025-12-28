package ex2;

public class Annuaire {
	   
	    private java.util.Map<String, Contact> contacts = new java.util.HashMap<>();

	    public void ajouter(String nom, String tel) {
	        contacts.put(nom, new Contact(nom, tel));
	    }

	    public void rechercher(String nom) {
	        Contact c = contacts.get(nom);
	        if (c != null) {
	            System.out.println("Trouvé : " + c);
	        } else {
	            System.out.println("Aucun contact au nom de " + nom);
	        }
	    }

	    public void supprimer(String nom) {
	        contacts.remove(nom);
	        System.out.println("Contact " + nom + " supprimé.");
	    }

	    public void afficherTrie() {
	        
	        java.util.TreeMap<String, Contact> trie = new java.util.TreeMap<>(contacts);
	        System.out.println("Liste des contacts (Ordre alphabétique)");
	        for (Contact c : trie.values()) {
	            System.out.println(c);
	        }
	    }

	    public static void main(String[] args) {
	        Annuaire monAmi = new Annuaire();
	        
	       
	        monAmi.ajouter("Zineb", "0601");
	        monAmi.ajouter("Amine", "0602");
	        monAmi.ajouter("basma", "0603");
	        monAmi.ajouter("Manal", "0604");
	        monAmi.ajouter("Adam", "0605");

	        monAmi.rechercher("zineb");
	        monAmi.supprimer("Manal");
	        monAmi.afficherTrie();
	    }
	}

