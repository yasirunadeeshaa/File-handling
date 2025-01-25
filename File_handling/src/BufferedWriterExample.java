import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("Hello, File Handling in Java!");
            bw.newLine(); // Adds a new line
            bw.write("Line 2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
