import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Leap_Years {
    /*
    These are the criteria for leap years:

        - Has to be divisible by 4, but not 100
        - Has to be divisible by 400

    These are the criteria for non-leap years:

        - It is not divisible by 4
        - It is divisible by 100, but not 400

     */

    // Testing the isLeapYear method to see if
    @Test
    public void Year_2020_is_divisible_by_4_and_not_100() {
        assertTrue(Main.isLeapYear(2020));
    }

    @Test
    public void Year_2004_is_divisible_by_4_and_not_100() {
        assertTrue(Main.isLeapYear(2004));
    }

    @Test
    public void Year_2017_is_not_divisible_by_4() {
        assertFalse(Main.isLeapYear(2017));
    }

    @Test
    public void Year_1882_is_divisible_by_100_but_not_400() {
        assertFalse(Main.isLeapYear(1882));
    }

}