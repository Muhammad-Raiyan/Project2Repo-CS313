
import java.io.*;

public class project2 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BinaryTree t = new BinaryTree();
		String line;
		int count = 0;

		while ((line = in.readLine()) != null) {
			String temp[] = line.split(" ");

			for (int i = 0; i < temp.length; i++) {
				t = BinaryTree.insert(t, new Integer(temp[i]));
			}
			
			System.out.println("Data set #" + ++count);
			BinaryTree.rightThread(t.getRoot(), null);
			System.out.print("Non-Recursuve traversal: ");
			BinaryTree.itrTraversal(t);
			t.makeEmpty();
		}
		in.close();
	}

}
