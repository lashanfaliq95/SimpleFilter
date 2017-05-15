

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            ArrayList<String> content = new ArrayList<>();
            String line;
            char[] letters = args[1].toCharArray();
            int length = letters.length;

            while ((line = reader.readLine()) != null) {

                char[] temp = line.toCharArray();
                int lengthOFLine = temp.length;
                boolean condition;
                boolean add = true;
                for (int i = 0; i < lengthOFLine; i++) {
                    condition = false;
                    add = true;
                    for (int j = 0; j < length; j++) {

                        if (temp[i] == letters[j]) {
                            condition = true;
                        }
                    }
                    if (condition == false) {
                        add = false;
                        break;
                    }
                }
                if (add == true) {
                    content.add(line);
                }


            }
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("Please enter a valid file name");
        }
    }
}
/* Runtime complexity of the programme would be O(n3) since it has three nested loops.Here it would be O(length*lengthOfLine*no of words in file).
  space time complexity would be O(n)(O(no of words in file)) since i have used a arraylist to store data.Genral case however would be 2*n.
*/