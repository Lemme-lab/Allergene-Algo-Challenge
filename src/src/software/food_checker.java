package src.software;


import java.util.Arrays;

public class food_checker {

    static String[][] allergen_add;
    static String[] ouput;
    static String allergenes;
    static String[] split_allergenes;
    static String[] allergenes_proce;
    static String[] found_words;

     public static String[] solve(String[][] input){
         String[] returno;

         String[][] allergene_add = pre_proce(input);
         returno =  search_algo(input,allergene_add);
         //search_hidden(returno, input);

         return post_proce(returno);
     }

     public static String[][] pre_proce(String[][] input){
        allergen_add = new String[input.length][4];
        ouput = new String[input.length];

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
         return allergen_add;
     }

     public static String[] search_algo(String[][] input, String[][] allergen_add){
         String[] dut;
         String[] returno;
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
         found_words = new String[counter];
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
                                         found_words[counter] = wort;
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (st2.equals(arr1[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr1[1];
                                         found_words[counter] = wort;
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (st1.equals(arr2[0])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[0];
                                         found_words[counter] = wort;
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (st1.equals(arr2[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                         found_words[counter] = wort;
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }

                                 try {
                                     if (arr1[0].equals(arr2[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                         found_words[counter] = wort;
                                         counter++;
                                     }
                                 }catch (Exception e){

                                 }
                                 try {
                                     if (arr1[0].equals(arr2[1])){
                                         dut[counter] = wort;
                                         returno[counter] = wort + " Allergen: " + arr2[1];
                                         found_words[counter] = wort;
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

     /*public static String[] search_hidden(String[] returno,String[][] input){

         int counter = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {

                for (int k = 0; k < found_words.length; k++) {
                    if(found_words[k] != null){
                        for (int l = 0; l < input[i].length; l++) {
                            if(found_words[k] == input[i][l]){
                                counter++;
                                System.out.println(counter);
                            }
                        }
                    }
                }
                if(counter ==  input[i].length - 2){
                    System.out.println("found");
                    counter = 0;
                }else{
                    counter = 0;
                }

            }
        }


      return null;
    }*/

     public static String[] post_proce(String[] returno){
         int counter = 0;
        for (int i = 0; i < returno.length; i++) {
            if(returno[i] != null){
                counter++;
            }
        }
        String[] post_ouput = new String[counter];
        for (int i = 0; i < counter; i++) {
            post_ouput[i] = returno[i];
        }
         return post_ouput;
    }


}


