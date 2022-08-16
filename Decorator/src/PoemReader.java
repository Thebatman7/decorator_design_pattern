import java.io.File;
import java.util.Scanner;

public class PoemReader implements StringSource {
    private Scanner input;
    public void loadPoem() {
        try {
            File file = new File("Poem.txt");
            input = new Scanner(file);
        }
        catch (Exception exception) {
            System.out.println("Error occurred. File could not be read. " + exception.toString());
        }
    }
    @Override
    public String next() {
        if(input.hasNext()) {
            return input.nextLine();
        }
        return "You read the whole poem.";
    }
}
