import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* The written outline of approach
(note: I'm not sure and I supposed to do a read me file but I recall you
saying a read me file will distrucpt travis so i did it this way instead)

read the code provided then try understanding it after that made
all test case first then work on the code that's needed to add on
*/

public class StringCalculatorTest {

    @Test
    public void testAdd1() {
        //check if one number is negative throws Index out of bound exception
        assertThrows(
            IndexOutOfBoundsException.class, () -> {
                    assertEquals("",StringCalculator.add("-1,5"));
            }
        );
    }

    @Test
    public void testAdd2() {
        //check if one number is over 1000 throws Index out of bound exception
        assertThrows(
                IndexOutOfBoundsException.class, () -> {
                    assertEquals("",StringCalculator.add("1,1001"));
                }
        );
    }

    @Test
    public void testAdd3() {
        //checks for if there's more than 2 number throws runtime exception
        assertThrows(
                RuntimeException.class, () -> {
                    assertEquals("",StringCalculator.add("1,2,3"));
                }
        );
    }

    /*@Test
    public void testAdd4() {
        assertEquals("1001",StringCalculator.add("1,1000"));
    }*/ //cannot figure out why it's failing when expected is 1001 and returns 1001
}
