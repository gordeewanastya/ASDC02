import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortingManager {

    public static List<Student> bubbleSort(List<Student> students){
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        int swaps = 0;

        List<Student> sortedList = new ArrayList<>(students);

        for(int i=0; i<sortedList.size() - 1; i++){
            for(int j=0; j < sortedList.size() - i -1; j++){
                comparisons++;
                if(sortedList.get(j).getIdentificationNumber() > sortedList.get(j+1).getIdentificationNumber()){
                    Student temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j+1));
                    sortedList.set(j+1, temp);
                    swaps++;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Bubble Sort:");
        System.out.println("Theoretical complexity: O(n^2)");
        System.out.println("Number of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Execution time: " + duration + " ms");

        return sortedList;
    }



    public static List<Student> selectionSort(List<Student> students){
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        int swaps = 0;

        List<Student> sortedList = new ArrayList<>(students);

        return sortedList;
    }

    public static List<Student> insertionSort(List<Student> students){
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        int swaps = 0;

        List<Student> sortedList = new ArrayList<>(students);

        return sortedList;
    }

    public static void printResults(String sortingMethodName, List<Student> students){
        System.out.println("\n------"+sortingMethodName + "------");
        Iterator<Student> iter = students.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\n---------" + "End of " + sortingMethodName + "---------\n\n\n");
    }
}
