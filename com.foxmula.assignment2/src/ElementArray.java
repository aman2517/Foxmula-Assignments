import java.util.ArrayList;
import java.util.Scanner;

public class ElementArray {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1. Add element in ArrayList\n2. Check if element is already present in ArrayList\n3. Exit");
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
                    element = sc.nextInt();
                    contain(list, element);
                    break;
                default:
                    System.out.println("Wrong Input");
                    return;
            }
        }
    }
    public static void contain(ArrayList<Integer> list, int element)
    {
        if (list.contains(element))
            System.out.println(element + " exists in the ArrayList");

        else
            System.out.println(element + " does not exist in the ArrayList");
    }
}
