package ma.education.tp1.heritagePersonne;

public class Personne {
    String nom;

    public static void main(String[] args) {
        Personne p1 = new Etudiant(10);
        Personne p2 = new Professeur(5000);
        Personne p3 = new Personne();
        //Etudiant e1 = new Professeur();
        //Professeur p4 = new Etudiant();
        Etudiant e2 = (Etudiant) p1;
        Professeur p5 = (Professeur) p2;

        System.out.println(((Etudiant) p1).note);
        System.out.println(e2.note);
        System.out.println(((Professeur) p2).salaire);
        System.out.println(p5.salaire);
    }
}
