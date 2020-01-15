package MyPackage;

public class ArrayHomeWork {
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
        int num = 251532040;
        String numberString = String.valueOf(num);
        String reverse = "";

        for (int i = numberString.length() - 1; i >= 0; i--) {
            reverse = reverse + numberString.charAt(i);

        }
        System.out.println(numberString.valueOf(reverse));

        // Question 3

        int[] y = {20, 10, 40, 44};
        int sum = 0;
        for (int i = 0; i < y.length; i++)
            sum = sum + y[i];

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
        for(int i =0; i <array.length; i++) {
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
        double  maxNum []={20,10,40,44};
        double largeNumber = maxNum[0];

        for (int i = 0; i < maxNum.length; i++) {
            if (maxNum[i] < largeNumber) ;
            largeNumber = maxNum[i];
        }
        System.out.println(largeNumber);




        //Question 7
        // Find minimum number in given array

        double [] values = {20,10,40,44};
        double smallest = values[0];
        for(int i = 0 ; i < values.length; i++){
            if(values[i] < smallest){
                smallest = values[i];

            }
        }
        System.out.println(smallest);


        // Question 8
        String n = "Good morning";
        String abb ="";
         char [] stArr2 = n.toCharArray();
         for (int i =0; i<n.length();i++){
             abb = abb + n.charAt(i);


         }
        System.out.println(abb.charAt(0) + " " + abb.charAt(5));


         // Question 9
        double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String [] sNames = {"Happy","Peace", "Jessie", "Kaitlin", "Amir", "Donalt", "Steven", "Vicky", "Hannah"};





        // Question 10
        int number3 =15;
         int add = 0;
         for (int i = 1; i<+ 10; i++){
             add = add + i;

         }
        System.out.println(add);

    }
    }