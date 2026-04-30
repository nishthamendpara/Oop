import java.util.*;

public class Pr30 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Search 102: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105: " + searchElement(rollNumbers, 105));

        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Neha");

        System.out.println("\nSearch Rahul: " + searchElement(names, "Rahul"));
        System.out.println("Search Priya: " + searchElement(names, "Priya"));
    }
}
