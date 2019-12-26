package MyPackage;

public class Homework{
    public static void main(String[] args) {
        // Celsius to Kelvin
        // T(K) = 20°C + 273.15 = 293.15 K
        double celcius = 20;
        double kelvin = (celcius+ 273.15);
        System.out.println(kelvin);

        // Celsius to Fahrenheit
        // T(°F) = T(°C) × 9/5 + 32
        double celcius2 = 45;
        double fahrenheit =(celcius2) * 9/5 + 32;
        System.out.println(fahrenheit);

        //Kelvin to Celcius
        // T(°C) = 300K - 273.15 = 26.85 °C
        double kelvin2 = 300;
        double celcius3 =(kelvin2 - 273.15);
        System.out.println(celcius3);

        //Kelvin to Fahrenheit
        //T(°F) = T(K) × 9/5 - 459.67
        double kelvin3 = 400;
        double fahrenheit2 =(kelvin3) * 9/5 - 459.67;
        System.out.println(fahrenheit2);




    }
    }










