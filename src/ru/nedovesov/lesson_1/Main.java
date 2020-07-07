package ru.nedovesov.lesson_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayParameters<Integer> firstObj = new ArrayParameters<Integer>(20, 30, 40, 54, 24, 12, 33);
        System.out.println(Arrays.toString(firstObj.getArr()));
        firstObj.changePlaceElements(2, 0);
        System.out.println(Arrays.toString(firstObj.getArr()));
    }
}
