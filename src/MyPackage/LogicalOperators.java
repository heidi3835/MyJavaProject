package MyPackage;

public class LogicalOperators {
    public static void main(String[] args){

        // Celsius to Kelvin
        // T(K) = 20°C + 273.15 = 293.15 K
        double celcius = 20;
        System.out.println(celcius + 273.15);

        // Celsius to Fahrenheit
        // T(°F) = T(°C) × 9/5 + 32
        double celcius1 = 45;
        System.out.println(celcius1 * 9/5 + 32);

        //Kelvin to Celcius
        // T(°C) = 300K - 273.15 = 26.85 °C
        double kelvin2 = 300;
        System.out.println(kelvin2 - 273.15);

        //Kelvin to Fahrenheit
        //T(°F) = T(K) × 9/5 - 459.67
        double kelvin3 = 400;
        System.out.println(kelvin3 * 9/5 - 459.67);
        







    }
}
