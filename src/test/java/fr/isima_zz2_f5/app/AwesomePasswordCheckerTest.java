package fr.isima_zz2_f5.app;
package fr.isima.codereview.tp1;

// import static org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AwesomePasswordCheckerTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void maskAffTest() {
		int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
		String input = new String("abEC5!~");
		int[] result = maskAff(input);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
