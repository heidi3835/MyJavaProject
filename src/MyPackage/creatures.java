package MyPackage;

public class creatures {
      public static void main(String[] args) {

            mammal restourant = new mammal();
            restourant.getGuestCapasity();
            System.out.println("Guest capacity :" + restourant.getGuestCapasity());

            System.out.println(restourant.getGuestCapasity());
            System.out.println(restourant.getGuestCount());
            System.out.println(restourant.getRestourantSummary());
            restourant.addCustomer();
            restourant.setGuestCapasity(30);
            restourant.setGuestCount(15);
            restourant.getRestourantSummary();
      }


      }


