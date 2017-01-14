package medium;

public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		int left = 0, right = nums.length - 1;
		while (left < right) {
			if (nums[left] < nums[right])
				return nums[left];
			int mid = left + (right - left) / 2;
			if (nums[mid] > nums[left])
				left = mid + 1;
			else
				right = mid;
		}
		return nums[left];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		FindMinimumInRotatedSortedArray a = new FindMinimumInRotatedSortedArray();
		System.out.println(a.findMin(arr));
	}

}
