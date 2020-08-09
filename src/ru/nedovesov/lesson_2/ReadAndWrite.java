package ru.nedovesov.lesson_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {

    public void writeToFile(AppData appData){
        try (BufferedWriter out = new BufferedWriter(new FileWriter("data.csv"))){
            for (int i = 0; i < appData.getHeader().length; i++) {
                if(i == appData.getHeader().length - 1){
                    out.write(appData.getHeader()[i] + "\n");
                    break;
                }
                out.write(appData.getHeader()[i] + ";");
            }
            for (int m = 0; m < appData.getData().length; m++){
                for (int n = 0; n < appData.getData()[m].length; n++){
                    if(n == appData.getData()[m].length - 1){
                        out.write(appData.getData()[m][n] + "\n");
                        break;
                    }
                    out.write(appData.getData()[m][n] + ";");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AppData readFromFile(String filename){
        String[] header = null;
        int[][] data = null;
        try (BufferedReader in = new BufferedReader(new FileReader(filename))){
            header = in.readLine().split(";");
            ArrayList<Integer> arrayListData = new ArrayList<>();
            String str = null;
            while ((str = in.readLine()) != null){
                String[] tokens = str.split(";");
                for (String s:tokens) {
                    arrayListData.add(Integer.parseInt(s));
                }
            }
            data = new int[2][arrayListData.size()/2];
            for (int i = 0, n = 0; i < 2; i++){
                for (int j = 0; j < arrayListData.size()/2; j++, n++){
                    data[i][j] = arrayListData.get(n);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new AppData(header, data);
    }
}
