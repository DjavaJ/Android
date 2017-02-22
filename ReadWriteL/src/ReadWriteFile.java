import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/15/17.
 */
public class ReadWriteFile {

        public static void main (String [] args) throws IOException {  //IO may be thrown if issues arise input/out on file
            File f = new File ("names.txt");

            FileWriter fw = new FileWriter(f);

            fw.write("Alice\n"); // \n is like pushing enter on an editor for he next line
            fw.append("Bob\n");
            fw.append("Charles\n");
            fw.close();

            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine()); //read from file with scanner object
            }

            scanner = new Scanner (f);
            scanner.useDelimiter("\\Z"); // \\Z end of reading files (ex A, B, C...) token are the words after spaces
            String contents = scanner.next();
            System.out.println(contents);

        }
    }


