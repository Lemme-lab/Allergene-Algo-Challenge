package src.software;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String input[][] =   {
        {"mxmxvkd", "kfcds",  "sqjhc", "nhms", "contains dairy fish"},
        {"trh", "fvjkl", "sbzzf", "mxmxvkd", "contains dairy"},
        {"sqjhc", "fvjkl", "contains fish"},
        {"sqjhc", "mxmxvkd", "sbzzf", "contains fish"}
    };
        System.out.println(Arrays.toString(food_checker.solve(input)));
    }


}
