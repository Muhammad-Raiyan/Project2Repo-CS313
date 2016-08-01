
public class BinaryNode {
	Object element;
	BinaryNode left, right;
	boolean thread = false;

	public BinaryNode() {
		this(null);
	}

	public BinaryNode(Object e) {
		this(e, null, null);
	}

	public BinaryNode(Object e, BinaryNode ln, BinaryNode rn) {
		element = e;
		left = ln;
		right = rn;
	}


}
