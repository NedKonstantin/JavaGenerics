package ru.nedovesov.lesson_2;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + dataToString() +
                '}';
    }

    private String dataToString(){
        String str = "[";
        for (int i = 0; i < data.length; i++){
            String substr = "[";
            for (int j = 0; j < data[i].length; j++){
                if(j == data[i].length-1){
                    substr += data[i][j] + "]";
                    break;
                }
                substr += data[i][j] + ", ";
            }
            str += substr;
        }
        return str + "]";
    }
}
