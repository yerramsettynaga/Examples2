import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author naga
 *
 */
public class DupUtil 
{

	/**
	 * The purpose of this method is to convert Integer list to int[]
	 * @param integerList
	 * @return
	 */
	public static int[] convert(List<Integer> integerList) {

	    int s = integerList.size();
	    int[] intArray = new int[s];
	    for (int i = 0; i < s; i++) {
	    	//java auto unboxing feature...where Integer wrapper object is converted to primitive int.
	        intArray[i] = integerList.get(i);
	    }
	    return intArray;
	}
	
	/**
	 * Convert int[] to Integer[]
	 * @param intArr
	 * @return
	 */
	public static List<Integer> convertToIntegerList(int[] intArr) 
	{ 
		List<Integer> result = new ArrayList<>(intArr.length); 
		for (int i=0; i<intArr.length; i++) 
		{ 
			result.add(intArr[i]); 
		} 
		return result; 
	}
	
	/**
	 * Convert Integer[] to int[]
	 * @param IntegerArray
	 * @return
	 */
	public static int[] convertToIntegerPrimitive(Integer[] integerArray) 
	{
		if(null != integerArray)
		{
			int[] result = new int[integerArray.length];
			for (int i = 0; i < integerArray.length; i++) {
				result[i] = integerArray[i].intValue();
			}
			return result;
		}
	    return null;
	}
}
