import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class watermelonTest {

    @Test
    public void  watermelon (){
        watermelon watermelon  = new watermelon();

        assertEquals("yes",watermelon.watermelon(6));
        assertEquals("yes",watermelon.watermelon(10));
        assertEquals("no",watermelon.watermelon(7));
        assertEquals("no",watermelon.watermelon(15));
    }





    @Test
    public void is_valid() {
        int[] testcases = {-200,-100,-5, 0, 1, 2, 8, 55, 100, 105};
        boolean valid = true;
        for (int i = 0; i <= 7; i++) {
            watermelon physicist = new watermelon();
            if (physicist.is_valid(testcases[i]) == true && (testcases)[i] < 1 || testcases[i] > 100)
                valid = false;
            break;
        }
        assertTrue(valid);
    }
}