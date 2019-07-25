//Given the string, check if it is a palindrome (A palindrome is a string that reads the same left-to-right and right-to-left.)


public class checkPalindrome {
	boolean checkPalindrome(String inputString) {
	    	    
	    StringBuilder inputReversed = new StringBuilder();
	    
	    inputReversed.append(inputString);
	    inputReversed = inputReversed.reverse();
	    String inputReversed1 = inputReversed.toString();
	    System.out.println(inputString);
	    System.out.println(inputReversed1);
	    
	    if(inputString.equalsIgnoreCase(inputReversed1)){
	        return true;
	    }else{
	        return false;
	    }
	    
	}
}
