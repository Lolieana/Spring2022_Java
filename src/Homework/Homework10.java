package Homework;

import java.util.*;

public class Homework10 {

    public static void main(String[] args) {
        System.out.println("*** Question 1 *** ");
     String[] question1 = {"happy", "Happy new year", "peaceful" , "king kong","happy"};
        System.out.println("Is there any duplicate found? --> " + findDuplicate(question1));

        System.out.println("\n*** Question 2 *** ");
        String[] question2 = {"abc" , "AbC" , "DEF", "AbC", "XYZ", "dEf"};
        System.out.println("Duplicate values are : --> " + getDuplicate(question2));

    }

    // Due Date -> Apr 12
        /**
         * Question-1:
         * Create a method that can return if a given-String-Array has duplicate values or not.
         *
         * Input: String-Array
         * Return type: boolean
         *
         *
         *
         * create String-List using given-String-Array
         * create a String-Set using String-List
         * compare size of Set and List
         */
        public static boolean findDuplicate ( String[] userInput) {
            boolean isDuplicate = true;
            ArrayList<String> createList = new ArrayList<>();
            for ( String names : userInput) {
                createList.add(names);
            }
            Set<String> creatSet = new HashSet<>(createList);
             for ( String names2 : createList) {
                 creatSet.add(names2);
             }

             if ( createList.size() == creatSet.size()) {
                 isDuplicate = false;
             }

            System.out.println("ArrayList size --> " + createList.size());
            System.out.println("Hashset size --> " + creatSet.size());

            return isDuplicate;
        }




        /**
         * Question-2:
         * Create a method that would return the duplicate values of given-String-array (ignore the case)
         *
         * Input: String-Array
         * Return type:     (one of these -> Array, List, Set)
         *
         *
         * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
         *
         * "abc", "def"
         */
        public static Set<String> getDuplicate ( String[] givingArray) {
         Set<String> convertToHash = new HashSet<>();
         for ( int i=0 ; i<= givingArray.length-1 ; i++) {
             for ( int j=i+1 ; j<=givingArray.length-1 ; j++){
                 if ( givingArray[i].equalsIgnoreCase(givingArray[j])) {
                     convertToHash.add(givingArray[i].toLowerCase());
                 }
             }
         }
         return convertToHash;
        }

























}
