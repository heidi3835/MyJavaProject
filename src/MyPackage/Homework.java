package MyPackage;

import org.w3c.dom.ls.LSOutput;

public class Homework {
    public static void main(String[] args) {
        // Question number 1

        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;
        String menu1 = "Vegan";
        String menu2 = "Mix";
        String menu3 = "Regular";
        if (isGuestOneVegan && isGuestTwoVegan) {
            System.out.println("They eat Vegan:" + menu1);
        } else if (isGuestOneVegan != isGuestTwoVegan) {
            System.out.println("They cannot eat mix menu:" + menu3);
        }

        if (isGuestOneVegan || isGuestTwoVegan) {
            System.out.println("One of the customer can eat regular menu");
        } else {
            System.out.println("They can eat all menu");
        }

        //Question 2
        String forParking = "P";
        String forRegularType = "D";
        String forNeutral = "N";
        String forBackCamera = "R";

        if (forParking == "P") {
            System.out.println("I can park between two cars");
        } else if (forParking != "P") {
            System.out.println("I cannot park it");
        }
        if (forRegularType == "D") {
            System.out.println("I can use sport type");
        } else if (forRegularType == "D") {
            System.out.println("I cannot use sport type");
        }
        if (forNeutral == "N") {
            System.out.println("I can wash my car without using P mode");
        } else if (forNeutral != "N") {
            System.out.println("I cannot wash my car ");
        }
        if (forBackCamera == "R") {
            System.out.println("I can activate back camera with R mode");
        } else if (forBackCamera != "R") {
            System.out.println("I cannot activated without R mode ");
        } else {
            boolean b = forNeutral == "R";
        }
        {
            System.out.println("Invalid mode type:" + forNeutral + "R");
        }


        //Question 3
        int number = 30;
        int remainder = 15;

        if (number % remainder == 0) {
            System.out.println("Number is divided by 15");
        } else {
            System.out.println("Remainder");
        }


        //Questin 4
        String myname = "Hayriye Ozsoy";
        if (myname.length()>=8){
            System.out.println(myname.replace('a', 'A').toUpperCase());
        }


        //Question 5
        int [] numbers ={5,10,20,30,50};
        if (numbers[5]==0){
            System.out.println("it doesnt work");
        } else if (numbers [10]==0){
            System.out.println("it doesnt work");
        }if (numbers[20]==0){
            System.out.println("it doesnt work");

        }else if (numbers[30]==0){
            System.out.println("it doesnt work");
        }if (numbers[40]==0){
            System.out.println("it doesnt work");
        }else if (numbers[50]==0){
            System.out.println("it doesnt work");
        }else {
            System.out.println("Array from index last to 0");
        }


        //Question 6

        int milk = '8';
        switch(milk){
            case '1':
                System.out.println("Aisle one Diapers should be aisle");
                break;

            case '2':
                System.out.println("Aisle two Apple and oranges should be this aisle");
                break;

            case '3':
                System.out.println("Aisle three Candy should be this aisle ");
                break;

            case '4':
                System.out.println("Aisle four Kitchen stuff should be this aisle");

                break;

            case '5':
                System.out.println("Aisle five Internetonial food should be this aisle");
                break;

            case '6':
                System.out.println("Aisle seven Frozen food should be this aisle");
                break;

            case '7':
                System.out.println("Aisle seven Soda should be this aisle");
                break;

            case '8':
                System.out.println("Aisle eight milk out of stock");
                break;

            case '9':
                System.out.println("Aisle nine ");
                break;

            default :
                System.out.println("invalid number");



        }

    }

    }




