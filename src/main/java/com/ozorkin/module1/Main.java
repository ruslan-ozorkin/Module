package com.ozorkin.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArraysFunction arraysFunction = new ArraysFunction();

        System.out.println("Example of locked array: ");
        int [] arrayToLock = new int[] {1,2,3};
        Lock lock = new Lock(arrayToLock);
        System.out.println("Array before changes: " );
        lock.printArray(arrayToLock);
        lock.getValues()[1] = 10;
        System.out.println("Array after changes: " );
        lock.printArray(arrayToLock);

        System.out.println("Input length of array i>= 10");
        int inputArrayLength = Integer.parseInt(bufferedReader.readLine());

        while (inputArrayLength < 10) {
            System.out.println("Input number which >= 10");
            inputArrayLength = Integer.parseInt(bufferedReader.readLine());
        }

        int [] arrays = arraysFunction.fillArray(inputArrayLength);
        System.out.println("Created array: " + Arrays.toString(arrays));

        while (true) {
            System.out.println("""
                    Chose the way to sort:
                    1 ascending sort
                    2 descending Sort
                    3 third index of array into cube
                    0 Exit""");

            String inputCase = bufferedReader.readLine();
            switch (inputCase) {
                case "1" -> System.out.println(Arrays.toString(arraysFunction.ascendingSort(arrays)));
                case "2" -> System.out.println(Arrays.toString(arraysFunction.descendingSort(arrays)));
                case "3" -> System.out.println(Arrays.toString(arraysFunction.thirdIndexIntoCube(arrays)));
                case "0" -> {
                    System.out.println("Good bye!");
                    return;
                }
                default -> System.out.println("Chose the number between 1 and 3. Or 0 for exit");
            }
        }
    }

}
