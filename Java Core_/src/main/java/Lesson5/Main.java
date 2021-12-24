package Lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("newfile.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example.csv");
    }

}