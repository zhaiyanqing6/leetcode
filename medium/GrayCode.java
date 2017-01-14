package medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList<>();
		res.add(0);
		if (n == 0)
			return res;
		res.add(1);
		for (int k = 2; k <= n; k++) {
			for (int j = res.size() - 1; j >= 0; j--) {
				res.add(res.get(j) + (1 << (k - 1)));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
