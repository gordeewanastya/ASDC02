import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/main/resources/studentsUnique.csv");
        ReaderCSV readerCSV = new ReaderCSV();

        // READ STUDENTS FROM FILE INTO LIST
        List<Student> students = readerCSV.readFromFile(file);

//        // SHOW THEM ON THE SCREEN
//        students.stream().forEach(System.out::println);


        //Bubble Sort
        SortingManager.printResults("Bubble Sort",SortingManager.bubbleSort(students));

        //Selection Sort
        SortingManager.printResults("Selection Sort",SortingManager.selectionSort(students));

        //Insertion Sort
        SortingManager.printResults("Insertion Sort",SortingManager.insertionSort(students));


    }

}