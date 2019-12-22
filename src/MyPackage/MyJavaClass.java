package MyPackage;

public class MyJavaClass {
    public static void main(String[] args) {

       //Question 1
        String myStatement = "I am a good programmer";
        System.out.println(myStatement.substring(11));
        System.out.println("Total number of words : " +myStatement.codePointCount(0,17));
        System.out.println(myStatement.replace('r','f'));

        //Question 2
        String myName = "Hayriye Ozsoy";
        System.out.println("Calculate My Name:" + myName.codePointCount(0,12));

        //Question 3
        String [] names = new String[8];
        names [0] = "Mohammad";
        names [1] = "jhon";
        names [2] = "Ferdous";
        names [3] = "Abdul";
        names [4] = "Ratna";
        names [5] = "Mareela";
        names [6] = "Ruslan";
        names [7] = "Himani";
        System.out.println("JHON".contains(names[1]));

        //Question 4
        String [] friendNames = new String [5];
        friendNames [0] = "Mirna";
        friendNames [1] = "Canay";
        friendNames [2] = "Erica";
        friendNames [3] = "Daphne";
        friendNames [4] = "Yeliz";

        int size = friendNames.length;
        System.out.println("The Array Length is: " + size);
        System.out.println("Number 2 index name:" + friendNames[2]);
        System.out.println("All names of friend: " + friendNames [0] + " " + friendNames[1] + " " + friendNames [2] + " " +friendNames[3] + " " + friendNames[4]);
        System.out.println("2nd position name with A : " +friendNames [2].startsWith("A"));















    }


    }
