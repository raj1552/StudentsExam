import java.io.IOException;
import java.io.PrintWriter;

public class text{

    public static void main(String[] args) throws IOException
    {
        // Open the file.
        PrintWriter out = new PrintWriter(""); // Step 2

        // Write the name of four oceans to the file
        out.println("Atlantic");   // Step 3
        out.println("Pacific");
        out.println("Indian");
        out.println("Arctic");

        // Close the file.
        out.close();  // Step 4
    }
}
