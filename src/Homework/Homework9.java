package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework9 {

    // Due date: Sunday (Apr 10)

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");         //  ["Happy"]
        names.add("GroW");          //  ["Happy", "GroW"]
        names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
        names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
        names.add("Learning");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("QUeeN");
        names.add("YouNG");
        names.add("OLD");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");


        System.out.println("Array list size = " + names.size());

        System.out.println("Question 1 answer ");
        System.out.println(getCount("HAppY", names)); // should return 3
        // getCount("JAVA", names); should return 0
        System.out.println(getCount("JAVA", names));  // should return 0


        System.out.println("\nQuestion 2 answer ");
        // getContainsCount("HAp", names);  should returns 6
        System.out.println(getContainsCount("HAp", names));
        // getContainsCount("A", names);  should returns 17
        System.out.println(getContainsCount("A", names));




        System.out.println("\nQuestion 3 answer ");
        int[] question3 = {23, 5, 67, 87, 10, 5, 23,23, 98, 66, 55,23};
        System.out.println(Arrays.toString(removingInput(23, question3)));


    }

    /**
     * Q1:
     *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */
     public static int getCount(String valToCheck, ArrayList<String> arrayList) {
        int count = 0;
        for ( int i=0; i<=arrayList.size()-1; i++) {
            if ( arrayList.get(i).equalsIgnoreCase( valToCheck)) {
                count ++;
            }
        }
        return count;
     }


    /**
     * Q2:
     *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */
     public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
         int count = 0;
         for ( int i=0; i<=arrayList.size()-1; i++) {
             if ( arrayList.get(i).toLowerCase().contains(valToCheck.toLowerCase())) {
                 count ++;
             }
         }
         return count;
     }

    /**
     * Q3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     *
     * -> How to create List using Array and vice-versa
     *
     * create a List using values of input-int-array
     * remove the input-int-value from List
     * create an int-array using List-values
     * return int-array
     *
     */
    public static int[] removingInput ( int valToRemove, int[] input ) {
        List<Integer> valList = new ArrayList<>();
        for ( int val : input) {
            valList.add(val);
        }

        List<Integer> listToRemove = new ArrayList<>();
        listToRemove.add(valToRemove);
        valList.removeAll(listToRemove);

        int[] arrList = new int[valList.size()];
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = valList.get(i);
        }

        return arrList;

    }


}
