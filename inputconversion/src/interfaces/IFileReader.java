package interfaces;

import java.io.IOException;
import java.util.List;

public interface IFileReader {
    String getCurrentWorkingDirectory();
    List<String> readFile(String path) throws IOException;
}
