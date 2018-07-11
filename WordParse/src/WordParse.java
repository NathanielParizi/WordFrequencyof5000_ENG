import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.*;

public class WordParse {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		Scanner firstname = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstname1 = firstname.next();
		firstname1 = firstname1.replaceAll("[^A-Za-z]", "");
		System.out.println(firstname1);

		FileReader file;
		try {
			file = new FileReader("C:\\Users\\justi\\eclipse-workspace\\WordParse\\src\\wordfreq5000.txt");
			BufferedReader reader = new BufferedReader(file);

			String text = "";
			String line = reader.readLine();

			String vocab[] = new String[5001];

			int i = 0;
			while (line != null) {

				line = line.replaceAll("[^A-Za-z]", "");
				text += line + "\n";
				System.out.println("i: " + i + " and vocab[i] = " + vocab[i] + " word: " + line);
				vocab[i] = line;
				line = reader.readLine();
				i++;

			}

			// Enhanced for-each loop
			for (String q : vocab) {

				System.out.println(q);
			}

			// System.out.println(vocab[4999]);
			// System.out.println(text);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static boolean Character(String line) {
		// TODO Auto-generated method stub
		return false;
	}

}
