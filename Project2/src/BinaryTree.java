import java.io.*;
import java.util.*;

public class BinaryTree {
	private BinaryNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(Object x) {
		root = new BinaryNode(x);
	}

	public boolean isEmpty() {
		return (root == null) ? true : false;
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
		else if (((Integer) t.getRootObj()).intValue() < ((Integer) x).intValue()) {
			t.setRight(insert(t.getRight(), x));
		} else
			t.setLeft(insert(t.getLeft(), x));
		return t;

	}

	public static void inorder(BinaryTree t) throws RuntimeException {
		if (!t.isEmpty()) {
			inorder(t.getLeft());
			System.out.print(t.getRootObj());
			inorder(t.getRight());
		}
	}

}
