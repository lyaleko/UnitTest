package calculator;

import calculators.EvenOddChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class EvenOddCheckerTest {

    EvenOddChecker checker;
    int num;

    public EvenOddCheckerTest(int num) {
        this.num = num;
        this.checker = new EvenOddChecker();
    }

    @Parameterized.Parameters
    public static List<Integer[]> inputData() {
        return Arrays.asList(new Integer[][]{

        });
    }

    @Test
    public void checkEvenTest() {
        assertTrue("shouldn't be even", this.checker.check(8));
          }
    @Test
    public void checkOddTest() {
       // Assert.assertEquals("Even is incorrect: ", true, this.checker.check(num));
        assertFalse("shouldn't be Odd", this.checker.check(8));
    }
}
