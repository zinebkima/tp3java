package ex3;

public class TestSet {

    public static void main(String[] args) {
       
        java.util.Set<Personne> hashSet = new java.util.HashSet<>();
        java.util.Set<Personne> treeSet = new java.util.TreeSet<>();

        Personne p1 = new Personne("zineb", 25);
        Personne p2 = new Personne("hamza", 30);
        Personne p3 = new Personne("hafsa", 20);
        Personne p4 = new Personne("karim", 25); 
        Personne p5 = new Personne("soka", 22);

        Personne[] personnes = {p1, p2, p3, p4, p5};

        for (Personne p : personnes) {
            hashSet.add(p);
            treeSet.add(p);
        }

        System.out.println("HashSet (Ordre de hachage)");
        for (Personne p : hashSet) {
            System.out.println(p);
        }

        System.out.println(" TreeSet (Ordre naturel : âge) ");
        for (Personne p : treeSet) {
            System.out.println(p);
        }

        
        java.util.Comparator<Personne> nomDecroissant = new java.util.Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return p2.getNom().compareTo(p1.getNom());
            }
        };

        java.util.TreeSet<Personne> treeSetTrie = new java.util.TreeSet<>(nomDecroissant);
        treeSetTrie.addAll(hashSet);

        System.out.println("TreeSet (Ordre spécifique : nom décroissant)");
        for (Personne p : treeSetTrie) {
            System.out.println(p);
        }
    }
}