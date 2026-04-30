import java.io.*;

public class Pr26 {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    wordCount += words.length;

                charCount += line.replaceAll("\\s", "").length();
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
