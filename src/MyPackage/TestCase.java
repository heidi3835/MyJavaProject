package MyPackage;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your user name");
        String userName = scan.nextLine();
        String expectedUserName = "daphne";



        String myPassWord = scan.nextLine();
        String expectedPassword = "lifeisgood";


        for (int i = 0; i<5; i++){
            if(!(userName.equals(expectedUserName) && myPassWord.equals(expectedPassword)) ) {


              //int count = 7 -i; it will ask user to enter 7 times user name and password.
              //It does not match the code so it is a bug.
                int count = 5 -i;

                System.out.println("You have " + count + " moore tires");
                System.out.println("Please enter user name");

                userName  = scan.nextLine();

                System.out.println("Please enter password");

                myPassWord = scan.nextLine();

                if (i == 4){
                    System.out.println("Your account is lock for 10 minute");
                }

            }else {
                System.out.println("Welcome to homepage:");
                break;
            }
        }

    }
}

        //         TEST CASE SCENARIO USERNAME AND PASSWORD

        // 1 Use scanner for input value from the console
        // 2 Display username
        // 3 Take input from console and storing the value
        // 4 Setting expected userName which is associated with user account details in database
        // 5 Display user to enter password
        // 6 Take input from console and storing the value into myPassWord variable
        // 7 Take input from console and storing the value expectedPassWord
        // 8 Creating for loop to give user name and password to enter to system maximum tires 5 times
        // 9 Checking if username and exepectedUserName are correct with myPassword and expectedPassword
        // 10 For every wrong tries subtract 1 from  5
        // 11 Console message to let user know how many more attempts she has
        // 12 Console message display to enter user name
        // 13 Letting user update the user name value with new input from console
        // 14 Console message display to user enter password
        // 16 If user puts 5 times invalid user name and password, it will display account is locked for 10 minutes
        // 17 If user enter valid username and password system lets user into home page

