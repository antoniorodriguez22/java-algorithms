//Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.


public class adjacentElementsProduct {
	
	int adjacentElementsProduct(int[] inputArray) {
	    int adjacentMultiply;
	    int[] resultArray= new int[10];
	    int result =-1001;
	    
	    for(int i=0; i<inputArray.length-1;i++){
	         adjacentMultiply = inputArray[i]*inputArray[i+1];
	         resultArray[i]=adjacentMultiply;
	         if(result<resultArray[i]){
	             result =resultArray[i];
	         }
	        
	    }
	    
	    
	    return result;
	}

}
