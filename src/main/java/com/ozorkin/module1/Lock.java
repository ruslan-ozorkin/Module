package com.ozorkin.module1;


import java.util.Arrays;

public class Lock {
    private final int[] original;
    private final int[] auxiliary;


    public Lock(int[] array) {
        original = new int[array.length];
        auxiliary = new int[array.length];
        System.arraycopy(array, 0, original, 0, array.length);
    }

    public int[] getValues() {
        System.arraycopy(original, 0, auxiliary, 0, original.length);
        return auxiliary;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(original));
    }

}
