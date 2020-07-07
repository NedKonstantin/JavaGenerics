package ru.nedovesov.lesson_1;

public class ArrayParameters<T> {
    private T[] arr;

    public ArrayParameters(T... arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }
// Метод, меняющий две переменных местами
    public void changePlaceElements(int i, int j) {
        if (checkIndex(i, j)) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.println("Incorrect index!");
        }
    }

    private boolean checkIndex(int i, int j) {
        return i >= 0 && i < arr.length && j >= 0 && j < arr.length && i != j;
    }
}
