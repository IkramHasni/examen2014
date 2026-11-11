package examen2014;

public class test {
       
	 public static void main(String[] args) {

	        Personne p1 = new Personne("Ali", 20, 38);
	        Personne p2 = new Personne("Samir", 6, 36);
	        Personne p3 = new Personne("Samira",45,42);

	        ConditionAge c1 = new ConditionAge(12);
	        ConditionAge c2 = new ConditionAge(18);
	        
	        Attraction a1 = new Attraction("att1",10, c1);
	        Attraction a2 = new Attraction("att2", 20, c2);
	        Attraction a3= new Attraction("att3",40,c2);
	        
	        a1.utilise(p1);
	        a1.utilise(p3);
	        a2.utilise(p2);
	        a3.utilise(p3);
	      
	        ParcAttraction parc =new ParcAttraction("dahdah",3);
	        
	        parc.ajouteAttraction(a1);
	        parc.ajouteAttraction(a2);
	        parc.ajouteAttraction(a3);
	        
	        parc.affiche();
	 }
	
}
