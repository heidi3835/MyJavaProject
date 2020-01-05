package MyPackage;

public class MyJavaClass {


    public static void main(String[] args) {

        ////Homework:
        ////1.Students score, total possible score
        //// 15/20 -> You got a C (75%)
        //// A 90-100, B 80-89, C 70-79, D 60-69, F 0-59
        int score = 55;
        int maxPercent = 100;
        int percent = (score * 100) / maxPercent;

        if (percent >= 90) {
            System.out.println("Grade A");
        } else if (percent > +80) {
            System.out.println("Grade B");
        } else if (percent >= 70) {
            System.out.println("Grade C");
        } else if (percent >= 60) {
            System.out.println("Grade D");
        } else if (percent >= 50) {
            System.out.println("Grade E");
        } else if (percent >= 40) {
            System.out.println("Grade F");
        }

        //2. Write a logic that prints multiplication table of the user provided number upto ten.

          int x = 1;
           for (int i= 1; i <= 10; i++) {
               System.out.println(10 + " * " + i + " = " + 10 * i);

           }

           //3.Write a logic that checks if a number is a Prime number}
            int num = 4;
            int count = 0;

            for (int i= 2; i <= num; i++) {
                if (num % i == 0) {
                    count = count + 1;
                }
                if (count > 0) {
                    System.out.println("the number is not prime");
                }
                else {


                    System.out.println("the number is prime:");
                }


            }





    }}