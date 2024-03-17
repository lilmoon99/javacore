package org.example;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();

    }

    private static void task3() {
        int [] array = {1,2,0,0,5};
        int [] array2 = {1,1,4,0,2,5,1,0};
        System.out.println(isTwoEqualNumbersNear(array));
        System.out.println(isTwoEqualNumbersNear(array2));
    }

    private static void task2() {
        int [] array = generateArray(5);
        System.out.println(Arrays.toString(array));
        try {
            System.out.println(maxMinDiff(array));
        }catch (NullPointerException e){
            System.out.println("Null pointer!");
        }
    }

    private static void task1() {
        int[] testArray = generateArray(5);
        System.out.println(Arrays.toString(testArray));
        System.out.println(evenNumbersCount(testArray));
    }

    private static int evenNumbersCount(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 100);
        }
        return array;
    }

    private static int maxMinDiff(int []array){
        if (array == null){
            return 0;
        }
        OptionalInt optionalIntMin = Arrays.stream(array).min();
        Integer min = optionalIntMin.isPresent() ? optionalIntMin.getAsInt() : null;

        OptionalInt optionalIntMax = Arrays.stream(array).max();
        Integer max = optionalIntMax.isPresent() ? optionalIntMax.getAsInt() : null;
        if (max == null){
            throw new NullPointerException();
        }
        return max-min;
    }

    private static boolean isTwoEqualNumbersNear(int [] array){
        int neighbour = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == neighbour && array[i+1] == array[i]){
                return true;
            }
        }
        return false;
    }
}