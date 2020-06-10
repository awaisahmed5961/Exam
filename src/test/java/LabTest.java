import org.junit.Test;

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

    }

    @Test
    public void getCurrentDay() {
    }

    @Test
    public void getCurrentMonth() {
    }

    @Test
    public void getCurrentYear() {

    }
}