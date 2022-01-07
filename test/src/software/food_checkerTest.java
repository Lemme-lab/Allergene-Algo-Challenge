package src.software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class food_checkerTest {

    String input1[][] =   {
            {"mxmxvkd", "kfcds",  "sqjhc", "nhms", "contains dairy fish"},
            {"trh", "fvjkl", "sbzzf", "mxmxvkd", "contains dairy"},
            {"nhms", "fvjkl", "contains fish"},
            {"nhms", "mxmxvkd", "sbzzf", "contains fish"}
    };
    String output1[] = {"mxmxvkd Allergen: dairy", "nhms Allergen: fish", null, null, null, null, null, null, null, null, null, null, null};


    String input2[][] =   {
            {"nhms", "kfcds",  "sqjhc", "mxmxvkd", "contains dairy"},
            {"fvjkl", "trh", "sbzzf", "nhms", "contains dairy fish"},
            {"nhms", "sbzzf", "contains fish soy"},
            {"mxmxvkd", "nhms", "sbzzf", "contains fish"}
    };

    String output2[] = {"nhms Allergen: dairy", "sbzzf Allergen: fish", null, null, null, null, null, null, null, null, null, null, null};

    String input3[][] =   {
            {"nhms", "kfcds",  "sqjhc", "mxmxvkd", "contains dairy fish"},
            {"fvjkl", "trh", "sbzzf", "nhms", "contains dairy"},
            {"kfcds", "sbzzf", "contains fish"},
    };
    String output3[] = {"nhms Allergen: dairy", "kfcds Allergen: fish", null, null, null, null, null, null, null, null};


    String input4[][] =   {
            {"mxmxvkd", "kfcds",  "sqjhc", "nhms", "contains dairy fish"},
            {"trh", "fvjkl", "sbzzf", "mxmxvkd", "contains dairy"},
            {"sqjhc", "fvjkl", "contains soy"},
            {"sqjhc", "mxmxvkd", "sbzzf", "contains fish"}
    };

    String output4[] = {"nhms Allergen: dairy", "kfcds Allergen: fish", "fvjkl Allergene: soy", null, null, null, null, null, null, null};




    @Test
    void solve1() {assertArrayEquals(output1, food_checker.solve(input1));}
    @Test
    void solve2() {assertArrayEquals(output2, food_checker.solve(input2));}
    @Test
    void solve3() {assertArrayEquals(output3, food_checker.solve(input3));}
    @Test
    void solve4() {assertArrayEquals(output3, food_checker.solve(input3));}





}