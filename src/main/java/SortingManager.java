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

        for(int i=0; i<sortedList.size()-1;i++){
            int minIndex = i;
            for(int j= i + 1; j < sortedList.size(); j++){
                comparisons++;
                if(sortedList.get(j).getIdentificationNumber() < sortedList.get(minIndex).getIdentificationNumber()){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                Student temp = sortedList.get(minIndex);
                sortedList.set(minIndex, sortedList.get(i));
                sortedList.set(i,temp);
                swaps++;
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Selection Sort:");
        System.out.println("Theoretical complexity: O(n^2)");
        System.out.println("Number of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Execution time: " + duration + " ms");

        return sortedList;
    }

    public static List<Student> insertionSort(List<Student> students){
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        int swaps = 0;

        List<Student> sortedList = new ArrayList<>(students);

        for(int i=1; i<sortedList.size();i++){
            Student key = sortedList.get(i);
            int j = i-1;

            //Сдвигаем элементы, большие, чем key на одну позицию вправо
            while(j >= 0 && sortedList.get(j).getIdentificationNumber() > key.getIdentificationNumber()){
                comparisons++;
                sortedList.set(j+1, sortedList.get(j));
                swaps++;
                j = j - 1;
            }
            sortedList.set(j+1, key);

        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Insertion Sort:");
        System.out.println("Theoretical complexity: O(n^2)");
        System.out.println("Number of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Execution time: " + duration + " ms");


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
