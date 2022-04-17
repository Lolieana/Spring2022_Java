package Homework;

import java.util.*;

public class Homework11 {

    public static void main (String[] args) {
     Map < Integer,String > studentId = new HashMap<>();
     studentId.put(101 , "HAppy");
     studentId.put(102 , "King");
     studentId.put(103 , "HAPPYd");
     studentId.put(104 , "live");
     studentId.put(105 , "Happyr");
     studentId.put(106 , "Livew");
     getCommonValues(studentId);



        String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
               "green", "blue", "yellow", "grey", "Green", "blue", "green", "green",
               "green", "green" };

        System.out.println(countColor(colorNames));







    }
    /**
     *
     * Due Date: April-16 2022
     *
     * Question-1:
     * Create a HashMap with
     *      Integer as key and
     *      String as value
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
     *
     *  Create a method that will the HashMap<Integer, String> as Input
     *  print the keys with common values (ignoring cases)
     *
     *      "Happy" is present with keys = 101, 103, 105
     *      "Live" is present with keys = 104, 106
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPiness") , (104 = "life") , (105 = "king and queen"), (106 = "Live") }
     *  When no keys are having common values, method should print,
     *      "No keys have common values"
     *
     *
     */
    public static void getCommonValues (Map<Integer,String> userInput) {
        Map<String,List<Integer>> nameMap = new HashMap<>();
        Set<Integer> allKeys = userInput.keySet();
        for ( Integer key : allKeys) {
            String value = userInput.get(key).toLowerCase();
            List<Integer> keysToValues;
            if (nameMap.containsKey(value)) {
                keysToValues = nameMap.get(value);
            } else {
                keysToValues = new ArrayList<>();
            }
            keysToValues.add(key);
            nameMap.put(value, keysToValues);
        }
        System.out.println(userInput);
        System.out.println(nameMap);
        Set<String> keySet = nameMap.keySet();
        boolean duplicateFound = false;
        for ( String key : keySet) {
            if ( nameMap.get(key).size() > 1 ) {
                System.out.println(key + " is present with keys = " + nameMap.get(key));
                duplicateFound = true;
            }
        }
        if (!duplicateFound){
            System.out.println("No keys have common values");
        }




    }

    /**
     * Question-2:
     *
     * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
     *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
     *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
     *             "green", "green"};
     *
     *
     * Create a method that will return the name(s) of color appearing max number of times in the array.
     *
     * green - 7
     * blue - 5
     * red - 10
     * yellow - 8
     * grey - 6
     *
     * method will return "red"
     *
     *
     * green - 7
     * blue - 10
     * red - 10
     * yellow - 8
     * grey - 6
     *
     * method will return "red", "blue"
     *
     *
     *
     */
    public static List<String> countColor (String[] colorArr) {
      Map < String,Integer> countColorMap = new HashMap<>();
      for ( String color : colorArr) {

          color = color.toLowerCase();

          if (countColorMap.containsKey(color)) {
              Integer count = countColorMap.get(color);
              countColorMap.put(color, count + 1);
          } else {
              countColorMap.put(color, 1);
          }

      }
          System.out.println(countColorMap);

        Collection <Integer> allColorCount = countColorMap.values();
        Integer maxCount = 0;

        for (Integer value : allColorCount) {
            if (value > maxCount) {
                maxCount = value;
            }
        }
        //  System.out.println(maxCount);

        List<String> colorList = new ArrayList<>();
        Set<String> colorKeys = countColorMap.keySet();
        for (String colorName : colorKeys) {
            if ( countColorMap.get(colorName) == maxCount) {
                colorList.add(colorName);

            }
        }

        return colorList;
    }





}
