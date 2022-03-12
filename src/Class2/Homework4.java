package Class2;

public class Homework4 {

    public static void main(String[] args) {


        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        System.out.println(" *** Task 1 ***");
        String sentence1 = "Hello world";

        // value of sentence1
        System.out.println("Value of sentence1 --> " + sentence1);

        // length of sentence1
        int sentence1_L = sentence1.length();
        System.out.println("Length of sentence1 is --> " + sentence1_L);

        // value of result1
        int result1 = sentence1_L >= 5 ? 10 : 15;
        System.out.println("Value of result1 using ternary operator --> " + result1);


        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */
        System.out.println("\n *** Task 2 ***");

        // 1. length of my full name
        String myName = "Lolieana Botros";
        int myName_L = myName.length();
        System.out.println("My name length = " + myName_L);

        // 2. check if my name ends with "a" (ignore the case)
        String checkFor = "a".toLowerCase();
        String myNameEndsWith =myName.toLowerCase();
        System.out.println("Is my name ends with letter 'a'? --> " + myNameEndsWith.endsWith(checkFor));

        // 3. check if my name contains with "a" (ignore the case)
        System.out.println("Is my name contains 'a'? --> " + myNameEndsWith.contains(checkFor));




        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        System.out.println("\n *** Task 3 ***");

        // 1. task3-value contains "king" (ignore cases)
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        task3 = task3.toUpperCase();
        String wordTo_U = "king".toUpperCase();
        System.out.println("Is task 3 sentence contains 'king'? --> " + task3.contains(wordTo_U));

        // 2. index of first occurrence of "EW" (ignore cases)
        String firstOccurrenceTo_U = "EW".toUpperCase();
        int indexOf_EW = task3.indexOf("EW");
        System.out.println("What is the index of 'EW' in task3 sentence? --> " + indexOf_EW);



        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        System.out.println("\n *** Task 4 ***");
        String task4 = "queen";
        String task4_Sub = task4.substring(0,1).toUpperCase() + task4.substring(1).toLowerCase();
        //String task4_SubTo_U = task4.substring(1).toLowerCase();
        //System.out.println(task4_Sub+task4_SubTo_U);
        System.out.println("Titlecase for task4 word is --> " + task4_Sub);



    }
}
