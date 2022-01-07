package src.software;

import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String input[][] =   {
                {"mxmxvkd", "kfcds",  "sqjhc", "nhms", "contains dairy fish"},
                {"trh", "fvjkl", "sbzzf", "mxmxvkd", "contains dairy"},
                {"sqjhc", "fvjkl", "contains soy"},
                {"sqjhc", "mxmxvkd", "sbzzf", "contains fish"}
        };
        System.out.println(Arrays.toString(food_checker.solve(input)));
    }
}
