package ru.nedovesov.lesson_2;

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData(new String[]{"Value1", "Value2", "Value3"},
                new int[][]{{1000, 2000, 3000}, {4000, 5000, 6000}});
        ReadAndWrite readAndWrite = new ReadAndWrite();
        readAndWrite.writeToFile(appData);
        System.out.println(readAndWrite.readFromFile("data.csv"));
    }
}
