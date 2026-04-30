import java.util.*;

public class Pr27 {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        System.out.println("Marks: " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
//output
//Marks: [85, 72, 90, 66, 78]
//Highest Marks: 90
//Lowest Marks: 66
