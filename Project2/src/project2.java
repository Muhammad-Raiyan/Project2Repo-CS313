
import java.io.*;
import java.util.*;

public class project2 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BinaryTree t = new BinaryTree();
		String line;
			
		while ((line = in.readLine()) != null) {
			String temp[] = line.split(" ");
			
			for(int i=0; i<temp.length; i++){
				t = BinaryTree.insert(t, new Integer(temp[i]));
			}
		}
		
		
		BinaryTree.rightThread(t.getRoot(), null);
		/*t= t.getLeft();
		
		t = t.getLeft();
		//System.out.println(t.getRight().getRootObj());
*/		
		BinaryTree.inorder(t);
	}
	
	
	
}

