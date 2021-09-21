package java2blog;

import java.util.Arrays;

public class PaypalTest {
	public static int minimunInterval(Integer[] array) {
		int value = 0;
		
		for (int i = 0; i < array.length -1; i++) {
			for (int j = 1; j < array.length -1; j++) {
				System.out.println(array[i] + "," +  array[j]);
			}
			
//			int temp = 0;
//			
//			if (Integer.valueOf(array[i + 1]) > Integer.valueOf(array[i])) {
//				temp = Integer.valueOf(array[i + 1]) - Integer.valueOf(array[i]);	
//			} else {
//				temp = Integer.valueOf(array[i]) - Integer.valueOf(array[i + 1]);
//			}
//			
//			if (value == 0 || value < temp) {
//				value = temp;
//			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Integer[] interval1 = {8,10};
		Integer[] interval2 = {9,10};
		Integer[] interval3 = {9,11};
		
		Integer[] interval = merge(interval1, interval2, interval3);
		
		minimunInterval(interval);
	}
	
	public static <T> T[] merge(T[]... arrays)
	{
	    int finalLength = 0;
	    for (T[] array: arrays) {
	        finalLength += array.length;
	    }
	 
	    T[] dest = null;
	    int destPos = 0;
	 
	    for (T[] array: arrays)
	    {
	        if (dest == null)
	        {
	            dest = Arrays.copyOf(array, finalLength);
	            destPos = array.length;
	        }
	        else {
	            System.arraycopy(array, 0, dest, destPos, array.length);
	            destPos += array.length;
	        }
	    }
	    return dest;
	}
}


