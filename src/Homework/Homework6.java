package Homework;

import java.util.Arrays;

public class Homework6 {
    public static void main (String[] args) {

        // Due date: Mar 22, 2022
        /**
         * Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         *
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        //Q1:
        System.out.println("*** Q1 for loop ***");
        String sentence1 = "happy birthday to you my dear friend more mORe";
        System.out.println("Original String Value ---> " + sentence1);
        String abbr = "";
        String[] sentenceToSplit = sentence1.split(" ");
        for ( int i = 0 ; i < sentenceToSplit.length ; i++ ) {
            abbr = abbr + sentenceToSplit[i].toUpperCase().substring(0,1);
        }
        System.out.println("Abbreviation is ---> " + abbr.trim());

        System.out.println("\n*** Q1 Enhanced for loop ***");
        String sentence_1 = "happy birthday to you my dear friend more mORe";
        System.out.println("Original String Value ---> " + sentence_1);
        String abbreviation = "";
        String[] sentence_ToSplit = sentence_1.split(" ");
        for ( String abbrev : sentence_ToSplit) {
            abbreviation += abbrev.toUpperCase().substring(0,1);

        }
        System.out.println("Abbreviation is ---> " + abbreviation.trim());

        System.out.println("\n*** Q1 While loop ***");
        String sentence1_W = "happy birthday to you my dear friend more";
        System.out.println("Original String Value ---> " + sentence1_W);
        String abbr_W = "";
        int j = 0;
        String[] sentenceToSplit_W = sentence1_W.split(" ");
        while ( j < sentenceToSplit_W.length ) {
            abbr_W += sentenceToSplit_W[j].toUpperCase().substring(0,1);
            j++;
        }
        System.out.println("Abbreviation is ---> " + abbr_W.trim());

        System.out.println("\n*** Q1 do While loop ***");
        String sentence_W = "happy birthday to you my dear friend";
        System.out.println("Original String Value ---> " + sentence_W);
        String answer = "";
        int g = 0;
        String[] sentToSplit = sentence_W.split(" ");
        do {
            answer += sentToSplit[g].toUpperCase().substring(0, 1);
            g++;
        } while (g < sentToSplit.length);
        System.out.println("Abbreviation is ---> " + answer.trim());




        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make
         * good Morning -> Morning good
         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */
        //Q2:
        System.out.println("\n\n*** Q2 for loop ***");
        String sentence2 = "make america great again again again";
        System.out.println("Original String ---> " + sentence2);
        String reverseSentence = "";
        String[] sentence2_S = sentence2.split(" ");
        for ( int i = 1 ; i <= sentence2_S.length ; i++ ) {
            reverseSentence += sentence2_S[sentence2_S.length-i] + " " ;
        }
       System.out.println("Reverse String ---> " + reverseSentence.trim());

        System.out.println("\n*** Q2 While loop ***");
        String sentence_2 = "make america great again again again";
        System.out.println("Original String ---> " + sentence_2);
        String reverse_Sentence = "";
        int w = 1;
        String[] sentence_2_S = sentence_2.split(" ");
        while ( w <= sentence_2_S.length) {
            reverse_Sentence += sentence_2_S[sentence2_S.length-w] + " ";
            w++;
        }
        System.out.println("Reverse String ---> " + reverse_Sentence.trim());


        System.out.println("\n*** Q2 do While loop ***");
        String sentenceOrigi = "make america again again";
        System.out.println("Original String ---> " + sentenceOrigi);
        String SentenceReverse = "";
        int i = 1;
        String[] sentenceToSpli = sentenceOrigi.split(" ");
        do {
            SentenceReverse += sentenceToSpli[sentenceToSpli.length-i] + " ";
            i++;

        } while (i <= sentenceToSpli.length) ;
        System.out.println("Reverse String ---> " + SentenceReverse.trim());





        /**
         * Q3:
         * Convert the String value in to Titlecase
         *
         * make america great again -> Make America Great Again
         * gOOd morNING -> Good Morning
         * learn -> Learn
         * happy birTHday TO yOu -> Happy Birthday To You
         *
         */
        //Q3:
        System.out.println("\n\n*** Q3 for loop ***");
        String sentence3 = "happy birTHday TO yOu";
        System.out.println("Original String ---> " + sentence3);
        String titlecase = "";
        String[] sentence3_Spli = sentence3.split(" ");
        for ( int k = 0 ; k <= sentence3_Spli.length-1 ; k++ ) {
            titlecase += sentence3_Spli[k].substring(0,1).toUpperCase() + sentence3_Spli[k].substring(1).toLowerCase() + " ";
        }
        System.out.println("Title case ---> " + titlecase.trim());

        System.out.println("\n*** Q3 Enhanced for loop ***");
        String sentence3_E = "happy birTHday TO yOu";
        System.out.println("Original String ---> " + sentence3_E);
        String titlecase_E = "";
        String[] sentence3_Split = sentence3_E.split(" ");
        for ( String title : sentence3_Split ) {
            titlecase_E += title.substring(0,1).toUpperCase() + title.substring(1).toLowerCase() + " ";
        }
        System.out.println("Title case ---> " + titlecase_E.trim());

        System.out.println("\n*** Q3 While loop ***");
        String sentence3_W = "happy birTHday TO yOu";
        System.out.println("Original String ---> " + sentence3_W);
        String titlecase_W = "";
        int x = 0;
        String[] sentence3_Split_W = sentence3_E.split(" ");
        while ( x <= sentence3_Spli.length-1 ) {
            titlecase_W += sentence3_Split_W[x].substring(0,1).toUpperCase() + sentence3_Split_W[x].substring(1).toLowerCase() + " ";
            x++;
        }
        System.out.println("Title case ---> " + titlecase_W.trim());

        System.out.println("\n*** Q3 do While loop ***");
        String orig = "happy birTHday TO yOu";
        System.out.println("Original String ---> " + orig);
        String title_case = "";
        int y = 0;
        String[] sentence3_ToSplit = orig.split(" ");
        do {
            title_case += sentence3_ToSplit[y].substring(0,1).toUpperCase() + sentence3_ToSplit[y].substring(1).toLowerCase() + " ";
            y++;
        } while (y <= sentence3_Spli.length-1);
        System.out.println("Title case ---> " + title_case.trim());




        /**
         * Q4:
         * Find the minimum value from the given array
         *
         * int[] numbers = {-1, 1};     ->  -1
         * int[] numbers = {1, 21, 87, 23};     -> 1
         * int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
         */
        //Q4:
        System.out.println("\n\n*** Q4 for loop ***");
        int[] numbers = {1, 21, 87,-1, 23};
        System.out.println("Original array ---> " + Arrays.toString(numbers));
        int result = numbers[0] ;
        for ( int q = 0 ; q <= numbers.length-1 ; q++ ) {
            if ( result > numbers[q]) {
                 result = numbers[q] ;
            }
        }
        System.out.println("Mimimum value ---> " + result);

        System.out.println("\n*** Q4 while loop ***");
        int[] number = {87, 23, 89, 54, 23};
        System.out.println("Original array ---> " + Arrays.toString(number));
        int res = number[0];
        int z = 0 ;
        while ( z <= number.length-1 ) {
            if ( res > number[z]) {
                res = number[z] ;
            }
            z++;
        }
        System.out.println("Mimimum value ---> " + res);

        System.out.println("\n*** Q4 do while loop ***");
        int[] numberOrig = {87, 23, 89, 0, 54, 23,5};
        System.out.println("Original array ---> " + Arrays.toString(numberOrig));
        int minimumVal = number[0];
        int d = 0 ;
        do {
            if (minimumVal > numberOrig[d]) {
                minimumVal = numberOrig[d];

            }
            d++;
        } while (d <= numberOrig.length - 1) ;
        System.out.println("Mimimum value ---> " + minimumVal);



    }
}
