import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class OccurrencesArrayList {
    public static void countOccurrence(ArrayList<Integer> list)
    {
        // hashmap to store the frequency of element
        Map<Integer, Integer> hm = new HashMap<>();

        for (Integer i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
    }
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1. Add element in ArrayList\n2. Check occurrence of each element in ArrayList\n3. Exit");
            System.out.println("\nEnter your choice");
            int ch = sc.nextInt();
            int element;
            switch (ch) {
                case 1:
                    System.out.println("Enter element: ");
                    element = sc.nextInt();
                    list.add(element);
                    break;
                case 2:
                    System.out.println("Enter element: ");
                    countOccurrence(list);
                    break;
                default:
                    System.out.println("Invalid Input");
                    return;
            }
        }
    }
}
