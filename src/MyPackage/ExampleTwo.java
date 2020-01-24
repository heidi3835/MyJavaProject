package MyPackage;

import java.util.Scanner;

/**public class ExampleTwo {
    public static void main(String[] args) {

        // instance of scanner
        Scanner scan = new Scanner(System.in);
        // Tell user to enter password
        System.out.println("Please enter your password");
        // Takes input from console and s1234
        // toring the value into actualPassword variable
        String actualPassword = scan.nextLine();
        // Setting expected password which is associated with user account details in database
        String expectedPassword = "technosoft";

        //Crating for loop to give user max tries to enter valid password and log the user to system if
        // correct password is entered
        for(int i=0; i<10; i++){
            //checking if actual password is nor equal to expected password
            if(actualPassword.equals(expectedPassword)){
                // subtracting the count by iteration so user will have less tries (-1 every tries)
                int count = 10 - i;

                // console message to user enter valid password
                System.out.println("Please enter the valid password");

                // console your message to let user know how many more tries he has left with
                System.out.println("YOu have " + count + " more tires" );

                //Letting user to update the actualPassword value with new input from console
                actualPassword = scan.nextLine();

                //If account equals to 9, then notifying user with custom message
                if (i==9){
                    System.out.println("Your account will be locked for 15 minutes");
                }

            }else {
                //if any point in the loop user enters correct password then system let user into home page
                System.out.println("Welcome to home page");
                break;
            }

        }


    }
}**/
