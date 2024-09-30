package assignment3;
public class assignment4 {

	public static void main(String[] args) {
		int[] arr = { 1,23,5,8,1,1,1,12};
		int count = 0;
		int n = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		System.out.println("number of 6 ocuurs is: "+count);

	}

}
