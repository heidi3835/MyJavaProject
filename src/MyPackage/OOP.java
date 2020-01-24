package MyPackage;

public class OOP {



   //Question 1 Celsius to Kelvin
   public static double convertCelsius(double kelvin) {
       double celsius = (kelvin + 273.15);
       return celsius;

   }

    public static void main(String[] args) {
       // System.out.println(convertCelsius(300));
        double celsius = convertCelsius(300);
        if (celsius >300){
            System.out.println("It WILL BE GAS");
        }
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsiusToFahrenheit(30));

        System.out.println(kelvinToCelsius(30));
    }



     public static double celsiusToFahrenheit(double celsius){
       double fahrenheit = ( celsius * 9/5 )+32;
       return fahrenheit;

     }
     public static double kelvinToCelsius(double celsius){
       double kelvin = (celsius - 273.15);
       return celsius;


     }


    }













