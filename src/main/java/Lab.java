import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 */
public class Lab {
    static Date today = new Date();

    /**
     * This method will convert fahrenheit temperature to centigrades
     * @param fahrenheit It accept one interger a fahreheit
     * @return This method returns interger value of temperature in centigrade
     */
    public static int fahrenheitToCentigrade(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * This methods  will convert Temperature from centigrade to fahrenheit
     * @param centigrade accepts inter a centigrade temperature
     * @return returns interger value of temperature in fahrenheit
     */
    public static int centigradeToFahrenheit(int centigrade) {
        return centigrade * 9 / 5 + 32;
    }

    /**
     * This Method will remove sign of exclimation in a string
     * @param in a string value
     * @return returns a string by removing exclaimation sign
     */
    public static String removeSignOfExclaimation(String in){
        if(in==null||in.length()==0)
            return in;
        return in.replaceAll("!", "");
    }

    /**
     * This method gets Current Day
     * @return an Integer current day
     */
    public static int getCurrentDay(){
        LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getDayOfMonth();
    }

    /**
     * This method will get current Month
     * @return an Interger value of the current month
     */
    public static int getCurrentMonth(){
        LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getMonthValue();
    }

    /**
     * This method will get current year
     * @return an Interger value of the current Year
     */
    public static int getCurrentYear(){
        LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear();
    }
}
