import interfaces.IFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class InputFileReader implements IFileReader {

    public String getCurrentWorkingDirectory() {
        return System.getProperty("user.dir");
    }

    // TODO Think about other things that could go wrong
    public List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        List<String> output = new ArrayList<>();

        while((line = br.readLine()) != null) {
            output.add(line);
        }

        return output;
    }

}
