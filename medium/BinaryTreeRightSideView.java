package medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null)
			return res;
		List<TreeNode> cur = new ArrayList<>();
		cur.add(root);
		while (cur.size() > 0) {
			int k = 0, len = cur.size();
			while (k < len) {
				TreeNode tmp = cur.remove(0);
				if (tmp.left != null)
					cur.add(tmp.left);
				if (tmp.right != null)
					cur.add(tmp.right);
				if (k == len - 1)
					res.add(tmp.val);
				k++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeRightSideView bin = new BinaryTreeRightSideView();
		TreeNode root = new TreeNode(1);
		System.out.println(bin.rightSideView(root));
	}

}
