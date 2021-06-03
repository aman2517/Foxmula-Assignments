import java.util.*;
import java.util.Scanner;

public class ElementSet {
    public static void main (String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1. Add element in Set\n2. Check if element is already present in Set\n3. Exit");
            System.out.println("\nEnter your choice: ");
            int ch = sc.nextInt();
            int element;
            switch (ch) {
                case 1:
                    System.out.println("Enter element: ");
                    element = sc.nextInt();
                    set.add(element);
                    break;
                case 2:
                    System.out.println("Enter element: ");
                    element = sc.nextInt();
                    contain(set, element);
                    break;
                default:
                    System.out.println("Invalid Input");
                    return;
            }
        }
    }
    public static void contain(Set<Integer> list, int element)
    {
        if (list.contains(element))
            System.out.println(element + " exists in the Set");

        else
            System.out.println(element + " does not exist in the Set");
    }
}
