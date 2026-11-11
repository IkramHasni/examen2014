package examen2014;

public class Personne {
      private int age;
      int taille;
      String nom;
      public Personne(String nom,int age ,int taille) {
    	  this.age=age;
    	  this.taille=taille;
    	  this.nom=nom;
      }
      public int getAge() {
    	  return age;
      }
}
