package medium;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target) {
				mid--;
			} else {
				mid++;
			}
		}
		return left - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
