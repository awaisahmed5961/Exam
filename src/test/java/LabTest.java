import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.Assert.*;

public class LabTest {

    @Test
    public void fahrenheitToCentigrade() {
        assertEquals(-8 , Lab.fahrenheitToCentigrade(17));
    }

    @Test
    public void centigradeToFahrenheit() {
        assertEquals(50 , Lab.centigradeToFahrenheit(10));
    }

    @Test
    public void removeSignOfExclaimation() {
         assertNotNull("",Lab.removeSignOfExclaimation(("")));
         assertEquals("hello from Awais" , Lab.removeSignOfExclaimation("hello from Awais!"));

    }

    @Test
    public void getCurrentDay() {
       assertEquals(getcurrentDayHelper() , Lab.getCurrentDay());
    }

    @Test
    public void getCurrentMonth() {
        assertEquals(getMonthHelper() , Lab.getCurrentMonth());
    }

    @Test
    public void getCurrentYear() {
    assertEquals( getCurrentYearHelper() , Lab.getCurrentYear());
    }
    public int getMonthHelper(){
        LocalDate localDate = Lab.today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getMonthValue();
    }
    public int getcurrentDayHelper(){
        LocalDate localDate = Lab.today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getDayOfMonth();
    }
    public int getCurrentYearHelper(){
        LocalDate localDate = Lab.today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear();
    }
}