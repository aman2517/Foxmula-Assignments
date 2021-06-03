//Write a program calculate frequency/occurrences of each element of an array 
//and then sort by value and then print it.

import java.util.*;
import java.lang.*;

class SortOccurrence
{
    static void countFreq(int[] arr, int len)
    {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i<len; i++)
        {
            if(hash.containsKey(arr[i]))
            {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            }
            else
            {
                hash.put(arr[i], 1);
            }
        }
        HashMap<Integer, Integer> newHash = sortHash(hash);
        for(Map.Entry<Integer, Integer> entry : newHash.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
    public static HashMap<Integer, Integer> sortHash(HashMap<Integer, Integer> hash)
    {
        LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<>(hash.entrySet());
        Collections.sort(list, new Comparator<HashMap.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> i1, Map.Entry<Integer, Integer> i2)
            {
                return (i1.getValue()).compareTo(i2.getValue());
            }
        });
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> m : list)
        {
            sortedMap.put(m.getKey(), m.getValue());
        }
        return sortedMap;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        int len = arr.length;
        while(true)
        {
            System.out.println("\n\n1. Add Element to the Array\n2. Show Frequency of each element\n3. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the elements of the Array:");
                    for(int i=0; i<s; i++)
                    {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    countFreq(arr, len);
                    break;

                default:
                    System.out.println("Exit!");
                    return;
            }
        }
    }
}