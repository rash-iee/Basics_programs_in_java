package basics_of_OOps;

public class Kmax {
	
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
}
