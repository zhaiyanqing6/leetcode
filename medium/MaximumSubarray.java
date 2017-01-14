package medium;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		return helper(nums, 0, nums.length - 1);
	}

	private int helper(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		if (i == j)
			return nums[i];
		int mid = (i + j) / 2;
		int leftMax = helper(nums, i, mid);
		int rightMax = helper(nums, mid + 1, j);
		int max = Integer.max(leftMax, rightMax);
		int tmp = 0, leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
		for(int k=mid;k>=i;k--){
			tmp += nums[k];
			if (tmp > leftSum)
				leftSum = tmp;
		}
		tmp=0;
		for(int k=mid+1;k<=j;k++){
			tmp += nums[k];
			if (tmp > rightSum)
				rightSum = tmp;
		}
		return Integer.max(max, leftSum + rightSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray max = new MaximumSubarray();
		System.out.println(max.maxSubArray(new int[] { -2, -1 }));
	}

}
