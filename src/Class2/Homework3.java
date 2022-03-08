package Class2;

public class Homework3 {


    public static void main ( String[] args) {
        /**
         *
         *
         * Refer for formula : https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */

        /**
         * Convert degree-Celsius into Deg-Fahrenheit
         *
         * fT = cT × 5/9 + 32
         *
         */
        double cTemp = 25;
        double fTemp = cTemp * 5/9 + 32;
        System.out.println(cTemp + "°C is equal to " + fTemp + "°F");


        // T(K) = T(°C) + 273.15           --> C to K        C = 100
        double cTemp_1 = 100;
        double kTemp_1 = cTemp_1 + 273.15;
        System.out.println(cTemp_1 + "°C is equal to " + kTemp_1 + "°K");


        // T(°C) = (T(°F) - 32) × 5/9      --> F to C        F = 100
        double fTemp_2 = 100;
        double cTemp_2 = ( fTemp_2 - 32) * 5/9;
        System.out.println(fTemp_2 + "°F is equal to " + cTemp_2 + "°C");


        // T(K) = (T(°F) + 459.67)× 5/9    --> F to K        F = 100
        double fTemp_3 = 100;
        double kTemp_3 = ( fTemp_3 + 459.67) * 5/9;
        System.out.println(fTemp_3 + "°F is equal to " + kTemp_3 + "°K");


        // T(°C) = T(K) - 273.15           --> K to C        K = 300
        double kTemp_4 = 300;
        double cTemp_4 = kTemp_4 - 273.15;
        System.out.println(kTemp_4 + "°K is equal to " + cTemp_4 + "°C");


        // T(°F) = T(K) × 9/5 - 459.67     --> K to F        K = 300
        double kTemp_5 = 300;
        double fTemp_5 = kTemp_5 * 9/5 - 459.67;
        System.out.println(kTemp_5 + "°K is equal to " + fTemp_5 + "°F");




    }
}
