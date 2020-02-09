package OopJava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date1 {
    public static void main(String[] args) throws ParseException {
        String dateInString = "06-07-2013";
        DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date date = formatter.parse(dateInString);
        SimpleDateFormat dStrng = new SimpleDateFormat("EEE, MMMM d yyyy");

        System.out.println(dStrng.format(date));

        SimpleDateFormat sdf = new SimpleDateFormat(" EEEE, MMM dd, yyyy HH:mm:ss a");
        Calendar calendar = new GregorianCalendar(2013, 6, 6);
        calendar.set(2013, 06, 07, 12, 10, 56);
        calendar.add(Calendar.MONTH, -1);

        System.out.println(sdf.format(calendar.getTime()));

        System.out.println("***********************************************************");

        // 2'th solution
        String dateInStr = "Fri, Jun 7 2013";
        DateFormat format = new SimpleDateFormat("EEE, MMM d yyyy");
        Date date1 = format.parse(dateInStr);
        SimpleDateFormat frmt =new SimpleDateFormat("EEE, MMMM d yyyy");
        System.out.println(frmt.format(date1));

        String dateS= "Friday jun 7 2013 12:10:56 PM";
        SimpleDateFormat dt = new SimpleDateFormat("EEEEEE MMM d yyyy hh:mm:ss a");
        Date date2 = dt.parse(dateS);
        SimpleDateFormat dt1 = new SimpleDateFormat("EEEEEE, MMM d, yyyy HH:mm:ss a");
        System.out.println(dt1.format(date2));




    }

}