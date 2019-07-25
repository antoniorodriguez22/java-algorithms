//Given a sequence of integers as an array, determine whether it is possible to obtain
//a strictly increasing sequence by removing no more than one element from the array.

//Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. 
//Sequence containing only one element is also considered to be strictly increasing.

//ALGORITHM STILL IN DEVELOPMENT. DOES NOT WORK IN A FEW TEST CASES WHERE LISTS ARE PARTIALLY SORTED.


public class almostIncreasingSequence {
	boolean almostIncreasingSequence(int[] sequence) {
	      
	      int count = 0;
	      boolean result = false;
	     
	      for(int i = 1; i<sequence.length; i++){
	            
	            if(i==1){
	                  if(sequence[i]<sequence[i-1] || sequence[i]==sequence[i-1]){
	                  count++;
	                  }
	            }else if(i>1){
	                  if(sequence[i]<sequence[i-1] || sequence[i]==sequence[i-1] || sequence[i-2]>sequence[i] || sequence[i]==sequence[i-2]){
	                        count++;
	                        } 
	                  }
	            }
	      
	      
	      if(count>1){
	            result = false;
	      }
	      
	      if(count <=1){
	            result =  true;
	      }
	      
	      return result;
	}
}
