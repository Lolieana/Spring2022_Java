package Homework;

public class Homework7 {
// Due Date: Mar 27 2022

    public static void main (String[] args) {

        String question_1 = "make America great again";
        System.out.println("Abbreviation is ---> " + makeAbbreviation(question_1));

        String question_2 = "make America great again";
        System.out.println("Titlecase is ---> " + makeTitlecase(question_2));

        int[] question_3 = {23, 54, 76, 12, 67, 91, 23,-2, -9, -4, -7, -9, -55};
        System.out.println("Max value in array: " + findMaxInArray(question_3));

        String question4 = "level";
        System.out.println("Is palindrome? ---> " + isPalindrome(question4));

        String[] question_5 = {"happy", "Happy new year", "peaceful" , "king kong"};
        System.out.println("Longest string is ---> " + getLongestStr(question_5));


    }

    /**
     * Q1:
     * Create a method to make abbreviation for a given sentence
     * Method should return
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method?   -   makeAbbreviation
     *  2. do I need any input from user?   -   1 (String)
     *  3. should we return any value in the end of method? - Yes
     *      If yes, then what is the datatype of returned value? - String
     *
     * make America great again -> MAGA
     * outfit of the day -> OOTD
     * happy birthday to you -> HBTY
     * Good morning -> GM
     * Happy new Year -> HNY
     * Happy birthday to you dear -> HBTYD
     * happy new year to you dear -> HNYTYD
     *
     * public static String makeAbbreviation(String inputStr) {
     *      // code
     * }
     */
    public static String makeAbbreviation ( String sentenceInput) {
        String makeAbbreviation = "";
        String[] sentence1_Split = sentenceInput.split(" ");
        for ( int i = 0 ; i < sentence1_Split.length ; i++ ) {
            makeAbbreviation = makeAbbreviation + sentence1_Split[i].toUpperCase().substring(0,1);
        }
      return makeAbbreviation;
    }


    /**
     * Q2:
     * Create a method that will change the given sentence in Titlecase
     * Method should return
     *
     * HappY nEW YEAR to YoU dEAr -> Happy New Year To You Dear
     * gooD morNING -> Good Morning
     * make AMERICA GreAT AgAIn -> Make America Great Again
     *
     */
    public static String makeTitlecase ( String givingStr) {
        String titlecase = "";
        String[] sentence2_Spli = givingStr.split(" ");
        for ( int k = 0 ; k <= sentence2_Spli.length-1 ; k++ ) {
            titlecase += sentence2_Spli[k].substring(0,1).toUpperCase() + sentence2_Spli[k].substring(1).toLowerCase() + " ";
        }
        return titlecase;
    }

    /**
     * Q3:
     * Create method to find the maximum value from given int-array
     * Method should return
     *
     * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
     *
     * int[] = {23, 54, 76, 12}     ->  76
     *
     * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxInArray
     *  2. do I need any input from user? - 1 (int[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - int
     *
     * int maxNum = inputArray[0]
     *
     * if (inputArray[1] > maxNum)
     *      maxNum = inputArray[1]
     * if (inputArray[2] > maxNum)
     *      maxNum = inputArray[2]
     */
    public static int findMaxInArray ( int[] givingArray) {
        int maxnum = givingArray[0];
        for ( int i=1; i < givingArray.length-1; i++) {
            if ( givingArray[i] > maxnum) {
                maxnum += givingArray[i];
            }
        }
        return maxnum;
    }

    /**
     * Q4:
     * Create a method to find if the given string is palindrome (DO NOT ignore case)
     * Method should return (boolean)
     *
     * "hello" -> "olleh"   (not palindrome)
     * "eye" -> "eye"       (palindrome)
     *
     *
     * "level" -> true
     * "eye" -> true
     * "fall" -> false
     * "Level" -> false
     * "eYe" -> true
     * Eye -> false
     */
    public static boolean isPalindrome ( String strToCheck) {
        String reversedStr = "";
        String[] splitString = strToCheck.split("");
        for ( int i=1; i<=splitString.length; i++){
                reversedStr += splitString[splitString.length - i];

        }
        return strToCheck.equals(reversedStr);
    }



    /**
     * Q5:
     * Create a method to find the longest String in the given String-array
     * Method should return (String)
     *
     * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxString
     *  2. do I need any input from user? - 1 (String[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - String
     */
    public static String getLongestStr ( String[] userInput) {
        String maxStr = "";
        for ( int j=0; j<= userInput.length-1; j++) {
             if (userInput[j].length() > maxStr.length()) {
                  maxStr = userInput[j];
             }
        }
       return maxStr;
    }


}
