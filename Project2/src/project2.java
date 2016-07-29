
import java.io.*;
import java.util.*;

public class project2 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BinaryTree t = new BinaryTree();
		String line;
		
		for(int i=1; i<5; i++){
			BinaryTree.insert(t, i);
		}
		
		BinaryTree.inorder(t);
		/*while ((line = in.readLine()) != null) {
			String temp[] = line.split(" ");
			
			
		}*/
		
		
	}
	
	
}
