import java.io.*;

public class Pr25 {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            fw.write("101 Rahul 85\n");
            fw.write("102 Amit 78\n");
            fw.write("103 Neha 92\n");

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        } 
        finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}//output
//101 Rahul 85
//102 Amit 78
//103 Neha 92
