import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class SumPair {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1. Add element in ArrayList\n2. Pair whose sum is equal to specified number in ArrayList\n3. Exit");
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
                    printPairs(list,element);
                    break;
                default:
                    System.out.println("Choose correct option");
                    return;
            }
        }
    }
    static void printPairs(ArrayList<Integer> arr, int sum)
        {
            HashSet<Integer> hash = new HashSet<>();
            for (Integer integer : arr) {
                int temp = sum - integer;
                // checking for condition
                if (hash.contains(temp)) {
                    System.out.println(
                            "Pair with specified sum "
                                    + sum + " is (" + integer
                                    + ", " + temp + ")");
                }
                hash.add(integer);
            }
        }
}
