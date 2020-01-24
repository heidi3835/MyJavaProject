package MyPackage;

public class ArrayHm2 {
    public static void main(String[] args) {
        ArrayHm1 homework = new ArrayHm1();
        homework.getReversedString("Happy");

        double [] arrayForSum = {2,4,6,8,10};
        homework.addNumbersinArray(arrayForSum);

        //4
        double [] arrayToSort ={40,20,30,10};
        homework.sortArrayInAscendingOrder(arrayToSort);

     //5
        double [] arrayForAvarage ={20,40,60,80,100};
        homework.findAverage(arrayForAvarage);

        //6
         double [] arrayForMaximum ={20,10,40,44,32};
         homework.findMaximum(arrayForMaximum);

         //7
        double [] arrayForMinimum ={20,10,30,44};
        homework.findMinimum(arrayForMinimum);

        //8
        String wordForAbbreviation = "Happy new year";
        homework.findAbbreviation(wordForAbbreviation);

        //9
        //int startNumber =2;
       // int length =5 ;
        //homework.fibonacci(startNumber=2, length=5);

        //10 double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
            //String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};

        //
        // homework.findStudentWithHighestScore(sMarks, sNames);//10

        //11
        int sumUpTo =5;
        homework.findSumUpTo(sumUpTo);


    }
    }

