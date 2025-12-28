package ex2;

public class Contact {
	    private String nom;
	    private String telephone;

	    public Contact(String nom, String telephone) {
	        this.nom = nom;
	        this.telephone = telephone;
	    }

	   
	    public String getNom() { 
	    	  return nom; 
	    	}
	    public void setNom(String nom) { 
	    	  this.nom = nom;
	    	}
	    public String getTelephone() { 
	    	 return telephone;
	    	 }
	    public void setTelephone(String telephone) { 
	    	this.telephone = telephone; 
	    	}

	
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null ) return false;
	        Contact contact = (Contact) o;
	        return java.util.Objects.equals(nom, contact.nom);
	    }

	    @Override
	    public int hashCode() {
	        return java.util.Objects.hash(nom);
	    }

	    @Override
	    public String toString() {
	        return nom + " : " + telephone;
	    }
	}

