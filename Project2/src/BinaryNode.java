
public class BinaryNode {
	int element;
	BinaryNode left, right;
	
	public BinaryNode() {
		this(-1, null, null);
	}
	
	public BinaryNode(int e){
		this(e, null, null);
	}
	
	public BinaryNode(int e, BinaryNode ln, BinaryNode rn){
		element = e;
		left = ln;
		right = rn;
	}
}
