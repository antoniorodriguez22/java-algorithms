//Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, 
//the second - from the year 101 up to and including the year 200, etc.

public class centuryFromYear {

	int centuryFromYear(int year) {
	    double century = 0;
	    
	    century = Math.ceil((year+99)/100);
	    int century2 = (int)century;
	    	    
	    return century2;

	}
}
