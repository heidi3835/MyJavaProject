package MyPackage;

public class Tempeture {

    // Question 1
    public static double celsiusToKelvin(double c){
        double kelvin = (c + 273.15);
        return kelvin;
    }
    // Question 2
    public static double celsiusToFahrenheit(double c){
        double fahrenheit = (c * 9/5) + 32;
        return fahrenheit;
    }

    // Question 3
    public static double kelvinToCelsius(double k) {
        double celsius2 = (k - 273.15);
        return celsius2;
    }

    // Question 4
    public static double kelvinToFahrenheit(double k){
        double fahrenheit2 = (k * 9/5 - 459.67);
        return fahrenheit2;

    }

    public static void main(String[] args) {

        Tempeture tempeture = new Tempeture();

        // Question 1
        double celsius = celsiusToKelvin(10);
        if (celsius > 300){
            System.out.println("");
        }
        else {

            System.out.println("Kelvin result: " + " " + celsiusToKelvin(10));
        }

        // Question 2
        double fahrenheit = celsiusToFahrenheit(30);
        if(fahrenheit > 80){
            System.out.println("It is nice outside:" + " " + celsiusToFahrenheit(30));
        }
        else {
            System.out.println("It is cold outside");
        }

        // Question 3
        double celsius2 = kelvinToCelsius(310.15);
        if(celsius2 < 200){
            System.out.println("It is hot outside: " + " " + kelvinToCelsius(310.15));

        }
        else{
            System.out.println("It is freezing outside");
        }

        //Question 4
        double fahrenheit2 = kelvinToFahrenheit(300);
        if (fahrenheit2 <100){
            System.out.println("I can go to picnic :" + " " + kelvinToFahrenheit(300));
        }
        else{
            System.out.println("It is cool outside stay at home ");
        }
    }


}
