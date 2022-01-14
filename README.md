# Basics_programs_in_java
package basics_of_OOps;

public class Revesre_array {
	static void reverse(int arr[], int size) {
		int temp;
		int i;
		for(i=0;i< size/2 ;i++) {    // moving till half size of the array adn swapping the last and first indexed values and doning this untill we reacg middle 
			 temp = arr[i];
			 arr[i] = arr[size-i-1];
			 arr[size-i-1] = temp;
			 
		}
		System.out.println("Revesred array is ");
		for(int j=0;j<size;j++) {
			System.out.println( arr[j]);
		}
		
	}
	

	
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr, arr.length);
}
}
