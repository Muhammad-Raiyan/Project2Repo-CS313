
import java.io.*;
import java.util.*;

public class project2 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BinaryTree t = new BinaryTree();
		String line;
			
		while ((line = in.readLine()) != null) {
			String temp[] = line.split(" ");
			
			for(int i=0; i<5; i++){
				t= BinaryTree.insert(t, new Integer(i));
			}
		}
		
		BinaryTree.inorder(t);
		
		
	}
	
	
}
