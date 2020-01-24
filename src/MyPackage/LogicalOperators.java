package MyPackage;

public class LogicalOperators {
    public static void main(String[] args){

        // Celsius to Kelvin
        // T(K) = 20°C + 273.15 = 293.15 K
        //double celcius = 20;
        //System.out.println(celcius + 273.15);

        // Celsius to Fahrenheit
        // T(°F) = T(°C) × 9/5 + 32
       // double celcius1 = 45;
        //System.out.println(celcius1 * 9/5 + 32);

        //Kelvin to Celcius
        // T(°C) = 300K - 273.15 = 26.85 °C
        //double kelvin2 = 300;
        //System.out.println(kelvin2 - 273.15);

        //Kelvin to Fahrenheit
        //T(°F) = T(K) × 9/5 - 459.67
        //double kelvin3 = 400;
        //System.out.println(kelvin3 * 9/5 - 459.67);


        String word = "racecar";
        String reversedString = "";

        char [] strArr = word.toCharArray();

        for(int i = strArr.length -1; i >= 0; i--){
            reversedString=reversedString + strArr[i];

        }
        System.out.println(reversedString);

        //3.Write a logic that checks if a number is a Prime number}
        int num =4;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
            if (count > 0) {
                System.out.println("the number is not prime");
            } else {
                System.out.println("the number is prime:");
            }


        }
        String myString = "reverse";
        int stringlen = myString.length();
        String reverse = "";
        




        }

    }

