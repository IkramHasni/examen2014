package examen2014;

public class ConditionAge implements ConditionAcces {
        private int ageMin;
	    public ConditionAge(int ageMin) {
	    	this.ageMin=ageMin;
	    }
	    
	    public boolean accesPossible(Personne p) {
	        if(p.getAge()>ageMin) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }
	    public int getAgeMin() {
	    	return ageMin;
	    }
	
}
