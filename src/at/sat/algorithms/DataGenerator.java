package at.sat.algorithms;

import java.util.Random;

public class DataGenerator {

    private static final Random random = new Random();


    public static int[] generateDataArray(int size) {
        int[] dataArray = new int[size];


        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt();
        }

        return dataArray;
    }

    // Methode, um ein Array mit Werten im angegebenen Bereich zu generieren
    public static int[] generateDataArray(int size, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min-Wert sollte kleiner oder gleich dem Max-Wert sein");
        }

        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt(max - min + 1) + min; // Zufällige Werte im Bereich setzen und im Array speichern
        }

        return dataArray;
    }


    public static void printArray(int[] data) {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
