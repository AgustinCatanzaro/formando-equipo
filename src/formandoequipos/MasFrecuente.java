package formandoequipos;
import java.util.*; 

public class MasFrecuente {
	//Java program to find the most frequent element 
	//in an array  
	      
	    public static String mostFrequent(ArrayList<String> aux, int n) 
	    { 
	          
	        // Sort the array 
	        Collections.sort(aux); 
	          
	        // find the max frequency using linear 
	        // traversal 
	        int max_count = 1;
			String res = aux.get(0); 
	        int curr_count = 1; 
	          
	        for (int i = 1; i < n; i++) 
	        {
	            if (aux.get(i) == aux.get(i-1)) 
	                curr_count++; 
	            else 
	            { 
	                if (curr_count > max_count) 
	                { 
	                    max_count = curr_count; 
	                    res = aux.get(i-1); 
	                } 
	                curr_count = 1; 
	            } 
	        } 
	      
	        // If last element is most frequent 
	        if (curr_count > max_count) 
	        { 
	            max_count = curr_count; 
	            res = aux.get(n-1); 
	        }else if(curr_count == max_count && max_count == 1){
	        	return null;
	        }
	      
	        return res; 
	    } 
	      
	    // Driver program 
	  /* public static void main (String[] args) { 
	          
		   ArrayList<String> arr = new ArrayList<String>();
		   arr.add("a");
		   arr.add("b");
		   arr.add("c");
		   arr.add("d");
		   arr.add("e");
		   arr.add("b");
	        int n = arr.size(); 
	          
	        System.out.println(mostFrequent(arr,n)); 
	          
	    } */
	
}
