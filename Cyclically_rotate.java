import java.util.Arrays;
package basics_of_OOps;

public class Cyclically_rotate {
public void rotate(int arr[], int k) {
	 // 
	k = k % arr.length;
	int lo=0;
	int hi=arr.length-1;
	
	while(lo<=hi) {
		swap(arr[lo], arr[hi]);
		lo++;
		hi--;
	}
	int lo=0;
	int hi=arr.length-k-1;
	
	while(lo<=hi) {
		swap(arr[lo], arr[hi]);
		lo++;
		hi--;
	}
	int lo=arr.length-k;
	int hi=arr.length-1;
	
	while(lo<=hi) {
		swap(arr[lo], arr[hi]);
		lo++;
		hi--;
	}
	
}
	
	
	
}
	public static void main(String[] args) {
		int arr[] = { 1, 2 , 3, 4, 5};
		rotate(arr, arr.length);
		

}
	}
