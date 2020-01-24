package MyPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {

        // Question 1
        String name = "sample";
        String reversedString = "";

        char[] stArr = name.toCharArray();
        for (int i = stArr.length - 1; i >= 0; i--) {
            reversedString = reversedString + stArr[i];

        }
        System.out.println(reversedString);

        // Question 2
        int[] array1;
        array1 = new int[]{25, 15, 3, 2, 40};
        System.out.println("Original array: " + Arrays.toString(array1));
        for (int i = 0; i < array1.length / 2; i++) {

            int temp = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = temp;
        }

        System.out.println("Reverse array: " + array1.toString());


        int num = 12345;
        String numberString = String.valueOf(num);
        String reverse = "";

        for (int i = numberString.length() - 1; i >= 0; i--) {
            reverse = reverse + numberString.charAt(i);

        }
        System.out.println(numberString.valueOf (reverse));

        //other example it is working
        //int [] a = new int [] {1,2,3,4,5,6,7,8,9,10};
        //int n = a.length;
        //int[] b = new int[n];
        //for(int i = 0; i< n;i++){
        //int temp = a[i];
        // b[i]=a[n-i-1];
        //a[i]=temp;
        // System.out.print(b[i]);
        //}

        //other example
        //int[] a1 = {40, 2, 3, 15, 25};
        //int number = a1.length;
       // int[] b1 = new int[number];

        //for (int i = 0; i < number; i++) {
          //  b1[i] = a1[number - i - 1];

        //}
        //for (int i = 0; i < number; i++) {
          //  a1[i] = b1[i];

        //}

        //for (int i = 0; i < number; i++) {
          //  System.out.println(a1[i]);
       // }

        // question 3
        int hay []={5,5,5};
        int total = 0;

        for(int x =0; x<hay.length; x++){
            total=total+hay[x];
            System.out.println("total number" + total + "." );

            }
        int [] y ={10,10,10};
        int sum = 0;
        for(int i=0; i <y.length;i++)
        sum=sum+ y[i];

        System.out.println(sum);


        //Question 4
        int array []={20,10,40,44};
        int temp;

        for(int i = 1; i<array.length;i++){
            for (int j= 1; j >0; j--){
                if (array[j]<array[j-1]){
                    temp=array[j];
                    array [j] = array[j-1];
                    array[j-1]=temp;


                }
            }
        }
            for(int i =0; i <array.length; i++){
                System.out.println("Sort of array:" + array[i]);
            }

         //Question 5
         // Find a Average of array;

        double numA []={20,10,40,44};
            double tot = 0;

            for(int i = 0; i<numA.length; i++){
                tot =tot + numA [i];

            }
            double average = tot / numA.length;

        System.out.println("The average is :" + average);


         // Question 6
        // Find maximum number in given array
        double  maxNum []={1, 2, 3, 4, 5};
        double largeNumber = maxNum[0];

        for (int i = 0; i < maxNum.length; i++){
            if(maxNum[i] < largeNumber);
            largeNumber = maxNum[i];

        }

        System.out.println(largeNumber);


        //Question 7
        // Find minimum number in given array

        double [] values = {81,52,33,95,18,4,7};
        double smallest = values[0];
        for(int i = 0 ; i < values.length; i++){
            if(values[i] < smallest){
                smallest = values[i];

            }
        }
        System.out.println(smallest);

        //Question 8
        // Create abbreviation for any string

        //Question 9
        double [] sMarks = {90, 89, 91, 67, 87 ,88 ,93, 90, 100, 81, 54};
        String [] sNames = {"Happy", "Peace", "Jesse", "Kaitlin", "Amir", "Donald", "Steven", "Vicky", "Hannah","David","Gia" };
        int nah = sMarks.length;
        int nah1 = sNames.length;


        for( int i =0;i<sMarks.length; i++){
            for (int j =0; i< sNames.length;i++){
                nah = nah + nah1;
                nah1 =nah1 +nah;
                

            }
            System.out.println(nah);
        }
         int []num5 ={1,2,3,4,5};
        





        }

    }















