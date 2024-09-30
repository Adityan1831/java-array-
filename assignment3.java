//3.Find the second maximum and second minimum Elements of an array
package assignment3;
import java.util.*;

public class assignment3 {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 6, 7, 9 };
		Arrays.sort(arr);
		int secondMin = arr[1];
		int secondMax = arr[arr.length - 2];
		System.out.println("SecondMin: "+secondMin);
		System.out.println("SecondMax: "+secondMax);


	}

}
