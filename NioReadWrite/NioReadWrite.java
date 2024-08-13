package NioReadWrite;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
class NioReadWrite {
    public static void main(String[] args) {
        try {
            List<String> fileList = new ArrayList<String>();
            Path p = Paths.get("Input.txt");
            fileList.add(Files.readString(p));
            String s = String.join(" ", fileList);
            Path q = Paths.get("Destination.txt");
            Files.write(q, s.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}