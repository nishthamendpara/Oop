import java.io.*;

public class Pr24 {
    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    wordCount += words.length;
            }

            br.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide file name");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
//output
//Characters: 47
//Words: 6
//Lines: 3
