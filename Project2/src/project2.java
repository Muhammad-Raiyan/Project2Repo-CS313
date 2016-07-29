
import java.io.*;
import java.util.*;

public class project2 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		String line;

		while ((line = in.readLine()) != null) {
			String temp[] = line.split(" ");
			
			for(String x: temp)
				System.out.println(x);
		}
		
		
	}

}
