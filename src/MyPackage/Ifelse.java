package MyPackage;

import jdk.swing.interop.SwingInterOpUtils;

public class Ifelse {
    public static void main(String[] args) {

        int hour = 1900;
        if (hour >= 0600 && hour < 1800) {
            System.out.println("good morning");
        } else if (hour >= 1200 && hour < 1800) {
            System.out.println("good evening");
        } else {
            System.out.println("good night ");
        }


        // second example
        boolean isAccountLocked = false;
        String userRole = "user";

        if (isAccountLocked == true) { //if i put false run shows "account is locked"
            System.out.println("account is locked");
        } else if (userRole.equals("admin")) {
            System.out.println("welcome admin user");
        } else {
            System.out.println("welcome to account ");
        }


        // other example of if else

        int temp = 45;
        if (temp <= 30) {
            System.out.println("it is freezing");
        } else if (temp >= 100) {
            System.out.println("it is very hot");
        } else {
            System.out.println(" it is nice outside");
        }


        // other example of if else
        int checkingBalance = 1000;
        int iponeInventory = 10;
        int creditScore = 700;

        if (checkingBalance >= 1000 && iponeInventory > 0) {
            System.out.println("you can purchase iphone");
        } else if (creditScore > 600 || checkingBalance > +1000) {
            System.out.println("you are eligible ");
        } else {
            System.out.println("you are not eligible to buy iphone ");
        }


        // other example
        int tempt = 74;
        String weatherType = "hot";
        if (tempt < 32) {
            System.out.println("it is cold outside");
            if (weatherType.equals("snow")) {
                System.out.println("please wear coat");
            } else {
                System.out.println("it is not snowing");
            }
        } else {
            System.out.println("invalid weather details");
        }


        // switch example of if else
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("exellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You Passes");
                break;
            case 'F':
                System.out.println("Try it again");
                break;
            default:
                System.out.println("Invalid grade");


        }
        // other example of java
        String month = "November";
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("the mont of" + " " + month + " " + "winter");
            case "March":
            case "April":
            case "May":
                System.out.println("the mont of" + " " + month + " " + "spring");
            case "june":
            case "july":
            case "August":
                System.out.println("the mont of" + " " + month + " " + "summer");
            case "September":
            case "October":
            case "November":
                System.out.println("the month of" + " " + month + " " + "Autumn");
            default:
                System.out.println();

        }
        int num = 11;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }

            if (count > 0) {
                System.out.println("number is not prime");
            } else {
                System.out.println("number is prime");


            }


        }
    }
}