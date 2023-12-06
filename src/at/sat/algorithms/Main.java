package at.sat.algorithms;

import at.sat.algorithms.sortingmethod.Algorithmus;
import at.sat.algorithms.sortingmethod.BubbleSort;


public class Main {
    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();

        int[] data1 = dataGenerator.generateDataArray(10);

        Algorithmus sortingMethod = new BubbleSort();

        System.out.println("Original Data Array 1:");
        dataGenerator.printArray(data1);

        System.out.println("Sorted Data Array 1:");
        int[] sortedData1 = sortingMethod.sort(data1);
        dataGenerator.printArray(sortedData1);
    }
}
