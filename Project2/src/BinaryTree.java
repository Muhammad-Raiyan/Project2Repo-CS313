
public class BinaryTree {
	private BinaryNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(int x) {
		root = new BinaryNode(x);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void makeEmpty() {
		root = null;
	}

	public BinaryNode getRoot() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("EmptyTree");
		else
			return root;
	}

	public static BinaryTree insert(BinaryTree t, int x) {
		if (t.isEmpty())
			return new BinaryTree(x);
		else {
			
		}
		return t;
	}

}
