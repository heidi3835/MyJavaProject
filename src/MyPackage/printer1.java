package MyPackage;

public class printer1 {

    private int amountOfPaper=0;
    private int tonerLevel=50;


    public int printPages(int printPage, boolean isSinglePage) {
    if (printPage > 100) {
        System.out.println("Maximum pages to print is 100");
    } else if (amountOfPaper == 0) {
        System.out.println("No paper ");
    } else if (tonerLevel < 1) {
        System.out.println("Toner is low. Please add more toner.");
    } else if (isSinglePage ) {
        amountOfPaper = amountOfPaper - printPage;
        tonerLevel = tonerLevel - printPage;
        System.out.println("Number of pages printed " + printPage);


    } else {
        amountOfPaper = amountOfPaper - (printPage / 2);
        tonerLevel = tonerLevel - printPage;
        System.out.println("Number of pages printed " + printPage / 2);

    }
    return printPage;
}
    // check the level of toner
    public int checkLevelOfToner() {
        System.out.println("Level of toner is " + tonerLevel);
        return this.tonerLevel;
    }

    public static void main(String[] args) {

            printer1 print = new printer1();
            print.checkLevelOfToner();
            print.printPages(50,true);
        System.out.println(print.checkLevelOfToner());


        }


    }



