package MyPackage;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**public class Exaple {
   /** public static void main(String[] args) {
        String [] months ={"jan", "feb", "march", "april","may","june","july","august","september","october","november","december"};

        for(String month : months){
            boolean isTrue =month.equalsIgnoreCase("december");
            if (isTrue){
                System.out.println("December is here");
                break;
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");

        String actualPassword = scan.nextLine();
        String expectedPassword = "technosoft";

        for(int i = 0; i < 10; i++){
            if(expectedPassword.equals(actualPassword)){

                int count = 10 - i;
                System.out.println("Please enter valid password ");

                System.out.println("You have " + count + " more tries");
                 actualPassword = scan.nextLine();
                 if (i == 9){
                     System.out.println("Your account will be locked 15 min");
                 }
                 else{
                     System.out.println("Welcome to home page");
                     break;
                 }
            }
        }



    }
 } **/
