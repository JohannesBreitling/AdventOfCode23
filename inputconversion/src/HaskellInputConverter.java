import interfaces.IInputConverter;

import java.util.List;

public class HaskellInputConverter implements IInputConverter {

    public String convertInput(List<String> input) {

        StringBuilder output = new StringBuilder("[");
        String del = "";

        for (String line : input) {
            output.append(del);
            output.append('"');
            del = ", ";
            output.append(line);
            output.append('"');
        }

        output.append("]");

        return output.toString();
    }

}
