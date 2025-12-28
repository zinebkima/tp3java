package ex3;

public class Personne implements Comparable<Personne>{
	   private String nom;
	   private int age;
	   public Personne(String name,int age) {
		    this.nom=name;
		    this.age=age;
	   }
	   public  String getNom() {
		   return nom;
	   }
	   public int getAge() {
		   return age;
	   }
	   @Override
	    public boolean equals(Object obj) {
		   if(this==obj) return true;
		   if(!(obj instanceof Personne)) return false;
		   Personne personne=(Personne) obj;
		   return this.age==personne.age && this.nom.equals(personne.nom);
		  
	   }
	   
	   @Override
	   public int hashCode() {
	       int result = 17;
	       result = 31 * result + age;
	       result = 31 * result + (nom == null ? 0 : nom.hashCode());
	       return result;
	   }

	   
	   @Override
	   public int compareTo(Personne other) {
	       return this.age - other.age; 
	   }

	   
	   @Override
	   public String toString() {
	       return nom + "(" + age + " ans)";
	   } 

}
