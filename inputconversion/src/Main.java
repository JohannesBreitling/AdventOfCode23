import interfaces.IFileReader;
import interfaces.IInputConverter;

import java.io.IOException;
import java.util.List;

public class Main {

    // TODO : Write output not to sout, but in new file
    // TODO : Get input from user for which language should be used
    public static void main(String[] args) {

        IFileReader reader = new InputFileReader();

        try {
            // Get the input as a list of all the lines
            List<String> input = reader.readFile("src/input-01-1-2.txt");

            // Process the lines to the desired format for the programming language of choice
            IInputConverter converter = new HaskellInputConverter();

            String output = converter.convertInput(input);

            System.out.println(output);

        } catch (IOException e) {
            System.err.println("Error while processing the file!");
        }





    }

}
