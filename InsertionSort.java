import java.lang.*;

public class InsertionSort
{
    public InsertionSort()
    {

    }

    /*
        Sort words such that all strings inside it
        are sorted alphabetically ascending (a to z)
        Should NOT be case-sensitive! (Ex: Apple, aztec, book, BURN)
     */
    public static void sortAscending(String[] words)
    {
        long startTime = System.nanoTime();

        for(int i = 1; i < words.length; i++) {
            String key = words[i];
            int j = i - 1;
            while(j >= 0 && words[j].compareToIgnoreCase(key) > 0)
            {
                words[j+1] = words[j];
                j--;
            }
            words[j+1] = key;
        }

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        long endTime = System.nanoTime();
        System.out.println("My sort took " + (endTime - startTime) + " nanoseconds.");
    }

    public static void mystery(String[] arr) {
        long startTime = System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j].compareToIgnoreCase(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        long endTime = System.nanoTime();
        System.out.println("My sort took " + (endTime - startTime) + " nanoseconds.");
}


    public static void main(String[] args)
    {
        String[] comp = {"ball", "computer", "marker" , "plant", "tree", "Frisco", "132", "Badges", "Mr. Best", "Elijah", "Aiden", "Chromebook", "worms"};
        InsertionSort.mystery(comp);
        InsertionSort.sortAscending(comp);
    }
}
