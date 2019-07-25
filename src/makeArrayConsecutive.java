import java.util.Arrays;

//Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
//each statue having an non-negative integer size. Since he likes to make things perfect, 
//he wants to arrange them from smallest to largest so that each statue will be bigger than
//the previous one exactly by 1. He may need some additional statues to be able to accomplish that. 
//Help him figure out the minimum number of additional statues needed.

public class makeArrayConsecutive {
	int makeArrayConsecutive(int[] statues) {
	    int total = 0;
	    Arrays.sort(statues);

	     for(int i =1; i<statues.length;i++){

	         total+= statues[i]-statues[i-1]-1;
	     }
	    
	    
	    return total;
	}
}
