
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

	/**
	 * Gives the data stored in the root of the tree
	 * 
	 * @return Object the data stored in the root
	 * @throws RuntimeException
	 *             if root is null, returns an exception
	 */
	public Object getRootObj() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("EmptyTree");
		else
			return root.element;
	}

	/**
	 * Gives access to the root nodew of the binary tree
	 * 
	 * @return BinaryNode the root of the tree
	 */
	public BinaryNode getRoot() {
		return root;
	}

	/**
	 * Returns a reference of the left child of the current node
	 * 
	 * @return BinaryTree the left child of the current node
	 */
	public BinaryTree getLeft() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else {
			BinaryTree t = new BinaryTree();
			t.root = root.left;
			return t;
		}
	}

	/**
	 * Sets the data in the left child of the current node
	 * 
	 * @param t
	 *            A binaryTree
	 */
	public void setLeft(BinaryTree t) throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else
			root.left = t.root;
	}

	/**
	 * Returns a reference of the right child of the current node
	 * 
	 * @return BinaryTree the right child of the current node
	 */
	public BinaryTree getRight() throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else {
			BinaryTree t = new BinaryTree();
			t.root = root.right;
			return t;
		}
	}

	/**
	 * Sets the data in the right child of the current node
	 * 
	 * @param t
	 *            A binaryTree
	 */
	public void setRight(BinaryTree t) throws RuntimeException {
		if (root == null)
			throw new RuntimeException("Empty Tree");
		else
			root.right = t.root;
	}

	/**
	 * Checks if the tree is empty, if empty, creates a new BinaryTree and
	 * returns it. Otherwise, checks the condition to be inserted in the left
	 * subtree or the right subtree.
	 * 
	 * @param t
	 *            The binaryTree where insertion has to be made
	 * @param x
	 *            an object to be inserted
	 * @return t the binary tree where insertion was made
	 */
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

	/**
	 * Loops through the entire left subtree until the left most node is found
	 * i.e. node.left is null.
	 * 
	 * @param BinaryNode
	 *            A binaryNode whose leftmost node is required
	 * @return The leftmost node of the binary node or subtree
	 */
	public static BinaryNode leftMost(BinaryNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	/**
	 * Creates a binaryNode to the root, and loop the entire right-threaded
	 * binary tree. Prints thedata, if thread exists, update current to the
	 * right node. Otherwise, gets the leftmost node of the right subtree of
	 * current and reiterate.
	 * 
	 * @param t
	 *            the Right-threaded BinaryTree that needs to be traversed
	 */
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

	/**
	 * Follows the algorithm specified in the project description.
	 * 
	 * @param n
	 *            A binaryNode that needs to be called recursively or create
	 *            thread
	 * @param p
	 *            The parent or the ancestor of the node n.
	 */
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
