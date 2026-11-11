package examen2014;

public class ParcAttraction {
     Attraction [] lesAttraction;
     int taille;
     String nom;
     int nb_attraction=0;
     public ParcAttraction(String nom, int taille) {
    	   this.nom=nom;
    	   this.taille=taille;
    	   lesAttraction= new Attraction[taille];
     }
     public void ajouteAttraction(Attraction a) {
    	 if (nb_attraction<taille) {
    		 lesAttraction[nb_attraction]=a;
    		 nb_attraction++;
    	 }
    	 else {
    		 System.out.println("tableau complet");
    	 }
     }
     public float getRecette() {
    	 float somme=0;
    	 for(int i=0;i<nb_attraction;i++) {
    		 somme=somme+lesAttraction[i].recette;
    	 }
    	 return somme;
     }
     public void affiche() {
    	 System.out.println("nom de parc :"+nom);
    	 for(int i=0;i<nb_attraction;i++) {
    	      lesAttraction[i].affiche();
    	 }
    	 System.out.println("Recette totale du parc : " + getRecette());
     }
     
      
      
}
