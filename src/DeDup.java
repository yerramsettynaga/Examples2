import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author naga
 *
 */
public class DeDup {

 int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11}; 
	
	/**
	 * This method deletes the duplicate elements in an integer array.
	 * It may contain null values 
	 * @param argIntArray
	 */
	
	public static int[] deleteDuplicates(int[] argIntArray)
	{
		/* new length of unique array */
		int NewLength = 1;
		int j;
		int[] finalArray = new int[argIntArray.length];
		finalArray[0] = argIntArray[0]; // storing the first number
		/* iterate over the array
			starting from the second array number and comparing it with all the elements
			in array up to this array. 
			Element in argIntArray[1] will be compared with argIntArray[0]. 
			If they are different, then value is copied to finalArray with argIntArray[1] and increment NewLength. 
			If they are same, NewLength will not be modified.
		*/
		for(int i=1; i< argIntArray.length; i++)
		{
		   for(j=0; j< NewLength ; j++)
		   {
			  if(argIntArray[i] == argIntArray[j])
		      break;
		   }

		  if (j==NewLength )
			  finalArray[NewLength++] = argIntArray[i];
		}
		
		return finalArray;
	}
	
	/**
	 * The purpose of this method is to delete the duplicates in the integer array
	 */
	public static int[] removeDuplicates(int[] argIntArray)
	{
		 //using list as the size is dynamic and can change
		// ArrayList does not allow primitive datatypes
		// It accepts only reference types or objects as its element
	    List<Integer> result = new ArrayList<Integer>(argIntArray.length);

	    for(int i=0; i<argIntArray.length; i++)
	    {
	        boolean match = false;
	        for(int j=0; j<result.size(); j++)
	        {
	            //if the list contains any element that match true
	            if(result.get(j) == argIntArray[i])
	                match = true;
	        }
	        //if there is no matching we can add the element to the result list
	        // this is Java auto boxing feature where int is converted to Integer wrapper object.
	        if(!match)
	            result.add(argIntArray[i]);
	    }
	    Collections.sort(result);
	    //finally convert the list of Integer to array of integer.
	    return DupUtil.convert(result);
	}
	
	/**
	 * The purpose of this method is to remove the duplicate entries 
	 * in an integer array without guaranteeing the order.
	 * @param arr
	 * @return
	 */
	public static int[] removeDuplicatesInArray(int[] arr) 
	{
		if(arr != null)
		{
			List<Integer> result = DupUtil.convertToIntegerList(arr);
			
		    // Using Set to remove duplicates
		    // but this does not guarantee ordering
		    Set<Integer> hs= new HashSet<Integer>(result);
		    
		    Integer[] convertedArr = hs.toArray(new Integer[hs.size()]);
		    return DupUtil.convertToIntegerPrimitive(convertedArr);
		}
		return null;
	}
	
		
	/**
	 * This method removes the duplicate elements in the array and sort them in ascending order
	 * @param arr
	 * @return
	 */
	public static int[] removeDuplicatesSortedOrder(int[] arr)
	{
		if(arr != null)
		{
			List<Integer> result = DupUtil.convertToIntegerList(arr);
		 
		    // Using TreeSet to remove duplicates and sorting the order
		  
		    Set<Integer> hs= new TreeSet<Integer>(result);
		    
		    Integer[] convertedArr = hs.toArray(new Integer[hs.size()]);
		    return DupUtil.convertToIntegerPrimitive(convertedArr);
		}
		return null;
	}
	
	/**
	 * This method removes the duplicate elements in the array and retain the order
	 * @param arr
	 * @return
	 */
	public static int[] removeDuplicatesPreserveOrder(int[] arr)
	{
		if(arr != null)
		{
			List<Integer> result = DupUtil.convertToIntegerList(arr);
		    // Using LinkedHashSet to remove duplicates and preserve the order
		  
		    Set<Integer> hs= new LinkedHashSet<Integer>(result);
		    
		    Integer[] convertedArr = hs.toArray(new Integer[hs.size()]);
		    return DupUtil.convertToIntegerPrimitive(convertedArr);
		}
		return null;
	}
	
	/**
	 * The purpose of this method is to remove the duplicate entries 
	 * in an integer array with sorting in the ascending order.
	 * @param arr
	 * @return
	 */
	public static int[] removeDuplicatesInArray2(int[] arr) 
	{
		if(arr != null)
		{
			List<Integer> result = DupUtil.convertToIntegerList(arr);
			
		    // Using Set to remove duplicates
		    // but this does not guarantee ordering
		    Set<Integer> hs= new HashSet<Integer>(result);
		    SortedSet<Integer> ss = new TreeSet<Integer>(hs);
		    
		    Integer[] convertedArr = ss.toArray(new Integer[ss.size()]);
		    return DupUtil.convertToIntegerPrimitive(convertedArr);
		}
		return null;
	}
		
	public static void main(String[] args) {
		DeDup obj = new DeDup();

		//int[] finalIntArray = deleteDuplicates(obj.randomIntegers);
		//int[] finalIntArray = removeDuplicates(obj.randomIntegers);
		int[] finalIntArray = removeDuplicatesInArray(obj.randomIntegers);
		//int[] finalIntArray = removeDuplicatesSortedOrder(obj.randomIntegers);
		//int[] finalIntArray = removeDuplicatesPreserveOrder(obj.randomIntegers);
		for(int i=0; i< finalIntArray.length;i++)
		{
			System.out.println(finalIntArray[i] + " ");
		}
	}

}
