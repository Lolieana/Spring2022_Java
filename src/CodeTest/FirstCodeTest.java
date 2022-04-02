package CodeTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstCodeTest {

    public static void main ( String[] args ) {

        System.out.println("**** Question1 answer");
        int[] question1_A = {32, 54, 12, 67, 2, 5};
        System.out.println("Original array --> " + Arrays.toString(question1_A));
        System.out.println("Array after sorting --> " + Arrays.toString(sortArray(question1_A)));

        int[] question1_B = {5, 4, 3, 1, 2};
        System.out.println("Original array --> " + Arrays.toString(question1_B));
        System.out.println("Array after sorting --> " + Arrays.toString(sortArray(question1_B)));

        int[] question1_C = {90, 34, 12, 4};
        System.out.println("Original array --> " + Arrays.toString(question1_C));
        System.out.println("Array after sorting --> " + Arrays.toString(sortArray(question1_C)));

        System.out.println("\n**** Question2 answer****");
        int question2_A = 123;
        System.out.println("Input number --> " + question2_A);
        System.out.println("Value after adding all digits --> " + getSum(question2_A));

        int question2_B = 323;
        System.out.println("Input number --> " + question2_B);
        System.out.println("Value after adding all digits --> " + getSum(question2_B));

        int question2_C = 90;
        System.out.println("Input number --> " + question2_C);
        System.out.println("Value after adding all digits --> " + getSum(question2_C));

        System.out.println("\n**** Question3 answer****");
        int[] question3_A = {23, 54, 67, 12, 34, 23, 56};
        int question3_ANum = 23;
        System.out.println("Original array --> " + Arrays.toString(question3_A) + " 'Value to remove'--> " + question3_ANum ) ;
        System.out.println("Array after removing the value --> " + Arrays.toString(removingIntVal(question3_A,question3_ANum)));

        int[] question3_B = {23, 5, 67, 87, 10, 5, 34, 98, 66, 55};
        int question3_BNum = 5;
        System.out.println("Original array --> " + Arrays.toString(question3_B) + " 'Value to remove'--> " + question3_BNum ) ;
        System.out.println("Array after removing the value --> " + Arrays.toString(removingIntVal(question3_B,question3_BNum)));

        int[] question3_C = {22, 33, 44, 55};
        int question3_CNum = 11;
        System.out.println("Original array --> " + Arrays.toString(question3_C) + " 'Value to remove'--> " + question3_CNum ) ;
        System.out.println("Array after removing the value --> " + Arrays.toString(removingIntVal(question3_C,question3_CNum)));

        System.out.println("\n**** Question4 answer****");
        String[] question4_A = {"happY", "king", "peace", "living standard"};
        String[] question4_B =  {"king kong", "Happy", "PEACE"};
        getCommonString( question4_A,question4_B);

        String[] question4_C = {"ab", "abcd", "abc", "abcde", "defg", "koli" };
        String[] question4_D =  {"abcde", "jhuy", "plot", "koli"};
        getCommonString(question4_C,question4_D);




    }



    /**
     * Ques-1:
     * Create a method to return an int-array after sorting a given input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     * int[] inputArr = {32, 54, 12, 67, 2, 5};
     * int[] outputArr = sortArray(inputArr);   // {2, 5, 12, 32, 54, 67}
     *
     * int[] inputArr = {5, 4, 3, 1, 2};
     * int[] outputArr = sortArray(inputArr);   // {1, 2, 3, 4, 5}
     */
    public static int[] sortArray ( int[] givingArray) {
        for (int i = 1; i <= givingArray.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (givingArray[j] < givingArray[j - 1]) {
                    givingArray[j] = givingArray[j] + givingArray[j - 1];
                    givingArray[j - 1] = givingArray[j] - givingArray[j - 1];
                    givingArray[j] = givingArray[j] - givingArray[j - 1];
                }
            }

        }
        return givingArray;
    }

        /**
         * Ques-2:
         * Create a method to return the sum of digits in input-int-value
         * points: 20
         */
        /*
         *
         * eg:
         * input -> 123
         * returned value -> 6  (1 + 2 + 3)
         *
         * input -> 323
         * returned value -> 8  (3 + 2 + 3)
         *
         * input -> 90
         * returned value -> 9  (9 + 0)
         *
         * int result1 = addDigits(123);    // result1 = 6
         *
         * int result2 = addDigits(575);    // result2 = 17
         *
         *
         *
         */
    public static int getSum (int number) {
        int sum = 0;
        String convertIntToStr = String.valueOf(number);
        String[] strSplit = convertIntToStr.split("");
        for (String val : strSplit) {
            sum += Integer.valueOf(val);
        }


       return sum;
    }
        /**
         * Ques-3:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         * points: 30
         */
        /*
         *
         * eg:
         * input -> 23, {23, 54, 67, 12, 34, 23, 56}
         * returned array -> {54, 67, 12, 34, 56}
         *
         * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
         * returned array -> {23, 67, 87, 10, 34, 98, 66, 55}
         *
         * input -> 11, {22, 33, 44, 55}
         * returned array -> {22, 33, 44, 55}
         *
         *
         * int[] inputArr = {23, 54, 67, 12, 34, 23, 56};
         * int[] outputArr = removeValueFromArray(23, inputArr);    // {54, 67, 12, 34, 56}
         *
         * int[] inputArr2 =  {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
         * int[] outputArr2 = removeValueFromArray(5, inputArr2);    // {23, 67, 87, 10, 34, 98, 66, 55}
         *
         */
    public static int[] removingIntVal ( int[] inputArr, int valToRemove) {
        int count = 0;
        for ( int num : inputArr) {
            if (num == valToRemove) {
                count++;
            }
        }
        int[] restOfValuesArr = new int[inputArr.length - count];
        int j=0;
        for (int num : inputArr) {
            if (num != valToRemove) {
                restOfValuesArr[j] = num;
                j++;
            }
        }
        return restOfValuesArr;

        }


        /**
         * Ques-4:
         * Create a method to print the common Strings values in two input-String-arrays
         * points: 40
         * Note: two input-String-arrays can be of same size or different size
         */
        /*
         *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * Method should print ->
         * happy
         * peace
         *
         * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
         * Method should print ->
         * abcde
         * koli
         *
         * String[] inputArr1 = {"happY", "king", "peace", "living standard"};
         * String[] inputArr2 = {"king kong", "Happy", "PEACE"};
         *
         * printCommons(inputArr1, inputArr2);
         * happy
         * peace
         *
         *
         * String[] inputArr3 = {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”};
         * String[] inputArr4 = {“abcde”, “jhuy”, “plot”, “koli”};
         *
         * printCommons(inputArr3, inputArr4);
         * abcde
         * koli
         *
         *
         *
         */
    public static void getCommonString ( String[] str1, String[] str2){
     for ( String word1 : str1){
         for ( String word2 : str2){
             if ( word1.equalsIgnoreCase(word2)) {
                 System.out.println(word1);
             }
         }
     }
    }






    }
