package com.ozorkin.module1;

import java.util.Random;

public class ArraysFunction {
   private final Random random = new Random();

    public  int [] fillArray(int input){
        int [] array = new int[input];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100,100);
        }
        return array;
    }

    public  int [] ascendingSort (int [] numbers) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        return numbers;
    }
    public  int [] descendingSort (int [] numbers) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    isSorted = false;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        return numbers;
    }

    public  int [] thirdIndexIntoCube (int [] numbers) {
        for (int i = 2; i < numbers.length; i+=3) {
            numbers[i] = numbers[i]*numbers[i]*numbers[i];
        }

        return numbers;
    }

}
