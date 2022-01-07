package src.software;


import java.util.Arrays;

public class food_checker {
     public static String[] solve(String[][] input){

         String[][] allergen_add = new String[input.length][4];
         String[] ouput = new String[input.length];
         String allergenes;
         String[] split_allergenes;
         String[] allergenes_proce;
         String[] returno;
         String[] dut;

         for (int i = 0; i < input.length; i++) {

             allergenes = input[i][input[i].length-1];
             split_allergenes = allergenes.split(" ");
             allergenes_proce = new String[split_allergenes.length-1];

             for (int j = 1; j < split_allergenes.length; j++) {
                 allergenes_proce[j-1] = split_allergenes[j];
             }

             for (int j = 0; j < input[i].length-1;j++) {
                 String txt = "";
                 txt += Arrays.toString(allergenes_proce);
                 allergen_add[i][j] = txt;
             }
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
         dut = new String[counter];
         counter = 0;
         boolean doub_bool = false;

         for (int i = 0; i < input.length; i++) {
             zeile = i;
             for (int j = 0; j < input[i].length-1; j++) {
                 wort = input[i][j];
                 stelle1 = i;
                 stelle2 = j;

                 for (int k = 0; k < input.length; k++) {
                     if (zeile != k){
                         for (int l = 0; l < input[k].length-1 ; l++) {
                             for (int m = 0; m < dut.length; m++) {
                                 try {
                                     if(dut[m].equals(wort)){
                                         doub_bool = true;
                                     }
                                 }catch(Exception e){
                                 }
                             }
                             if (input[k][l].equals(wort) && doub_bool == false) {
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

                                 try {
                                     arr2[1] = arr2[1].replace(" ", "");
                                 }catch (Exception e){}

                                 try {
                                     arr1[1] = arr1[1].replace(" ", "");
                                 }catch (Exception e){}


                                 try {
                                     if (st2.equals(arr1[0])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr1[0];
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (st2.equals(arr1[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr1[1];
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (st1.equals(arr2[0])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[0];
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (st1.equals(arr2[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }

                                 try {
                                     if (arr1[0].equals(arr2[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (arr1[0].equals(arr2[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                             }
                             doub_bool = false;
                         }
                     }
                 }
             }
         }
         return returno;
     }
}
