import java.util.*;
import java.util.Scanner;

public class TraverseTree {
    public static void main (String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1. Add element in HashSet");
            System.out.println("\n2. Display element in HashSet");
            System.out.println("\nEnter your choice: ");
            int ch = sc.nextInt();
            int element;
            switch (ch) {
                case 1:
                    System.out.println("Enter element: ");
                    element = sc.nextInt();
                    tree.add(element);
                    break;
                case 2:
                    System.out.print("Element in set are:\n");
                    Iterator<Integer> i = tree.iterator();
                    while (i.hasNext())
                        System.out.println(i.next());
                    break;
                default:
                    System.out.println("Invalid Input");
                    return;
            }
        }
    }
}
