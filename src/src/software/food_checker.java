package src.software;


import java.util.Arrays;

public class food_checker {
    /*https://adventofcode.com/2020/day/21*/

    /*mxmxvkd kfcds sqjhc nhms (contains dairy, fish)
    trh fvjkl sbzzf mxmxvkd (contains dairy)
    sqjhc fvjkl (contains soy)
    sqjhc mxmxvkd sbzzf (contains fish)*/

     public static String[] solve(String[][] input){

         String[][] allergen_add = new String[input.length][4];
         String[] ouput = new String[input.length];
         String allergenes;
         String[] split_allergenes;
         String[] allergenes_proce;
         String[] returno;

         for (int i = 0; i < input.length; i++) {

             allergenes = input[i][input[i].length-1];
             split_allergenes = allergenes.split(" ");
             allergenes_proce = new String[split_allergenes.length-1];

             // allergenes: (contains dairy fish);
             // split_allergenes: [contains, dairy, fish];

             for (int j = 1; j < split_allergenes.length; j++) {
                 //System.out.println(split_allergenes[j]);
                 allergenes_proce[j-1] = split_allergenes[j];
             }

             //System.out.println(Arrays.toString(allergenes_proce));
             // allergenes_proce: dairy, fish, dairy, soy, fish, ;


             for (int j = 0; j < input[i].length-1;j++) {
                 String txt = "";
                 txt += Arrays.toString(allergenes_proce);
                 allergen_add[i][j] = txt;
             }
             System.out.println(Arrays.toString(input[i]));
             System.out.println(Arrays.toString(allergen_add[i]));
             System.out.println( );
         }

         int zeile;
         String wort = "";
         int stelle1;
         int stelle2;
         int counter = 0;



         for (int i = 0; i < input.length; i++) {
             for (int j = 0; j < input[i].length-1; j++) {
             counter++;
             }
         }

         returno = new String[counter];
         counter = 0;


         //Zeilen
         for (int i = 0; i < input.length; i++) {
             zeile = i;
             //System.out.println(zeile);
             //Zeile 1-4 Durchgehen
             for (int j = 0; j < input[i].length-1; j++) {
                 wort = input[i][j];
                 System.out.println("Das Wort ist: " + wort);
                 stelle1 = i;
                 stelle2 = j;
                 counter++;
                 //Geht durch 13 Wörter durch
                 //Wort nehmen und wieder 3 Zeilen durchsuchen
                 for (int k = 0; k < input.length; k++) {
                     //Einzelne Zeilen vergleichen
                     System.out.println("K:" + k);
                     System.out.println("Zeile: " + zeile);
                     if (zeile != k){
                         System.out.println("worked");
                         for (int l = 0; l < input[k].length-1 ; l++) {
                             if (input[k][l].equals(wort)) {
                                 System.out.println(wort);
                                 System.out.println("Hier: " + k +", "+ l);
                                 String st1 = allergen_add[i][j];
                                 String st2 = allergen_add[k][l];
                                 st1 = st1.substring(1, st1.length() - 1);
                                 st2 = st2.substring(1, st2.length() - 1);
                                 String[] arr1 =null;
                                 String[] arr2 =null;
                                 try {
                                     arr1 = st1.split(",");
                                 }catch (Exception e){
                                 }

                                 try {
                                     arr2 = st2.split(",");
                                 }catch (Exception e){
                                 }

                                 System.out.println(st1);
                                 System.out.println(st2);
                                 System.out.println(Arrays.toString(arr1));
                                 System.out.println(Arrays.toString(arr2));

                                 try {
                                     if (st2.equals(arr1[0])){
                                         System.out.println(wort);
                                         System.out.println(arr1[0]);
                                         returno[counter] = wort + " Allergen: " + arr1[0];
                                     }
                                     if (st2.equals(arr1[1])){
                                         System.out.println(wort);
                                         System.out.println(arr1[1]);
                                         returno[counter] = wort + " Allergen: " + arr1[1];
                                     }
                                     if (st1.equals(arr2[0])){
                                         System.out.println(wort);
                                         System.out.println(arr2[0]);
                                         returno[counter] = wort + " Allergen: " + arr2[0];
                                     }
                                     if (st1.equals(arr2[1])){
                                         System.out.println(wort);
                                         System.out.println(arr2[1]);
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                     }
                                     if (arr1[1].equals(arr2[0])){
                                         returno[counter] = wort + " Allergen: " + arr2[0];
                                     }
                                 }
                                 catch (Exception e){
                                 }
                             }
                         }
                     }
                     System.out.println("-----------------------------");
                 }
             }
         }
         return returno;
     }
}
