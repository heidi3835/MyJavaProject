package MyPackage;

public class mammal {


    private String name;
    private int  guestCapasity;
    private int  guestCount;
    private int  restourantSummary;

    public mammal (){
        name = "i hope";
        guestCapasity = 20;
        guestCount = 15;
        restourantSummary = 0;

    }

    public void printSummary() {
        System.out.println("name" + name);
        System.out.println("guestCapacity" + guestCapasity);
        System.out.println("guestCount" + guestCount);
        System.out.println("restourntSummary" + restourantSummary);
    }
    public String getName (){
        return name =name;
    }


    public int getGuestCapasity() {
       return guestCapasity = guestCapasity;

    }

    public int getGuestCount (){
        return guestCount = guestCount;

    }

    public int getRestourantSummary() {
        return restourantSummary;

    }

    public void setName( String name){
        String name1 = this.name;
    }



    public void setGuestCapasity(int guestCapasity) {
        this.guestCapasity = guestCapasity-guestCount;
    }

    public void setGuestCount(int guestCount) {
        if(guestCount <  guestCapasity ){
            System.out.println("you need to wait 30 minutes");

        }else{
            System.out.println("welcome to restaurant");
        }

        this.guestCount = guestCount;
    }

    public void setRestourantSummary(int restourantSummary) {
        this.restourantSummary = restourantSummary;
    }

    void  addCustomer (){

     }



}


