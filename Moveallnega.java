package basics_of_OOps;

public class Moveallnega 
{
static void negatives_at_oneside(int arr[], int n) {
	int count_nega=0;
	int count_posi=0;
	int i;
	int a[n];
	for(i=0;i<n;i++) {
		if(arr[i]<0)
		count_nega++;
		else
		count_posi++;
	}
	for(int j=0;j<count_nega;j++) {
		if(arr[j] < 0)
		a[j] = arr[j];
	}
	for(int j=count_nega;j<n;j++) {
		if(arr[j] >  0)
		a[j] = arr[j];
	}
		
}
}
			
	
	
	public static void main(String[] args) {
		int []arr= {-1 , 3 ,5 ,-2, 0 , 3 -5};
		negatives_at_oneside(arr, arr.length);
		
	}

}
}
