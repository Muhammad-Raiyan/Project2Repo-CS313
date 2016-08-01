
public class BinaryTree {
	private BinaryNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(Object x) {
		root = new BinaryNode(x);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void makeEmpty() {
		root = null;
	}

	public Object getRootObj() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("EmptyTree");
		else
			return root.element;
	}

	public BinaryNode getRoot() {
		return root;
	}

	public BinaryTree getLeft() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else {
			BinaryTree t = new BinaryTree();
			t.root = root.left;
			return t;
		}
	}

	public void setLeft(BinaryTree t) throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else
			root.left = t.root;
	}

	public BinaryTree getRight() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else {
			BinaryTree t = new BinaryTree();
			t.root = root.right;
			return t;
		}
	}

	public void setRight(BinaryTree t) throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else
			root.right = t.root;
	}

	public static BinaryTree insert(BinaryTree t, Object x) {
		if (t.isEmpty())
			return new BinaryTree(x);
		else {
			if (((Integer) t.getRootObj()).intValue() < ((Integer) x).intValue()) {
				t.setRight(insert(t.getRight(), x));
			} else
				t.setLeft(insert(t.getLeft(), x));
			return t;
		}

	}

	public static BinaryNode leftMost(BinaryNode node) {
		while (node.left != null && node != null)
			node = node.left;
		return node;
	}

	public static void itrTraversal(BinaryTree t) throws RuntimeException {
		
		if (t.isEmpty())
			return;
		BinaryNode current = t.getRoot();
		current = leftMost(current);

		while (current != null) {
			System.out.print(current.element + " ");

			if (current.thread == true)
				current = current.right;

			else
				current = leftMost(current.right);

		}
		System.out.println("");

	}

	public static void rightThread(BinaryNode n, BinaryNode p) {
		if (n.left != null) {
			rightThread(n.left, n);
		}
		if (n.right != null) {
			rightThread(n.right, p);
		} else {
			n.right = p;
			n.thread = true;
			if (n.right != null)
				System.out.println(n.element + "->" + p.element);

		}
	}

}
