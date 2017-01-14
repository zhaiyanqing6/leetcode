package medium;

import java.util.Stack;

public class BSTIterator {
	Stack<TreeNode> stack = new Stack<TreeNode>();

	public BSTIterator(TreeNode root) {
		TreeNode cur = root;
		while (cur != null) {
			stack.push(cur);
			cur = cur.left;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		int res = -1;
		if (!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			res = cur.val;
			if (cur.right != null) {
				TreeNode tmp = cur.right;
				while (tmp != null) {
					stack.push(tmp);
					tmp = tmp.left;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
