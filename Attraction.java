package examen2014;

public class Attraction {
     String nom;
     float cout;
     ConditionAge condition;
     int nbP=0;
     float recette=0;
     public Attraction(String nom, float cout, ConditionAge condition) {
    	 this.nom=nom;
    	 this.cout=cout;
    	 this.condition=condition;
     }
     public void affiche() {
         System.out.println("Nom : " + nom+"\n Cout : " + cout);
         System.out.println("Age minimum : " + condition.getAgeMin()+" Nombre de personnes : " + nbP);
         System.out.println("Recette : " + recette);
     }

    public void utilise(Personne p) {
      if (condition.accesPossible(p)==true) {
        nbP++;
        recette =recette+cout;
      }
     else {
        System.out.println("Accès interdit !");
    }
}
	
}
