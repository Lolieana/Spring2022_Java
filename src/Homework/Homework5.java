package Class2;

import java.util.Arrays;

public class Homework5 {
    public static void main (String[] args) {


        // Due date: Sunday Mar 20
        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         */
        // Q1 Answer:
        System.out.println("**** Question 1 ****");

        String country = "USA";
        System.out.println("Country = " + country);
        //System.out.println("Country name length = " + country.length());    // <-- CANNOT do it.
        int country_Length = country.split("").length;
        System.out.println("Country Length --> " + country_Length);

        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */
        // Q2 Answer:
        System.out.println("\n**** Question 2 ****");

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("Sentence 2 is --> " + sentence2);
        String [] sentence2_AfterSplit = sentence2.split(" ");
        System.out.println("sentence2 length = " + sentence2_AfterSplit.length);


        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        //Q3 Answer:
        System.out.println("\n**** Question 3 ****");

        String sentence3 = "outFit OF the DAY";
        System.out.println("Sentence3 is --> " + sentence3);
        String abbreviation = " ";
        String [] sentence3_AfterSplit = sentence3.toUpperCase().split(" ");
        String  firstLetter = sentence3_AfterSplit[0].substring(0,1);
        String secondLetter = sentence3_AfterSplit[1].substring(0,1);
        String thirdLetter = sentence3_AfterSplit[2].substring(0,1);
        String fourthLetter = sentence3_AfterSplit[3].substring(0,1);
        abbreviation = firstLetter + secondLetter + thirdLetter + fourthLetter;
        System.out.println("Abbreviation for 4-word sentence = " + abbreviation);

        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         * int num = 32
         */
        // Q4 Answer:
        System.out.println("\n**** Question 4 ****");

        int number =30;
        System.out.println("Number to check is = " + number);
        if ( number % 5 == 0 && number % 3 != 0 ) {
            System.out.println("Divisible by 5");
        } else if ( number % 3 == 0 && number % 5 != 0  ) {
            System.out.println("Divisible by 3");
        } else if ( number % 5 == 0 && number % 3 == 0  ) {
            System.out.println("Divisible by 5 and 3");
        } else {
            System.out.println("NOT divisible by 5 and 3");
        }

        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         *
         */
        // Q5 Answer:
        System.out.println("\n**** Question 5 ****");

        double studentScore = 120 ;
        int maxScore = 200;
        double percentage = ( studentScore / maxScore ) * 100;

        if ( studentScore > maxScore) {
            System.out.println("Invalid student score entered");
        }
        if ( maxScore <= 0 ) {
            System.out.println("Invalid max score entered");
        }

        if ( percentage >= 91 && percentage <= 100) {
            System.out.println("Your Grade is 'A', and Your Percentage is " + percentage );
        } else if ( percentage >= 81 && percentage <= 90.99) {
            System.out.println("Your Grade is 'B', and Your Percentage is " + percentage);
        } else if ( percentage >= 71 && percentage <= 80.99) {
            System.out.println("Your Grade is 'C', and Your Percentage is " + percentage);
        } else if ( percentage >= 61 && percentage <= 70.99) {
            System.out.println("Your Grade is 'D', and Your Percentage is " + percentage);
        } else if ( percentage < 60.99 ) {
            System.out.println("Your Grade is 'E', and Your Percentage is " + percentage);
        }



        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         */
        // Q6 Answer:
        System.out.println("\n**** Question 6 ****");
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
        for ( int i = 0 ; i <= words.length-1 ; i++ ) {
            if ( words[i].length() > 5 && words[i].toLowerCase().startsWith("l") ) {
                System.out.println (words[i]);
            }
        }











    }
}