package MyPackage;

public class MidTerm1 {
    public static int[] findMissingNum(int[] missingN) {

        int sum = 0;
        for (int i = 0; i < missingN.length; i++) {
            sum = sum + missingN[i];

        }

        int sum1 = 0;
        for (int j = 1; j <= 7; j++) {
            sum1 = sum1 + j;

        }

        System.out.println("Missing number: " + (sum1 - sum));
        return missingN;

    }
    // question 2 I couldn't solve it

    public static int [] dubNum (int[] number){
        int a =number.length;
        for(int i = 0; i<number.length-1; i++){
            for (int j= i+1; j < number.length; j++){
                if((number[i]==number[j]) && (i !=j)){

                }

            }
        }
        return number;
    }

 // i couldnt find it too i try it
    // question 3

    public static int speed (int speedlimit){
        int penaltyPoint =0;
        for(int i =0; i<speedlimit; i+=5){
            if(100>speedlimit+i){
            }
            System.out.println(speedlimit);
        }



    return speedlimit;
    }



}






