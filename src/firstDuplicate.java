//Given an array a that contains only numbers in the range from 1 to a.length, 
//find the first duplicate number for which the second occurrence has the minimal index.
//In other words, if there are more than 1 duplicated numbers, return the number for 
//which the second occurrence has a smaller index than the second occurrence of the other number does. 
//If there are no such elements, return -1.


public class firstDuplicate {


int firstDuplicate(int[] a) {
    int ocurrence=0;
    boolean ocurrenceExists = false;
    
    
    for(int i = 0; i<a.length;i++){
        for(int j = i+1; j<a.length;j++){
           if(a[i]==a[j]){
              ocurrence = a[i];
               ocurrenceExists = true;
               if(ocurrenceExists=true){
                   break;
               }
         }
        
        }
    }
    
    if(ocurrence == 1 || ocurrence>1){
        return ocurrence;
    }else{
        return -1;
    }
    

    
}
}
