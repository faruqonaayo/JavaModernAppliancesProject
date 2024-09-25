package methods;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileConverter {
    public static String[] convertToArray (String fileLoc) {
        File userFile = new File(fileLoc);
        try {
            Scanner fileReader = new Scanner(userFile);
            ArrayList<String> lines = new ArrayList<>();

            while (fileReader.hasNextLine()){
                lines.add(fileReader.nextLine());
            }

            String[] linesArray = lines.toArray(new String[0]);
            return linesArray;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
