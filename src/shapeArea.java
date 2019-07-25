//Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
//A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by 
//taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. 

public class shapeArea {
	int shapeArea(int n) {
	    int shape=0;
	    
	    if(n<=1){
	        return 1;
	    }
	    
	    if(n>=2){
	        for(int i = 0; i<n;i++){
	            shape = (n*n)+((n-1)*(n-1));
	        }
	    }
	    
	    return shape;
	}

}
